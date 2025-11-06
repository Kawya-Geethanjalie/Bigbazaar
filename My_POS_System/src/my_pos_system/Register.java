
package my_pos_system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    DBConnection db = new DBConnection();
    public Register() {
        initComponents();
        loadBGImage();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtUName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        jDateC = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConf = new javax.swing.JPasswordField();
        link2 = new javax.swing.JLabel();
        BGReg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Frist Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Comfirm");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nic");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 70, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 40, -1));

        txtFName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 240, 30));

        txtLName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 240, 30));

        txtUName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 240, 30));

        txtNic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNicKeyPressed(evt);
            }
        });
        getContentPane().add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 240, 30));
        getContentPane().add(jDateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 372, 240, 30));

        jButton1.setBackground(new java.awt.Color(0, 35, 154));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 35, 154));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 130, 40));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 232, 240, 30));

        txtConf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 240, 30));

        link2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        link2.setForeground(new java.awt.Color(7, 162, 243));
        link2.setText("If You have Login Account Please Login...");
        link2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                link2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                link2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                link2MouseExited(evt);
            }
        });
        getContentPane().add(link2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 310, -1));
        getContentPane().add(BGReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void link2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link2MouseClicked
       Login myLog = new Login();
        myLog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_link2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String nic = txtNic.getText();
        rs = checkemployee(nic);
        if (rs != null) {
            String firstName = txtFName.getText();
            String lastName = txtLName.getText();
            String username = txtUName.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            String confirm = txtConf.getText();
            Date dob = jDateC.getDate();
            boolean isUser = checkUsername(username);
            if (!isUser) {
                String userid = genarateUserId();
                boolean isvalid = isValidation(userid, firstName, lastName, username, email, password, confirm, nic, dob);
                if (isvalid) {
                    try {
                        String finalPassword = encryptMyPassword(password);
                        User user = new User(userid, firstName, lastName, username, email, finalPassword, nic, dob, "", "", null);
                        String msg = "Insert into user (user_id,first_name,last_name,username,email,password,nic,dob) VALUES(?,?,?,?,?,?,?,?)";
                        pst = db.con.prepareStatement(msg);
                        pst.setString(1, user.getUserId());
                        pst.setString(2, user.getFirstName());
                        pst.setString(3, user.getLastName());
                        pst.setString(4, user.getUserName().toLowerCase());
                        pst.setString(5, user.getEmail());
                        pst.setString(6, user.getPassword());
                        pst.setString(7, user.getNic());
                        java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
                        pst.setDate(8, sqlDate);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Your Registration is Sucuceful");

                    } catch (SQLException ex) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "not valid ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "This username is avilable ");
            }
        } else {
             JOptionPane.showMessageDialog(null, "This Employee is not in Our Company ","Registration fail" ,JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Please Enter Corect Employee Details ","Registrstion fail request" ,JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
            txtFName.setText("");
        txtLName.setText("");
        txtUName.setText("");
                txtEmail.setText("");
        txtPassword.setText("");
                txtConf.setText("");
        txtNic.setText("");
                jDateC.setDate(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void link2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link2MouseEntered
       link2.setForeground(new Color(51,204,255));
    }//GEN-LAST:event_link2MouseEntered

    private void link2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link2MouseExited
       link2.setForeground(new Color(7,162,243));
    }//GEN-LAST:event_link2MouseExited

    private void txtNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nic = txtNic.getText();
            rs = checkemployee(nic);
            if (rs != null) {
                try {
                    txtFName.setText(rs.getString(2));
                    txtLName.setText(rs.getString(3));
                    txtEmail.setText(rs.getString(4));
                    txtUName.setText(rs.getString(2).toLowerCase());
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("This Employee not in company");
            }
        }
    }//GEN-LAST:event_txtNicKeyPressed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGReg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel link2;
    private javax.swing.JPasswordField txtConf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables

    private void loadBGImage() {
        BGReg.setIcon(resize1("src\\wall3.png"));
//         BGReg.setIcon(resize1("src\\sky.jpg"));
      
    }

    private Icon resize1(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scaled = icon.getImage().getScaledInstance(BGReg.getWidth(), BGReg.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);

    }

    private ResultSet checkemployee(String nic) {
 try {
            String msg = "select * from cemployee where nic=?";
            pst = db.con.prepareStatement(msg);
            pst.setString(1, nic);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;






    }

    private boolean checkUsername(String username) {
  try {
            String msg = "select * from user where username=?";
            pst = db.con.prepareStatement(msg);
            pst.setString(1, username);
            rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;







    }

    private String genarateUserId() {
  String newId = "U001";  // default
        try {
            String sql = "SELECT user_id FROM user ORDER BY user_id DESC LIMIT 1";
            pst = db.con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String lastId = rs.getString(1); // e.g., "U004"
                int num = Integer.parseInt(lastId.substring(1));// 004 
                num++;
                newId = String.format("U%03d", num); // "U005"
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newId;






    }

    private boolean isValidation(String userid, String firstName, String lastName, String username, String email, String password, String confirm, String nic, Date dob) {
  return true;

    }

    private String encryptMyPassword(String password) {

 try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // Secure hashing
            byte[] hashBytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";


    }
}
