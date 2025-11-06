
package my_pos_system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {
 PreparedStatement pst;
    ResultSet rs;
    DBConnection db=new DBConnection();
    
    public Login() {
        initComponents();
        loadBGImage();
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BGImage = new javax.swing.JLabel();
        logbtnimage = new javax.swing.JLabel();
        log = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        link1 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(9, 35, 110));

        jPanel1.setBackground(new java.awt.Color(5, 12, 80));

        logbtnimage.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        logbtnimage.setForeground(new java.awt.Color(248, 205, 12));
        logbtnimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logpic.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Only Our Company Chaseer Employee Login Please");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BGImage, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logbtnimage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logbtnimage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BGImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(124, 213, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Username Or Email");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 129, 174, 49));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 135, 200, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 205, 174, 50));

        link1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        link1.setForeground(new java.awt.Color(69, 155, 234));
        link1.setText("Please Click Here to Create New a Account...");
        link1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                link1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                link1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                link1MouseExited(evt);
            }
        });
        jPanel2.add(link1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 329, 361, 30));

        btnLog.setBackground(new java.awt.Color(17, 24, 91));
        btnLog.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 204, 0));
        btnLog.setText("Login");
        btnLog.setBorder(null);
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogMouseExited(evt);
            }
        });
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel2.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 285, 96, 40));

        btnCancel.setBackground(new java.awt.Color(17, 24, 91));
        btnCancel.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 204, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 285, 103, 40));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void link1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link1MouseEntered
       
        link1.setForeground(Color.blue);
    }//GEN-LAST:event_link1MouseEntered

    private void link1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link1MouseExited
       link1.setForeground(new Color(7,121,225));
    }//GEN-LAST:event_link1MouseExited

    private void btnLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseEntered
      btnLog.setBackground(new Color(255,204,0));
      btnLog.setForeground(new Color(17,24,91));
        
        
    }//GEN-LAST:event_btnLogMouseEntered

    private void btnLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseExited
       
         btnLog.setBackground(new Color(17,24,91));
      btnLog.setForeground(new Color(255,204,0));
    }//GEN-LAST:event_btnLogMouseExited

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        String username=txtUsername.getText();
        String paasword=txtPassword.getText();
          
        User users=checkUserPass(username,paasword);
         if (users != null) {
            Main m = new Main(users);
            m.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Corect Username and Password ");
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       txtUsername.setText("");
      txtPassword.setText("");
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void link1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link1MouseClicked
         Register myReg = new Register();
         myReg.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_link1MouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
 char key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER ||key == KeyEvent.VK_SPACE) {
             String username=txtUsername.getText();
        String paasword=txtPassword.getText();
          
        User users=checkUserPass(username,paasword);
         if (users != null) {
            Main m = new Main(users);
            m.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Corect Username and Password ");
        }
            
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
       
        
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
      txtUsername.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        txtPassword.requestFocusInWindow(); // Password field එකට focus යන්න
    }
});
    }//GEN-LAST:event_txtUsernameActionPerformed

   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImage;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel link1;
    private javax.swing.JLabel log;
    private javax.swing.JLabel logbtnimage;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void loadBGImage() {
        BGImage.setIcon(resize1("src\\logo.jpg"));
        log.setIcon(resize2("src\\userN.png"));
      logbtnimage.setIcon(resize3("src\\logpic.png"));
    }

    private Icon resize1(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scaled = icon.getImage().getScaledInstance(BGImage.getWidth(), BGImage.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);

    }
     private Icon resize2(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scaled = icon.getImage().getScaledInstance(log.getWidth(), log.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);

    } private Icon resize3(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scaled = icon.getImage().getScaledInstance(log.getWidth(), log.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);

    }

    private User checkUserPass(String username, String paasword) {
  
     try {
         String finalPassword = encryptMyPassword(paasword);
         String msg = "select * from user where (email = ? OR nic = ? OR username = ?) and password=?";
         pst = db.con.prepareStatement(msg);
         pst.setString(1, username);
         pst.setString(2, username);
         pst.setString(3, username);
         pst.setString(4, finalPassword);
         rs = pst.executeQuery();
         if (rs.next()) {
             return new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getString(10), rs.getString(11), rs.getBytes(12));
         }
         
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
     }


return null;





    }

    private String encryptMyPassword(String paasword) {
 try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // Secure hashing
            byte[] hashBytes = md.digest(paasword.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    

    }    

}

