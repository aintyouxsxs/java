/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic_tac_toe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i = 0;
    

    /**
     * Creates new form Tic_Tac_Toe
     */
    public Tic_Tac_Toe() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
    }
    
    
    private void gameScore()
    {
            playerx.setText(String.valueOf(xCount));
            playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else{
            startGame = "X";
        }
    }        
    
    private void WinningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        //Player 1
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn2.setBackground(Color.BLACK);
            txtbtn3.setBackground(Color.BLACK);
        }
        
        else if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn6.setBackground(Color.BLACK);
        }
        
        else if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.BLACK);
            txtbtn8.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn4.setBackground(Color.BLACK);
            txtbtn7.setBackground(Color.BLACK);
        }
        
        else if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn8.setBackground(Color.BLACK);
        }
        
        else if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.BLACK);
            txtbtn6.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player 1 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn7 .setBackground(Color.BLACK);
        }
        
        //Player 2
        
        else if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn2.setBackground(Color.BLACK);
            txtbtn3.setBackground(Color.BLACK);
        }
        
        else if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn6.setBackground(Color.BLACK);
        }
        
        else if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.BLACK);
            txtbtn8.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn4.setBackground(Color.BLACK);
            txtbtn7.setBackground(Color.BLACK);
        }
        
        else if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn8.setBackground(Color.BLACK);
        }
        
        else if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.BLACK);
            txtbtn6.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn9.setBackground(Color.BLACK);
        }
        
        else if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 2 Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.BLACK);
            txtbtn5.setBackground(Color.BLACK);
            txtbtn7 .setBackground(Color.BLACK);
        }
        else if(i==9)
            JOptionPane.showMessageDialog(this, "It's a tie!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
    }

    
    /**
     * This method is called from within the constructor to initialize the   form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        txtagain = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SCORE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("TIC-TAC-TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        txtbtn2.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn2.setAlignmentY(0.0F);
        txtbtn2.setBorder(null);
        txtbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn3.setAlignmentY(0.0F);
        txtbtn3.setBorder(null);
        txtbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn1.setAlignmentY(0.0F);
        txtbtn1.setBorder(null);
        txtbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn5.setAlignmentY(0.0F);
        txtbtn5.setBorder(null);
        txtbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn4.setAlignmentY(0.0F);
        txtbtn4.setBorder(null);
        txtbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn6.setAlignmentY(0.0F);
        txtbtn6.setBorder(null);
        txtbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn8.setAlignmentY(0.0F);
        txtbtn8.setBorder(null);
        txtbtn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn7.setAlignmentY(0.0F);
        txtbtn7.setBorder(null);
        txtbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(0, 0, 0));
        txtexit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtexit.setForeground(new java.awt.Color(255, 255, 255));
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        txtbtn9.setAlignmentY(0.0F);
        txtbtn9.setBorder(null);
        txtbtn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 0, 51)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        playerx.setBackground(new java.awt.Color(255, 255, 255));
        playerx.setFont(new java.awt.Font("Tempus Sans ITC", 1, 80)); // NOI18N
        playerx.setForeground(new java.awt.Color(255, 255, 255));
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerx.setText("0");
        playerx.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, new java.awt.Color(204, 0, 51)));
        playerx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playerx.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                playerxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                playerxAncestorRemoved(evt);
            }
        });

        playero.setFont(new java.awt.Font("Tempus Sans ITC", 1, 80)); // NOI18N
        playero.setForeground(new java.awt.Color(255, 255, 255));
        playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playero.setText("0");
        playero.setToolTipText("");
        playero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, new java.awt.Color(204, 0, 51)));
        playero.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        playero.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                playeroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORE BOARD");

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");

        player1.setBackground(new java.awt.Color(255, 255, 255));
        player1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1.setText("Player");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("O");
        jLabel3.setMaximumSize(new java.awt.Dimension(49, 71));
        jLabel3.setMinimumSize(new java.awt.Dimension(49, 71));
        jLabel3.setPreferredSize(new java.awt.Dimension(49, 71));

        player2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2.setText("Player");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(playero))
                .addGap(41, 41, 41))
        );

        txtagain.setBackground(new java.awt.Color(255, 0, 0));
        txtagain.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtagain.setForeground(new java.awt.Color(255, 255, 255));
        txtagain.setText("PLAY AGAIN");
        txtagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtagainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtagain, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtagain, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn2.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn3.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(startGame);
            
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn1.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn5.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();        
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn4.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn6.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here
        txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn8.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn7.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
           JFrame frame = new JFrame("Exit");
           
           if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
           {
               System.exit(0);
           }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(Color.WHITE);
            i++;
        }
        else{
            txtbtn9.setForeground(Color.WHITE);
            i++;
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtagainActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn2.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn3.setBackground(new java.awt.Color(255, 0, 0));
        
        txtbtn4.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn5.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn6.setBackground(new java.awt.Color(255, 0, 0));
        
        txtbtn7.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn8.setBackground(new java.awt.Color(255, 0, 0));
        txtbtn9.setBackground(new java.awt.Color(255, 0, 0));     
        
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        i=0;
    }//GEN-LAST:event_txtagainActionPerformed

    private void playerxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_playerxAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_playerxAncestorAdded

    private void playeroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_playeroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_playeroAncestorAdded

    private void playerxAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_playerxAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_playerxAncestorRemoved

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel player1;
    public javax.swing.JLabel player2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtagain;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    // End of variables declaration//GEN-END:variables
}