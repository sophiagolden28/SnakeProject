/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegame;

/**
 *
 * @author not me
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.util.Scanner;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    private class Tile {

        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    String playerName;

    //snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody;

    //food
    Tile food;
    Random random;

    //game logic
    int velocityX;
    int velocityY;
    Timer gameLoop;
    int color;

    boolean gameOver = false;
    
    int highScore;

    SnakeGame(int boardWidth, int boardHeight, String name, Integer colorNumb) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.playerName = name;
        this.color = colorNumb;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();

        food = new Tile(10, 10);
        random = new Random();
        placeFood();

        velocityX = 1;
        velocityY = 0;

        //game timer
        gameLoop = new Timer(100, this); //how long it takes to start timer, milliseconds gone between frames 
        gameLoop.start();
        
        try{
            File highscore = new File("highscore.txt");
            Scanner sc = new Scanner(highscore);
            highScore = sc.nextInt();
        }catch(FileNotFoundException e){
            highScore = 0;
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //SCORE AND HIGH SCORE TRACKERS ADDED
        int score = snakeBody.size();
        //int highScore = 0;

        //Grid Lines
        for (int i = 0; i < boardWidth / tileSize; i++) {
            //(x1, y1, x2, y2)
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        }

        //Food
        g.setColor(Color.red);
        // g.fillRect(food.x*tileSize, food.y*tileSize, tileSize, tileSize);
        g.fill3DRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize, true);

        //Snake Head
        if (color == 0) {

            g.setColor(Color.BLUE);

        } else if (color == 1) {

            g.setColor(Color.GREEN);

        } else if (color == 2) {

            g.setColor(Color.RED);

        } else if (color == 3) {

            g.setColor(Color.YELLOW);

        }

        // g.fillRect(snakeHead.x, snakeHead.y, tileSize, tileSize);
        // g.fillRect(snakeHead.x*tileSize, snakeHead.y*tileSize, tileSize, tileSize);
        g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize, true);

        //Snake Body
        for (int i = 0; i < snakeBody.size(); i++) {
            Tile snakePart = snakeBody.get(i);
            // g.fillRect(snakePart.x*tileSize, snakePart.y*tileSize, tileSize, tileSize);
            g.fill3DRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize, true);
        }
        
        //HighScore
        g.setColor(Color.green);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString("High Score: " + highScore, tileSize - 16, tileSize);

        //Score
        g.setColor(Color.GREEN);

        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver) {
            g.setColor(Color.red);
            g.drawString("Game Over: " + String.valueOf(snakeBody.size()), tileSize - 16, tileSize + 30);
        } else {
            g.drawString("Score: " + String.valueOf(snakeBody.size()), tileSize - 16, tileSize + 30);
        }

        //Name
        g.setColor(Color.YELLOW);
        g.drawString(playerName.toUpperCase(), tileSize - 16, tileSize + 60);
        

        //game restart message
        if (gameOver) {

            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Press Space to play again", 175, tileSize + 470);

        }

    }

    public void placeFood() {
        food.x = random.nextInt(boardWidth / tileSize);
        food.y = random.nextInt(boardHeight / tileSize);
    }

    public void move() {
        //eat food
        if (collision(snakeHead, food)) {
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }

        //move snake body
        for (int i = snakeBody.size() - 1; i >= 0; i--) {
            Tile snakePart = snakeBody.get(i);
            if (i == 0) { //right before the head
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            } else {
                Tile prevSnakePart = snakeBody.get(i - 1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }
        //move snake head
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;

        //game over conditions
        for (int i = 0; i < snakeBody.size(); i++) {
            Tile snakePart = snakeBody.get(i);

            //collide with snake head
            if (collision(snakeHead, snakePart)) {
                gameOver = true;
            }
        }

        if (snakeHead.x * tileSize < 0 - 16 || snakeHead.x * tileSize > boardWidth - 16
                || //passed left border or right border
                snakeHead.y * tileSize < 0 - 16 || snakeHead.y * tileSize > boardHeight - 16) { //passed top border or bottom border
            gameOver = true;
        }
    }

    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //called every x milliseconds by gameLoop timer
        move();
        repaint();
        if (gameOver) {
            gameLoop.stop();
            if(snakeBody.size() > highScore){
                try{
                    FileWriter fw = new FileWriter("highscore.txt");
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(snakeBody.size());
                    pw.close();
                }catch (IOException ex){
                    
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println("KeyEvent: " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != 1) {
            velocityX = 0;
            velocityY = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
            velocityX = 0;
            velocityY = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
            velocityX = -1;
            velocityY = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
            velocityX = 1;
            velocityY = 0;
        }

        //if the game's over and if they press space
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            //restart everything
            if (gameOver) {
                if(highScore < snakeBody.size()){
                    highScore = snakeBody.size();
                }
                gameOver = false;

                snakeHead = new Tile(5, 5);
                snakeBody = new ArrayList<Tile>();

                food = new Tile(10, 10);
                random = new Random();
                placeFood();

                velocityX = 1;
                velocityY = 0;

                gameLoop.start();

            }

        }

    }

    //not needed
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
