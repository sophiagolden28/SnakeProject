/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakeenhanced;

/**
 *
 * @author not me
 */
import javax.swing.*;

public class App {

    int boardWidth;
    int boardHeight;
    String playerName;
    
    public App(String name, Integer colorNum){
        this.boardWidth = 600;
        this.boardHeight = boardWidth;
        this.playerName = name;

        JFrame frame = new JFrame("Snake (enhanced!)");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight, playerName, colorNum);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
