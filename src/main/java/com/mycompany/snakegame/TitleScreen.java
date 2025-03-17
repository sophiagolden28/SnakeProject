/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.snakegame;

import javax.swing.JTextField;

//RUN ME
/**
 *
 * @author Sound Room
 */
public class TitleScreen extends javax.swing.JFrame {

    /**
     * Creates new form TitleScreen
     */
    public TitleScreen() {

        initComponents();
        setTitle("Title Screen");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ButtonSTART = new javax.swing.JButton();
        RadioButtonGreen = new javax.swing.JRadioButton();
        RadioButtonYellow = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        RadioButtonRed = new javax.swing.JRadioButton();
        RadioButtonBlue = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        LabelTitle.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitle.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("SNAKE!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(LabelTitle)
                .addGap(15, 15, 15))
        );

        TextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter your name here:");

        ButtonSTART.setText("Start Game");
        ButtonSTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSTARTActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonGreen);
        RadioButtonGreen.setForeground(new java.awt.Color(0, 0, 0));
        RadioButtonGreen.setText("Green");

        buttonGroup1.add(RadioButtonYellow);
        RadioButtonYellow.setForeground(new java.awt.Color(0, 0, 0));
        RadioButtonYellow.setText("Yellow");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Color:");

        buttonGroup1.add(RadioButtonRed);
        RadioButtonRed.setForeground(new java.awt.Color(0, 0, 0));
        RadioButtonRed.setText("Red");
        RadioButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonRedActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonBlue);
        RadioButtonBlue.setForeground(new java.awt.Color(0, 0, 0));
        RadioButtonBlue.setText("Blue");
        RadioButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonBlueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(ButtonSTART)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(RadioButtonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RadioButtonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButtonGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonGreen)
                    .addComponent(RadioButtonRed)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonYellow)
                    .addComponent(RadioButtonBlue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(ButtonSTART)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSTARTActionPerformed

        //get rid of the title screen when they press start
        this.dispose();

        //setting up a color number to catch the color from an integer
        int colorNumber = 1;

        if (RadioButtonBlue.isSelected()) {

            colorNumber = 0;

        } else if (RadioButtonGreen.isSelected()) {

            colorNumber = 1;

        } else if (RadioButtonRed.isSelected()) {

            colorNumber = 2;

        } else if (RadioButtonYellow.isSelected()) {

            colorNumber = 3;

        }

        //open the game
        App gameRun = new App(TextFieldName.getText(), colorNumber);


    }//GEN-LAST:event_ButtonSTARTActionPerformed

    private void TextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameActionPerformed

        //get rid of the title screen when they press start
        this.dispose();

        //setting up a color number to catch the color from an integer
        int colorNumber = 1;

        if (RadioButtonBlue.isSelected()) {

            colorNumber = 0;

        } else if (RadioButtonGreen.isSelected()) {

            colorNumber = 1;

        } else if (RadioButtonRed.isSelected()) {

            colorNumber = 2;

        } else if (RadioButtonYellow.isSelected()) {

            colorNumber = 3;

        }

        //open the game
        App gameRun = new App(TextFieldName.getText(), colorNumber);


    }//GEN-LAST:event_TextFieldNameActionPerformed

    private void RadioButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonBlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonBlueActionPerformed

    private void RadioButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonRedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSTART;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JRadioButton RadioButtonBlue;
    private javax.swing.JRadioButton RadioButtonGreen;
    private javax.swing.JRadioButton RadioButtonRed;
    private javax.swing.JRadioButton RadioButtonYellow;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
