~/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author Asus
 */
public class SimpleCalculator extends javax.swing.JFrame {

    /**
     * Creates new form SimpleCalculator
     */
    public SimpleCalculator() {
        initComponents();
    }
double a, b, result;
String op, answer;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        txtDisplay = new javax.swing.JTextField();
        ON = new javax.swing.JRadioButton();
        OFF = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setMinimumSize(new java.awt.Dimension(335, 540));
        setPreferredSize(new java.awt.Dimension(335, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setEnabled(false);
        txtDisplay.setMargin(new java.awt.Insets(5, 5, 5, 5));
        getContentPane().add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        ON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ON.setText("ON");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });
        getContentPane().add(ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        OFF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OFF.setSelected(true);
        OFF.setText("OFF");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });
        getContentPane().add(OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("=");
        jButton3.setEnabled(false);
        jButton3.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton3.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("AC");
        jButton4.setEnabled(false);
        jButton4.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("±");
        jButton5.setEnabled(false);
        jButton5.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton5.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton5.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("÷");
        jButton6.setEnabled(false);
        jButton6.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton6.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton6.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("+");
        jButton7.setEnabled(false);
        jButton7.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton7.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton7.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("7");
        jButton8.setEnabled(false);
        jButton8.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton8.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("8");
        jButton9.setEnabled(false);
        jButton9.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton9.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("-");
        jButton10.setEnabled(false);
        jButton10.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton10.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton10.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("9");
        jButton11.setEnabled(false);
        jButton11.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton11.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton11.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("4");
        jButton12.setEnabled(false);
        jButton12.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton12.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton12.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("5");
        jButton13.setEnabled(false);
        jButton13.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton13.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton13.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("6");
        jButton14.setEnabled(false);
        jButton14.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton14.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton14.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("2");
        jButton15.setEnabled(false);
        jButton15.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton15.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton15.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("3");
        jButton16.setEnabled(false);
        jButton16.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton16.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton16.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setText("/");
        jButton17.setEnabled(false);
        jButton17.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton17.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton17.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setText("1");
        jButton18.setEnabled(false);
        jButton18.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton18.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton18.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton19.setText("×");
        jButton19.setEnabled(false);
        jButton19.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton19.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton19.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setText("00");
        jButton20.setEnabled(false);
        jButton20.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton20.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton20.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setText("0");
        jButton21.setEnabled(false);
        jButton21.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton21.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton21.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setText(".");
        jButton22.setEnabled(false);
        jButton22.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton22.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton22.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        // TODO add your handling code here:
        enable();
    }//GEN-LAST:event_ONActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_OFFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        b = Double.parseDouble(txtDisplay.getText());
        
        if(op == "+")
        {
            result = a+b;
            answer = String.valueOf(result);
            txtDisplay.setText(answer);
        }else if(op == "-")
        {
            result = a-b;
            answer = String.valueOf(result);
            txtDisplay.setText(answer);
        }else if(op == "*")
        {
            result = a*b;
            answer = String.valueOf(result);
            txtDisplay.setText(answer);
        }else if(op == "/")
        {
            result = a/b;
            answer = String.valueOf(result);
            txtDisplay.setText(answer);
        }
        else if(op == "%")
        {
            result = a%b;
            answer = String.valueOf(result);
            txtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().contains("."))
        {
        double x = Double.parseDouble(txtDisplay.getText());
        x = x*-1;
        txtDisplay.setText(String.valueOf(x));
        }else
        {
            long z = Long.parseLong(txtDisplay.getText());
            z = z*-1;
            txtDisplay.setText(String.valueOf(z));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(txtDisplay.getText());
        op = "%";
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(txtDisplay.getText());
        op = "+";
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton8.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton9.getText());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(txtDisplay.getText());
        op = "-";
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton11.getText());
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton12.getText());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton13.getText());
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton14.getText());
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton15.getText());
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton16.getText());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(txtDisplay.getText());
        op = "/";
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton18.getText());
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(txtDisplay.getText());
        op = "*";
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton20.getText());
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText(txtDisplay.getText()+jButton21.getText());
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(!txtDisplay.getText().contains("."))
        {
                   txtDisplay.setText(txtDisplay.getText()+jButton22.getText());
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    public void enable()
    {        
            txtDisplay.setEnabled(true);
            OFF.setSelected(false);
            ON.setSelected(true);
            
            jButton20.setEnabled(true);
            jButton21.setEnabled(true);
            jButton22.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            jButton11.setEnabled(true);
            jButton12.setEnabled(true);
            jButton13.setEnabled(true);
            jButton14.setEnabled(true);
            jButton15.setEnabled(true);
            jButton16.setEnabled(true);
            jButton17.setEnabled(true);
            jButton18.setEnabled(true);
            jButton19.setEnabled(true);
    }
    
        public void disable()
    {        
            txtDisplay.setEnabled(false);
            OFF.setSelected(true);
            ON.setSelected(false);
            
            jButton20.setEnabled(false);
            jButton21.setEnabled(false);
            jButton22.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
            jButton10.setEnabled(false);
            jButton11.setEnabled(false);
            jButton12.setEnabled(false);
            jButton13.setEnabled(false);
            jButton14.setEnabled(false);
            jButton15.setEnabled(false);
            jButton16.setEnabled(false);
            jButton17.setEnabled(false);
            jButton18.setEnabled(false);
            jButton19.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculator().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton OFF;
    private javax.swing.JRadioButton ON;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}