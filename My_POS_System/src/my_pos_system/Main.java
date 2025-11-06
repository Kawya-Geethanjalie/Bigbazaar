package my_pos_system;


import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

import javax.swing.Timer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


import java.awt.Desktop;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JTextField;

import javax.swing.filechooser.FileNameExtensionFilter;
public class Main extends javax.swing.JFrame {

    DBConnection db = new DBConnection();

    PreparedStatement pst;
    ResultSet rs;
    String imagePath = "src\\Padd3.jpg";
    int lblWidth;
    int lblHeight;
    double grandtotal;
    double grandtotal2;
    User getUser;

    String shift = "LowerCase";

    public Main(User user) {
        initComponents();
        table1Desing();
        loadBGImage();
        loadTime();
        setLocationRelativeTo(null);
        getUser = user;

        lblWidth = imageAvater.getWidth();
        lblHeight = imageAvater.getHeight();
        setLocationRelativeTo(null);
        lblOutput.setText(user.getFirstName() + " " + getUser.getLastName());
        loadImageU(getUser);
        setLocationRelativeTo(null);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnSP = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        lblKP = new javax.swing.JLabel();
        btnShift = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFind = new javax.swing.JTextField();
        findS = new javax.swing.JLabel();
        btnFF = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        btnIt1 = new javax.swing.JButton();
        lblItemP1 = new javax.swing.JLabel();
        lblIN1 = new javax.swing.JLabel();
        btnIt2 = new javax.swing.JButton();
        lblItemP2 = new javax.swing.JLabel();
        lblIN2 = new javax.swing.JLabel();
        btnIt3 = new javax.swing.JButton();
        lblItemP3 = new javax.swing.JLabel();
        lblIN3 = new javax.swing.JLabel();
        btnIt4 = new javax.swing.JButton();
        lblItemP4 = new javax.swing.JLabel();
        lblIN4 = new javax.swing.JLabel();
        btnIt5 = new javax.swing.JButton();
        lblItemP5 = new javax.swing.JLabel();
        lblIN5 = new javax.swing.JLabel();
        btnIt6 = new javax.swing.JButton();
        lblIN6 = new javax.swing.JLabel();
        lblItemP6 = new javax.swing.JLabel();
        btnIt7 = new javax.swing.JButton();
        lblIN7 = new javax.swing.JLabel();
        lblItemP7 = new javax.swing.JLabel();
        lblIN8 = new javax.swing.JLabel();
        btnIt8 = new javax.swing.JButton();
        lblItemP8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnIt9 = new javax.swing.JButton();
        lblItemP9 = new javax.swing.JLabel();
        lblIN9 = new javax.swing.JLabel();
        btnIt10 = new javax.swing.JButton();
        lblItemP10 = new javax.swing.JLabel();
        lblIN10 = new javax.swing.JLabel();
        lblIN11 = new javax.swing.JLabel();
        btnIt11 = new javax.swing.JButton();
        lblItemP11 = new javax.swing.JLabel();
        btnIt12 = new javax.swing.JButton();
        lblItemP12 = new javax.swing.JLabel();
        lblIN12 = new javax.swing.JLabel();
        btnIt13 = new javax.swing.JButton();
        lblItemP13 = new javax.swing.JLabel();
        lblIN13 = new javax.swing.JLabel();
        lblIN14 = new javax.swing.JLabel();
        lblItemP14 = new javax.swing.JLabel();
        btnIt14 = new javax.swing.JButton();
        lblItemP15 = new javax.swing.JLabel();
        btnIt15 = new javax.swing.JButton();
        lblIN15 = new javax.swing.JLabel();
        lblIN16 = new javax.swing.JLabel();
        btnIt16 = new javax.swing.JButton();
        lblItemP16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnIt17 = new javax.swing.JButton();
        lblItemP17 = new javax.swing.JLabel();
        lblIN17 = new javax.swing.JLabel();
        btnIt18 = new javax.swing.JButton();
        lblItemP18 = new javax.swing.JLabel();
        lblIN18 = new javax.swing.JLabel();
        btnIt19 = new javax.swing.JButton();
        lblIN19 = new javax.swing.JLabel();
        lblItemP19 = new javax.swing.JLabel();
        lblItemP20 = new javax.swing.JLabel();
        btnIt20 = new javax.swing.JButton();
        lblIN20 = new javax.swing.JLabel();
        lblIN21 = new javax.swing.JLabel();
        btnIt21 = new javax.swing.JButton();
        lblItemP21 = new javax.swing.JLabel();
        btnIt22 = new javax.swing.JButton();
        lblItemP22 = new javax.swing.JLabel();
        lblIN22 = new javax.swing.JLabel();
        lblIN23 = new javax.swing.JLabel();
        lblItemP23 = new javax.swing.JLabel();
        btnIt23 = new javax.swing.JButton();
        lblIN24 = new javax.swing.JLabel();
        lblItemP24 = new javax.swing.JLabel();
        btnIt24 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnIt25 = new javax.swing.JButton();
        lblItemP25 = new javax.swing.JLabel();
        lblIN25 = new javax.swing.JLabel();
        btnIt26 = new javax.swing.JButton();
        lblIN26 = new javax.swing.JLabel();
        lblItemP26 = new javax.swing.JLabel();
        lblItemP27 = new javax.swing.JLabel();
        btnIt27 = new javax.swing.JButton();
        lblIN27 = new javax.swing.JLabel();
        lblIN28 = new javax.swing.JLabel();
        lblItemP28 = new javax.swing.JLabel();
        btnIt28 = new javax.swing.JButton();
        lblIN29 = new javax.swing.JLabel();
        btnIt29 = new javax.swing.JButton();
        lblItemP29 = new javax.swing.JLabel();
        lblIN30 = new javax.swing.JLabel();
        btnIt30 = new javax.swing.JButton();
        lblItemP30 = new javax.swing.JLabel();
        lblItemP31 = new javax.swing.JLabel();
        lblIN31 = new javax.swing.JLabel();
        btnIt31 = new javax.swing.JButton();
        btnIt32 = new javax.swing.JButton();
        lblItemP32 = new javax.swing.JLabel();
        lblIN32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUP = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBalence = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        txtNet = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        PriviweBill = new javax.swing.JButton();
        PrintBill = new javax.swing.JButton();
        SaveBill = new javax.swing.JButton();
        btnFF6 = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        export = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        btnFF1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BGImage2 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        imageAvater = new my_pos_system.ImageAvater();
        lblTime = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        BGImage3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME to Big Bazaar-Mumbai,Maharashta,India");
        setBackground(new java.awt.Color(16, 26, 169));
        setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advlogo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 40, 40));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 40, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,30));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(6, 17, 71));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 64, 202)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnB.setBackground(new java.awt.Color(211, 210, 210));
        btnB.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel5.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        btnA.setBackground(new java.awt.Color(211, 210, 210));
        btnA.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel5.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        btnC.setBackground(new java.awt.Color(211, 210, 210));
        btnC.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel5.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 20));

        btnD.setBackground(new java.awt.Color(211, 210, 210));
        btnD.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel5.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 20));

        btnE.setBackground(new java.awt.Color(211, 210, 210));
        btnE.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jPanel5.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 20));

        btnF.setBackground(new java.awt.Color(211, 210, 210));
        btnF.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        jPanel5.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 20));

        btnG.setBackground(new java.awt.Color(211, 210, 210));
        btnG.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        jPanel5.add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 20));

        btnH.setBackground(new java.awt.Color(211, 210, 210));
        btnH.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        jPanel5.add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 20));

        btnI.setBackground(new java.awt.Color(211, 210, 210));
        btnI.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        jPanel5.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 20));

        btnJ.setBackground(new java.awt.Color(211, 210, 210));
        btnJ.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        jPanel5.add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        btnK.setBackground(new java.awt.Color(211, 210, 210));
        btnK.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        jPanel5.add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        btnL.setBackground(new java.awt.Color(211, 210, 210));
        btnL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        jPanel5.add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        btnM.setBackground(new java.awt.Color(211, 210, 210));
        btnM.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        jPanel5.add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        btnN.setBackground(new java.awt.Color(211, 210, 210));
        btnN.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        jPanel5.add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 20));

        btnO.setBackground(new java.awt.Color(211, 210, 210));
        btnO.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        jPanel5.add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 20));

        btnP.setBackground(new java.awt.Color(211, 210, 210));
        btnP.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        jPanel5.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 20));

        btnQ.setBackground(new java.awt.Color(211, 210, 210));
        btnQ.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        jPanel5.add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        btnR.setBackground(new java.awt.Color(211, 210, 210));
        btnR.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        jPanel5.add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 20));

        btnS.setBackground(new java.awt.Color(211, 210, 210));
        btnS.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jPanel5.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        btnT.setBackground(new java.awt.Color(211, 210, 210));
        btnT.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        jPanel5.add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        btnU.setBackground(new java.awt.Color(211, 210, 210));
        btnU.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        jPanel5.add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 20));

        btnV.setBackground(new java.awt.Color(211, 210, 210));
        btnV.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        jPanel5.add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        btnW.setBackground(new java.awt.Color(211, 210, 210));
        btnW.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        jPanel5.add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        btnX.setBackground(new java.awt.Color(211, 210, 210));
        btnX.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel5.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 20));

        btnY.setBackground(new java.awt.Color(211, 210, 210));
        btnY.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        jPanel5.add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 20));

        btnZ.setBackground(new java.awt.Color(211, 210, 210));
        btnZ.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        jPanel5.add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 20));

        btnSP.setBackground(new java.awt.Color(211, 210, 210));
        btnSP.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSP.setText("-");
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });
        jPanel5.add(btnSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 20));

        btn3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, 20));

        btn1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel5.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 20));

        btn2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, 20));

        btn4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel5.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, 20));

        btn5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel5.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, 20));

        btn6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel5.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 70, 20));

        btn7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel5.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 20));

        btn8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel5.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, 20));

        btn9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel5.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 70, 20));

        btn10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn10.setText("0");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel5.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 20));

        btn11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn11.setText(".");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel5.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 70, 20));

        btn12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn12.setText("Clear");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel5.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 20));

        lblKP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblKP.setForeground(new java.awt.Color(255, 255, 0));
        lblKP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKP.setText("K e y  P a d");
        lblKP.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblKP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(lblKP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 50));

        btnShift.setBackground(new java.awt.Color(255, 51, 102));
        btnShift.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnShift.setText("Shift");
        btnShift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnShiftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnShiftMouseExited(evt);
            }
        });
        btnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShiftActionPerformed(evt);
            }
        });
        jPanel5.add(btnShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 369, 220));

        jPanel4.setBackground(new java.awt.Color(12, 30, 101));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(4, 26, 89));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(96, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod: No", "Name", "Avail:QTY", "U-Price(INR)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 304, 170));

        txtFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFind.setBorder(null);
        txtFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFindMouseClicked(evt);
            }
        });
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });
        jPanel4.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 7, 120, 30));

        findS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SSS.png"))); // NOI18N
        jPanel4.add(findS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 30));

        btnFF.setBackground(new java.awt.Color(13, 28, 105));
        btnFF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnFF.setForeground(new java.awt.Color(255, 225, 0));
        btnFF.setText("Find");
        btnFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFFMouseExited(evt);
            }
        });
        btnFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFFActionPerformed(evt);
            }
        });
        jPanel4.add(btnFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 7, 90, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addItem12.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 40, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 220));

        jPanel7.setBackground(new java.awt.Color(8, 37, 89));

        btnIt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt1MouseClicked(evt);
            }
        });
        btnIt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIt1ActionPerformed(evt);
            }
        });

        lblItemP1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP1.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP1.setText("₹.10");
        lblItemP1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN1.setForeground(new java.awt.Color(255, 255, 255));
        lblIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN1.setText("Coco toffe");

        btnIt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt2MouseClicked(evt);
            }
        });

        lblItemP2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP2.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP2.setText("₹.05");
        lblItemP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN2.setForeground(new java.awt.Color(255, 255, 255));
        lblIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN2.setText("Imli toffe");

        btnIt3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt3MouseClicked(evt);
            }
        });
        btnIt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIt3ActionPerformed(evt);
            }
        });

        lblItemP3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP3.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP3.setText("₹.8");
        lblItemP3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN3.setForeground(new java.awt.Color(255, 255, 255));
        lblIN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN3.setText("Hax toffe");

        btnIt4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt4MouseClicked(evt);
            }
        });

        lblItemP4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP4.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP4.setText("₹.10");
        lblItemP4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN4.setForeground(new java.awt.Color(255, 255, 255));
        lblIN4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN4.setText("Pox toffe");

        btnIt5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt5MouseClicked(evt);
            }
        });

        lblItemP5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP5.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP5.setText("₹.15");
        lblItemP5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN5.setForeground(new java.awt.Color(255, 255, 255));
        lblIN5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN5.setText("Tox toffe");

        btnIt6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt6MouseClicked(evt);
            }
        });

        lblIN6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN6.setForeground(new java.awt.Color(255, 255, 255));
        lblIN6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN6.setText("Bulto");

        lblItemP6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP6.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP6.setText("₹.02");
        lblItemP6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt7MouseClicked(evt);
            }
        });

        lblIN7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN7.setForeground(new java.awt.Color(255, 255, 255));
        lblIN7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN7.setText("Delta toffe");

        lblItemP7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP7.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP7.setText("₹.10");
        lblItemP7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN8.setForeground(new java.awt.Color(255, 255, 255));
        lblIN8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN8.setText("Bubbulgum");

        btnIt8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt8MouseClicked(evt);
            }
        });

        lblItemP8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP8.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP8.setText("₹.10");
        lblItemP8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblItemP5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIt5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIN5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblItemP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemP8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIN8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIt8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnIt4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnIt3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnIt2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnIt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnIt5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblItemP5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIN5))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnIt6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblItemP6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIN6))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnIt7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblItemP7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIN7)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnIt8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Toffes", jPanel7);

        jPanel8.setBackground(new java.awt.Color(11, 36, 107));

        btnIt9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt9MouseClicked(evt);
            }
        });

        lblItemP9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP9.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP9.setText("₹.100");
        lblItemP9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN9.setForeground(new java.awt.Color(255, 255, 255));
        lblIN9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN9.setText("Coco Milk");

        btnIt10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt10MouseClicked(evt);
            }
        });

        lblItemP10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP10.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP10.setText("₹.55");
        lblItemP10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN10.setForeground(new java.awt.Color(255, 255, 255));
        lblIN10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN10.setText("KitKat");

        lblIN11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN11.setForeground(new java.awt.Color(255, 255, 255));
        lblIN11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN11.setText("Whiet Choc");

        btnIt11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt11MouseClicked(evt);
            }
        });

        lblItemP11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP11.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP11.setText("₹.60");
        lblItemP11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt12MouseClicked(evt);
            }
        });

        lblItemP12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP12.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP12.setText("₹.130");
        lblItemP12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN12.setForeground(new java.awt.Color(255, 255, 255));
        lblIN12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN12.setText("Toff Choc");

        btnIt13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt13MouseClicked(evt);
            }
        });

        lblItemP13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP13.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP13.setText("₹.05");
        lblItemP13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN13.setForeground(new java.awt.Color(255, 255, 255));
        lblIN13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN13.setText("Pani Kaju");

        lblIN14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN14.setForeground(new java.awt.Color(255, 255, 255));
        lblIN14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN14.setText("Heart Choco");

        lblItemP14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP14.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP14.setText("₹.15");
        lblItemP14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt14MouseClicked(evt);
            }
        });

        lblItemP15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP15.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP15.setText("₹.100");
        lblItemP15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt15MouseClicked(evt);
            }
        });

        lblIN15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN15.setForeground(new java.awt.Color(255, 255, 255));
        lblIN15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN15.setText("Milky Choc");

        lblIN16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN16.setForeground(new java.awt.Color(255, 255, 255));
        lblIN16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN16.setText("Coffe choc");

        btnIt16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt16MouseClicked(evt);
            }
        });

        lblItemP16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP16.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP16.setText("₹.10");
        lblItemP16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnIt9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnIt10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnIt11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnIt12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblItemP9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnIt13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIt14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIt15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIt16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblItemP13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemP16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblIN13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIN15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblIN16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIt9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemP9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIN9)
                    .addComponent(lblIN10)
                    .addComponent(lblIN11)
                    .addComponent(lblIN12))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIt13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIt16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemP13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemP16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIN13)
                    .addComponent(lblIN14)
                    .addComponent(lblIN15)
                    .addComponent(lblIN16)))
        );

        jTabbedPane1.addTab("Choc", jPanel8);

        jPanel9.setBackground(new java.awt.Color(7, 35, 112));

        btnIt17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt17MouseClicked(evt);
            }
        });

        lblItemP17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP17.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP17.setText("₹.10");
        lblItemP17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN17.setForeground(new java.awt.Color(255, 255, 255));
        lblIN17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN17.setText("Murukku");

        btnIt18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt18MouseClicked(evt);
            }
        });

        lblItemP18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP18.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP18.setText("₹.15");
        lblItemP18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN18.setForeground(new java.awt.Color(255, 255, 255));
        lblIN18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN18.setText("Rollo");

        btnIt19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt19MouseClicked(evt);
            }
        });

        lblIN19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN19.setForeground(new java.awt.Color(255, 255, 255));
        lblIN19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN19.setText("Oran tof");

        lblItemP19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP19.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP19.setText("₹.02");
        lblItemP19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblItemP20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP20.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP20.setText("₹.25");
        lblItemP20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt20MouseClicked(evt);
            }
        });

        lblIN20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN20.setForeground(new java.awt.Color(255, 255, 255));
        lblIN20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN20.setText("Uno");

        lblIN21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN21.setForeground(new java.awt.Color(255, 255, 255));
        lblIN21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN21.setText("Lolipop");

        btnIt21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt21MouseClicked(evt);
            }
        });

        lblItemP21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP21.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP21.setText("₹.12");
        lblItemP21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt22MouseClicked(evt);
            }
        });

        lblItemP22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP22.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP22.setText("₹.05");
        lblItemP22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN22.setForeground(new java.awt.Color(255, 255, 255));
        lblIN22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN22.setText("Maashs");

        lblIN23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN23.setForeground(new java.awt.Color(255, 255, 255));
        lblIN23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN23.setText("Kisses");

        lblItemP23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP23.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP23.setText("₹.03");
        lblItemP23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt23MouseClicked(evt);
            }
        });

        lblIN24.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN24.setForeground(new java.awt.Color(255, 255, 255));
        lblIN24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN24.setText("Jalebies");

        lblItemP24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP24.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP24.setText("₹.18");
        lblItemP24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN20))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN19))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN18))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN21))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN23))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnIt24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN24)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sweet", jPanel9);

        jPanel10.setBackground(new java.awt.Color(7, 35, 112));

        btnIt25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt25MouseClicked(evt);
            }
        });
        btnIt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIt25ActionPerformed(evt);
            }
        });

        lblItemP25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP25.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP25.setText("₹.15");
        lblItemP25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN25.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN25.setForeground(new java.awt.Color(255, 255, 255));
        lblIN25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN25.setText("Machis");

        btnIt26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt26MouseClicked(evt);
            }
        });

        lblIN26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN26.setForeground(new java.awt.Color(255, 255, 255));
        lblIN26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN26.setText("Safety Pin");

        lblItemP26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP26.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP26.setText("₹.30");
        lblItemP26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblItemP27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP27.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP27.setText("₹.02");
        lblItemP27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt27MouseClicked(evt);
            }
        });

        lblIN27.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN27.setForeground(new java.awt.Color(255, 255, 255));
        lblIN27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN27.setText("Kapuru balls");

        lblIN28.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN28.setForeground(new java.awt.Color(255, 255, 255));
        lblIN28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN28.setText("P:Spoon");

        lblItemP28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP28.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP28.setText("₹.03");
        lblItemP28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIt28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt28MouseClicked(evt);
            }
        });

        lblIN29.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN29.setForeground(new java.awt.Color(255, 255, 255));
        lblIN29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN29.setText("Board Pin");

        btnIt29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt29MouseClicked(evt);
            }
        });

        lblItemP29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP29.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP29.setText("₹.02");
        lblItemP29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN30.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN30.setForeground(new java.awt.Color(255, 255, 255));
        lblIN30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN30.setText("Lighter");

        btnIt30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt30MouseClicked(evt);
            }
        });

        lblItemP30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP30.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP30.setText("₹.10");
        lblItemP30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblItemP31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP31.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP31.setText("₹.10");
        lblItemP31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN31.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN31.setForeground(new java.awt.Color(255, 255, 255));
        lblIN31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN31.setText("Dhaaga");

        btnIt31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt31MouseClicked(evt);
            }
        });

        btnIt32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnIt32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIt32MouseClicked(evt);
            }
        });

        lblItemP32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemP32.setForeground(new java.awt.Color(255, 255, 255));
        lblItemP32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemP32.setText("₹.08");
        lblItemP32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIN32.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblIN32.setForeground(new java.awt.Color(255, 255, 255));
        lblIN32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIN32.setText("Needels");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIt32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItemP32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIN32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN28))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN27))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN26))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN29))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN30))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN31))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnIt32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblItemP32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblIN32)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Other", jPanel10);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 240));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255,0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(12, 50, 129));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod: No", "Name", "U: Price", "QTY", "Total Price"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 130));

        jPanel12.setBackground(new java.awt.Color(14, 10, 119));
        jPanel12.setForeground(new java.awt.Color(23, 9, 111));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setBackground(new java.awt.Color(13, 6, 118));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 204, 0));
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel12.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 57, 95, -1));

        btnAdd.setBackground(new java.awt.Color(13, 6, 118));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 204, 0));
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel12.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 84, -1));

        btnDelete.setBackground(new java.awt.Color(21, 18, 97));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 204, 0));
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel12.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 57, 85, -1));

        btnClear.setBackground(new java.awt.Color(6, 24, 94));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 204, 0));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel12.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 57, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product No");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        txtPno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPnoMouseClicked(evt);
            }
        });
        txtPno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnoActionPerformed(evt);
            }
        });
        txtPno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPnoKeyReleased(evt);
            }
        });
        jPanel12.add(txtPno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Uni-Price");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 60, -1));

        txtUP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(txtUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 60, 20));

        txtQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQtyMouseClicked(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        jPanel12.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 50, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QTY");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total Price");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel12.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 20));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 90));

        jPanel13.setBackground(new java.awt.Color(4, 42, 119));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Balence");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 60, -1));

        txtBalence.setBackground(new java.awt.Color(224, 224, 224));
        txtBalence.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtBalence.setForeground(new java.awt.Color(232, 12, 34));
        jPanel13.add(txtBalence, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, 20));

        txtCash.setBackground(new java.awt.Color(224, 224, 224));
        txtCash.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtCash.setForeground(new java.awt.Color(1, 1, 255));
        txtCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCashMouseClicked(evt);
            }
        });
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashKeyPressed(evt);
            }
        });
        jPanel13.add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 137, 20));

        txtNet.setBackground(new java.awt.Color(218, 218, 218));
        txtNet.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jPanel13.add(txtNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 137, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Net Total");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, 68, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Cash");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 60, -1));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 250, 100));

        jPanel14.setBackground(new java.awt.Color(5, 5, 105));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("Cal");
        jPanel14.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 30, -1));

        PriviweBill.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        PriviweBill.setForeground(new java.awt.Color(255, 225, 0));
        PriviweBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p.png"))); // NOI18N
        PriviweBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PriviweBill.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ppp.png"))); // NOI18N
        PriviweBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PriviweBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PriviweBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PriviweBillMouseExited(evt);
            }
        });
        PriviweBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriviweBillActionPerformed(evt);
            }
        });
        jPanel14.add(PriviweBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 40));

        PrintBill.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        PrintBill.setForeground(new java.awt.Color(255, 225, 0));
        PrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print_icon.png"))); // NOI18N
        PrintBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBill.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ASAS.png"))); // NOI18N
        PrintBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintBillMouseExited(evt);
            }
        });
        PrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBillActionPerformed(evt);
            }
        });
        jPanel14.add(PrintBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 40));

        SaveBill.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        SaveBill.setForeground(new java.awt.Color(255, 225, 0));
        SaveBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_icon.png"))); // NOI18N
        SaveBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBillMouseExited(evt);
            }
        });
        SaveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBillActionPerformed(evt);
            }
        });
        jPanel14.add(SaveBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 40, 40));

        btnFF6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnFF6.setForeground(new java.awt.Color(255, 225, 0));
        btnFF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal.png"))); // NOI18N
        btnFF6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFF6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fgfgf.png"))); // NOI18N
        btnFF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFF6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFF6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFF6MouseExited(evt);
            }
        });
        btnFF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFF6ActionPerformed(evt);
            }
        });
        jPanel14.add(btnFF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/send.png"))); // NOI18N
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel14.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 40));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 40));

        export.setBackground(new java.awt.Color(246, 246, 246));
        export.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csv1.png"))); // NOI18N
        export.setText("CSV");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        jPanel14.add(export, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 40));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 40));

        next.setBackground(new java.awt.Color(38, 67, 188));
        next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel14.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 250, 110));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 660, 230));

        btnFF1.setBackground(new java.awt.Color(13, 28, 105));
        btnFF1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnFF1.setForeground(new java.awt.Color(255, 225, 0));
        btnFF1.setText("Find");
        btnFF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFF1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFF1MouseExited(evt);
            }
        });
        jPanel3.add(btnFF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 5, 120, 30));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane3.setViewportView(txtArea);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 260, 180));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 260, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 222, 6));
        jLabel12.setText("Your Bill Previwe ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 170, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoom.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 40, 40));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 40, 30));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 50, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 960, 460));

        jPanel1.setBackground(new java.awt.Color(11, 29, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGImage2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.add(BGImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 0, 470, 81));
        jPanel1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 81));

        jPanel2.setBackground(new java.awt.Color(0, 22, 137));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hi.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 225, 0));
        jLabel1.setText(" Welcome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 110, 30));

        lblOutput.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(0, 209, 255));
        lblOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOutput.setText("Name");
        jPanel2.add(lblOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 160, 20));

        imageAvater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvaterMouseClicked(evt);
            }
        });
        jPanel2.add(imageAvater, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 70));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(253, 207, 0));
        lblTime.setText("time");
        jPanel2.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 217, 0));
        jLabel14.setText("Time :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log-out56.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 6, 320, 80));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 90));
        getContentPane().add(BGImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 980, 490));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF1MouseExited

    private void btnFF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF1MouseEntered

    private void btnFF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF1MouseClicked

    private void btnFF6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF6MouseExited

    private void btnFF6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF6MouseEntered

    private void btnFF6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFF6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFF6MouseClicked

    private void SaveBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBillMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBillMouseExited

    private void SaveBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBillMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBillMouseEntered

    private void SaveBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBillMouseClicked

    private void PrintBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBillMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBillMouseExited

    private void PrintBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBillMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBillMouseEntered

    private void PrintBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBillMouseClicked

    private void PriviweBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PriviweBillMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PriviweBillMouseExited

    private void PriviweBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PriviweBillMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PriviweBillMouseEntered

    private void PriviweBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PriviweBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PriviweBillMouseClicked

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        //Make beautiful bttons
        btnClear.setBackground(new Color(13, 28, 105));
        btnClear.setForeground(new Color(255, 204, 0));
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(new Color(238, 212, 15));
        btnClear.setForeground(Color.blue);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(new Color(13, 28, 105));
        btnDelete.setForeground(new Color(255, 204, 0));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(238, 212, 15));
        btnDelete.setForeground(Color.red);

    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(new Color(13, 28, 105));
        btnAdd.setForeground(new Color(255, 225, 0));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(new Color(238, 212, 15));
        btnAdd.setForeground(Color.blue);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(13, 28, 105));
        btnUpdate.setForeground(new Color(255, 225, 0));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(238, 212, 15));
        btnUpdate.setForeground(Color.blue);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnoActionPerformed

    private void btnFFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFFMouseExited
        btnFF.setBackground(new Color(13, 28, 105));
        btnFF.setForeground(new Color(255, 225, 0));
    }//GEN-LAST:event_btnFFMouseExited

    private void btnFFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFFMouseEntered
        btnFF.setBackground(Color.white);
        btnFF.setForeground(Color.blue);
    }//GEN-LAST:event_btnFFMouseEntered

    private void btnFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFFMouseClicked

    }//GEN-LAST:event_btnFFMouseClicked

    private void txtFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFindMouseClicked
        txtFind.setEditable(true);
        txtPno.setEditable(false);
        txtQty.setEditable(false);
        txtCash.setEditable(false);
    }//GEN-LAST:event_txtFindMouseClicked

    private void btnShiftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShiftMouseEntered
        btnShift.setBackground(new Color(0, 0, 0));
        btnShift.setForeground(Color.red);

    }//GEN-LAST:event_btnShiftMouseEntered

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       //make keyPad number
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btn2.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btn2.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btn2.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btn2.getText());
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        //Keybord Leter making
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnL.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnL.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnL.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnL.getText());
        }
    }//GEN-LAST:event_btnLActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnA.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnA.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnA.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnA.getText());
        }
    }//GEN-LAST:event_btnAActionPerformed

    private void btnShiftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShiftMouseExited
        btnShift.setBackground(new Color(255, 51, 102));
        btnShift.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_btnShiftMouseExited

    private void imageAvaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvaterMouseClicked
       //Image Loard to label
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image File", "jpg", "jpej", "png", "gif");
        filechooser.setFileFilter(filter);
        filechooser.setCurrentDirectory(new File(imagePath));
        int selected = filechooser.showOpenDialog(null);
        if (selected == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            imagePath = file.getAbsolutePath();
            upadateImage(imagePath, getUser);
            ImageIcon icon = new ImageIcon(imagePath);
            Image scaled = icon.getImage().getScaledInstance(lblWidth, lblHeight, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
            imageAvater.setImage(icon);
            imageAvater.repaint();
        }
    }//GEN-LAST:event_imageAvaterMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        Login myLog = new Login();
        myLog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtPnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPnoMouseClicked
       
        txtFind.setEditable(false);
        txtPno.setEditable(true);
        txtQty.setEditable(false);
        txtCash.setEditable(false);
    }//GEN-LAST:event_txtPnoMouseClicked

    private void txtQtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtyMouseClicked
        txtFind.setEditable(false);
        txtPno.setEditable(false);
        txtQty.setEditable(true);
        txtCash.setEditable(false);
    }//GEN-LAST:event_txtQtyMouseClicked

    private void txtCashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCashMouseClicked
        txtFind.setEditable(false);
        txtPno.setEditable(false);
        txtQty.setEditable(false);
        txtCash.setEditable(true);
    }//GEN-LAST:event_txtCashMouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       //create to typein eassy, if couser is in pointed place
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btn1.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btn1.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btn1.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btn1.getText());
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btn3.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btn3.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btn3.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btn3.getText());
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 4);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 4);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 4);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 4);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 5);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 5);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 5);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 5);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 6);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 6);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 6);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 6);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 7);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 7);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 7);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 7);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 8);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 8);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 8);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 8);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 9);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 9);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 9);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 9);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + 0);
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + 0);
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + 0);
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + 0);
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btn11.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btn11.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btn11.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btn11.getText());
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed

        String bsp = null;
        if (txtFind.isCursorSet()) {
            if (txtFind.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtFind.getText());
                strB.deleteCharAt(txtFind.getText().length() - 1);
                bsp = strB.toString();
                txtFind.setText(bsp);
            }
        } else if (txtPno.isCursorSet()) {
            if (txtPno.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtPno.getText());
                strB.deleteCharAt(txtPno.getText().length() - 1);
                bsp = strB.toString();
                txtPno.setText(bsp);
            }

        } else if (txtQty.isCursorSet()) {
            if (txtQty.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtQty.getText());
                strB.deleteCharAt(txtQty.getText().length() - 1);
                bsp = strB.toString();
                txtQty.setText(bsp);
            }
        } else if (txtCash.isCursorSet()) {
            if (txtCash.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtCash.getText());
                strB.deleteCharAt(txtCash.getText().length() - 1);
                bsp = strB.toString();
                txtCash.setText(bsp);
            }
        }


    }//GEN-LAST:event_btn12ActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnB.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnB.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnB.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnB.getText());
        }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnC.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnC.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnC.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnC.getText());
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnD.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnD.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnD.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnD.getText());
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnE.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnE.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnE.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnE.getText());
        }
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnF.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnF.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnF.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnF.getText());
        }
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnG.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnG.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnG.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnG.getText());
        }
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnH.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnH.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnH.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnH.getText());
        }
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnI.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnI.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnI.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnI.getText());
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnJ.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnJ.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnJ.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnJ.getText());
        }
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnK.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnK.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnK.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnK.getText());
        }
    }//GEN-LAST:event_btnKActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnM.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnM.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnM.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnM.getText());
        }
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnN.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnN.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnN.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnN.getText());
        }
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnO.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnO.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnO.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnO.getText());
        }
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnP.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnP.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnP.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnP.getText());
        }
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnQ.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnQ.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnQ.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnQ.getText());
        }
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnR.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnR.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnR.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnR.getText());
        }
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnS.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnS.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnS.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnS.getText());
        }
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnT.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnT.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnT.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnT.getText());
        }
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnU.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnU.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnU.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnU.getText());
        }
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnV.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnV.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnV.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnV.getText());
        }
    }//GEN-LAST:event_btnVActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnW.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnW.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnW.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnW.getText());
        }
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnX.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnX.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnX.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnX.getText());
        }
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnY.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnY.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnY.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnY.getText());
        }
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnZ.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnZ.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnZ.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnZ.getText());
        }
    }//GEN-LAST:event_btnZActionPerformed

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        if (txtFind.isCursorSet()) {
            txtFind.setText(txtFind.getText() + btnSP.getText());
        } else if (txtPno.isCursorSet()) {
            txtPno.setText(txtPno.getText() + btnSP.getText());
        } else if (txtQty.isCursorSet()) {
            txtQty.setText(txtQty.getText() + btnSP.getText());
        } else if (txtCash.isCursorSet()) {
            txtCash.setText(txtCash.getText() + btnSP.getText());
        }
    }//GEN-LAST:event_btnSPActionPerformed

    private void btnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShiftActionPerformed
        //create Shifting letters
        if ("LoweCase".equals(shift)) {
            btnA.setText(btnA.getText().toLowerCase());
            btnB.setText(btnB.getText().toLowerCase());
            btnC.setText(btnC.getText().toLowerCase());
            btnD.setText(btnD.getText().toLowerCase());
            btnE.setText(btnE.getText().toLowerCase());
            btnF.setText(btnF.getText().toLowerCase());
            btnG.setText(btnG.getText().toLowerCase());
            btnH.setText(btnH.getText().toLowerCase());
            btnI.setText(btnI.getText().toLowerCase());
            btnJ.setText(btnJ.getText().toLowerCase());
            btnK.setText(btnK.getText().toLowerCase());
            btnL.setText(btnL.getText().toLowerCase());
            btnM.setText(btnM.getText().toLowerCase());
            btnN.setText(btnN.getText().toLowerCase());
            btnO.setText(btnO.getText().toLowerCase());
            btnP.setText(btnP.getText().toLowerCase());
            btnQ.setText(btnQ.getText().toLowerCase());
            btnR.setText(btnR.getText().toLowerCase());
            btnS.setText(btnS.getText().toLowerCase());
            btnT.setText(btnT.getText().toLowerCase());
            btnU.setText(btnU.getText().toLowerCase());
            btnV.setText(btnV.getText().toLowerCase());
            btnW.setText(btnW.getText().toLowerCase());
            btnX.setText(btnX.getText().toLowerCase());
            btnY.setText(btnY.getText().toLowerCase());
            btnZ.setText(btnZ.getText().toLowerCase());

            shift = "UpperCase";

        } else {
            btnA.setText(btnA.getText().toUpperCase());
            btnB.setText(btnB.getText().toUpperCase());
            btnC.setText(btnC.getText().toUpperCase());
            btnD.setText(btnD.getText().toUpperCase());
            btnE.setText(btnE.getText().toUpperCase());
            btnF.setText(btnF.getText().toUpperCase());
            btnG.setText(btnG.getText().toUpperCase());
            btnH.setText(btnH.getText().toUpperCase());
            btnI.setText(btnI.getText().toUpperCase());
            btnJ.setText(btnJ.getText().toUpperCase());
            btnK.setText(btnK.getText().toUpperCase());
            btnL.setText(btnL.getText().toUpperCase());
            btnM.setText(btnM.getText().toUpperCase());
            btnN.setText(btnN.getText().toUpperCase());
            btnO.setText(btnO.getText().toUpperCase());
            btnP.setText(btnP.getText().toUpperCase());
            btnQ.setText(btnQ.getText().toUpperCase());
            btnR.setText(btnR.getText().toUpperCase());
            btnS.setText(btnS.getText().toUpperCase());
            btnT.setText(btnT.getText().toUpperCase());
            btnU.setText(btnU.getText().toUpperCase());
            btnV.setText(btnV.getText().toUpperCase());
            btnW.setText(btnW.getText().toUpperCase());
            btnX.setText(btnX.getText().toUpperCase());
            btnY.setText(btnY.getText().toUpperCase());
            btnZ.setText(btnZ.getText().toUpperCase());

            shift = "LoweCase";
        }
    }//GEN-LAST:event_btnShiftActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //if open main window display items in database
        Display();
    }//GEN-LAST:event_formWindowOpened

    private void btnFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFFActionPerformed
       //find stock of sale
        try {

            String msg = "SELECT * FROM item WHERE pno=? ";
            pst = db.con.prepareStatement(msg);
            pst.setString(1, txtFind.getText());
            rs = pst.executeQuery();

            //Sort kireema
            DefaultTableModel tabelModel = (DefaultTableModel) jTable1.getModel();
            String fno = txtFind.getText();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tabelModel);
            jTable1.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(fno));

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFFActionPerformed

    private void txtPnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnoKeyPressed
 try {

            String msg = "SELECT * FROM item WHERE pno=? ";
            pst = db.con.prepareStatement(msg);
            pst.setString(1, txtPno.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtName.setText(rs.getString(2));
                txtUP.setText(rs.getString(4));

            } else {
//                txtPno.setText("");
//                txtName.setText("");
//                txtUP.setText("");
               
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtPnoKeyPressed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Clear2();

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnoKeyReleased
//        try {
//
//            String msg = "SELECT * FROM item WHERE pno=? ";
//            pst = db.con.prepareStatement(msg);
//            pst.setString(1, txtPno.getText());
//            rs = pst.executeQuery();
//
//            if (rs.next()) {
//                txtName.setText(rs.getString(2));
//                txtUP.setText(rs.getString(4));
//
//            } else {
//                txtPno.setText("");
//                txtName.setText("");
//                txtUP.setText("");
//               
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_txtPnoKeyReleased

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed

    }//GEN-LAST:event_txtQtyKeyPressed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
       //set auto total price above the mid table  
        String sqty = txtQty.getText().trim();
        String suPrice = txtUP.getText().trim();

        if (!sqty.isEmpty() && !suPrice.isEmpty()) {
            try {
                int qty = Integer.parseInt(sqty);
                float uPrice = Float.parseFloat(suPrice);
                float total = qty * uPrice;
                txtTotal.setText(String.valueOf(total));
            } catch (NumberFormatException e) {
                txtTotal.setText(String.valueOf("Invalied"));
            }
              
        } else {
            txtTotal.setText("");
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Coustermars are bye items
        
        String pno = txtPno.getText();
        String name = txtName.getText();
        String uprice = txtUP.getText();
        String qty = txtQty.getText();
        String total = txtTotal.getText();

        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        ////////////////////////
        float uprice1=Float.parseFloat(uprice);
        int qty1 = Integer.parseInt(txtQty.getText());  
        int tempQty = 0;
            for (int i = 0; i < jTable2.getRowCount(); i++) {//check same item code in availble Jtable
                if (txtPno.getText().equals(jTable2.getValueAt(i, 0))) {
                    tempQty = Integer.parseInt(jTable2.getValueAt(i, 3).toString());

                    tablemodel.removeRow(jTable2.convertRowIndexToModel(i));
                }
            }
        ////////////////////////
        Object[] data = new Object[5];
        data[0] = pno;
        data[1] = name;
        data[2] = uprice;
        int finalqty=qty1+tempQty;
      
        data[3] = finalqty;
         float tot=uprice1*finalqty;
        data[4] = tot;

        tablemodel.addRow(data);
//update database after Add some
        try {
            String msg = "SELECT qty FROM item WHERE Pno = ?";
pst = db.con.prepareStatement(msg);
pst.setString(1, pno); // only check selected item
 rs = pst.executeQuery();
if (rs.next()) {
    int databaseQty = rs.getInt("qty");
    int getQty = Integer.parseInt(txtQty.getText());
    databaseQty -= getQty;
    if (databaseQty < 0) {
        databaseQty = 0;
    }
    String sql = "UPDATE item SET qty=? WHERE Pno =?";
    pst = db.con.prepareStatement(sql);
    pst.setString(1, String.valueOf(databaseQty));
    pst.setString(2, pno);
    pst.executeUpdate();

                
            }

            Double i = Double.parseDouble(txtTotal.getText());
            grandtotal = grandtotal + i;
            txtNet.setText(String.valueOf(grandtotal + "0"));
            Clear();

        } catch (SQLException ex) {

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        int selectRow;
        selectRow = jTable2.getSelectedRow();
        txtPno.setText(tablemodel.getValueAt(selectRow, 0).toString());
        txtName.setText(tablemodel.getValueAt(selectRow, 1).toString());
        txtUP.setText(tablemodel.getValueAt(selectRow, 2).toString());
        txtQty.setText(tablemodel.getValueAt(selectRow, 3).toString());
        txtTotal.setText(tablemodel.getValueAt(selectRow, 4).toString());
    }//GEN-LAST:event_jTable2MouseClicked
    int t = 0;
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//if custermer unexpet some items he has not bye it(some item Delete his/her bill )
        int ok = JOptionPane.showConfirmDialog(null, "Do you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (ok == JOptionPane.YES_OPTION) {

            try {
                DefaultTableModel tabelModle = (DefaultTableModel) jTable2.getModel();
                int x = jTable2.getSelectedRow();
                tabelModle.removeRow(x);
                JOptionPane.showMessageDialog(null, "Deleted");

                int q = Integer.parseInt(txtQty.getText());
                String msg = "SELECT * FROM item WHERE Pno=?";
                pst = db.con.prepareStatement(msg);

                pst.setString(1, txtPno.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    int s = rs.getInt(3);
                    t = s + q;

                }

//update data base after delete some item
     String msg2 = "UPDATE item SET qty=? WHERE Pno=?";
                pst = db.con.prepareStatement(msg2);
                pst.setInt(1, t);
                pst.setString(2, txtPno.getText());

                pst.executeUpdate();
                t = 0;


                Double i = Double.parseDouble(txtTotal.getText());
                grandtotal = grandtotal - i;
                txtNet.setText(String.valueOf(grandtotal));
                Clear();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnIt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIt1ActionPerformed
//int qq=0;
    private void btnIt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt1MouseClicked
//        qq++;
        //small item add 
        String pno = "Tof-001";
        txtPno.setText(pno);
        txtName.setText(lblIN1.getText());
        txtUP.setText(lblItemP1.getText().substring(2));
//        txtQty.setText(String.valueOf(qq));

    }//GEN-LAST:event_btnIt1MouseClicked

    private void btnIt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt2MouseClicked
        String pno = "Tof-0002";
        txtPno.setText(pno);
        txtName.setText(lblIN2.getText());
        txtUP.setText(lblItemP2.getText().substring(2));
    }//GEN-LAST:event_btnIt2MouseClicked

    private void btnIt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt3MouseClicked
        String pno = "Tof-0003";
        txtPno.setText(pno);
        txtName.setText(lblIN3.getText());
        txtUP.setText(lblItemP3.getText().substring(2));
    }//GEN-LAST:event_btnIt3MouseClicked

    private void btnIt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt4MouseClicked
        String pno = "Tof-0004";
        txtPno.setText(pno);
        txtName.setText(lblIN4.getText());
        txtUP.setText(lblItemP4.getText().substring(2));
    }//GEN-LAST:event_btnIt4MouseClicked

    private void btnIt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt5MouseClicked
        String pno = "Tof-0005";
        txtPno.setText(pno);
        txtName.setText(lblIN5.getText());
        txtUP.setText(lblItemP5.getText().substring(2));
    }//GEN-LAST:event_btnIt5MouseClicked

    private void btnIt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt6MouseClicked
        String pno = "Tof-0006";
        txtPno.setText(pno);
        txtName.setText(lblIN6.getText());
        txtUP.setText(lblItemP6.getText().substring(2));
    }//GEN-LAST:event_btnIt6MouseClicked

    private void btnIt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt7MouseClicked
        String pno = "Tof-0007";
        txtPno.setText(pno);
        txtName.setText(lblIN7.getText());
        txtUP.setText(lblItemP7.getText().substring(2));
    }//GEN-LAST:event_btnIt7MouseClicked

    private void btnIt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt8MouseClicked
        String pno = "Tof-0008";
        txtPno.setText(pno);
        txtName.setText(lblIN8.getText());
        txtUP.setText(lblItemP8.getText().substring(2));
    }//GEN-LAST:event_btnIt8MouseClicked

    private void btnIt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt9MouseClicked
        String pno = "Cho-0001";
        txtPno.setText(pno);
        txtName.setText(lblIN9.getText());
        txtUP.setText(lblItemP9.getText().substring(2));
    }//GEN-LAST:event_btnIt9MouseClicked

    private void btnIt10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt10MouseClicked
        String pno = "Cho-0002";
        txtPno.setText(pno);
        txtName.setText(lblIN10.getText());
        txtUP.setText(lblItemP10.getText().substring(2));
    }//GEN-LAST:event_btnIt10MouseClicked

    private void btnIt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt11MouseClicked
        String pno = "Cho-0003";
        txtPno.setText(pno);
        txtName.setText(lblIN11.getText());
        txtUP.setText(lblItemP11.getText().substring(2));
    }//GEN-LAST:event_btnIt11MouseClicked

    private void btnIt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt12MouseClicked
        String pno = "Cho-0004";
        txtPno.setText(pno);
        txtName.setText(lblIN12.getText());
        txtUP.setText(lblItemP12.getText().substring(2));
    }//GEN-LAST:event_btnIt12MouseClicked

    private void btnIt13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt13MouseClicked
        String pno = "Cho-0005";
        txtPno.setText(pno);
        txtName.setText(lblIN13.getText());
        txtUP.setText(lblItemP13.getText().substring(2));
    }//GEN-LAST:event_btnIt13MouseClicked

    private void btnIt14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt14MouseClicked
        String pno = "Cho-0006";
        txtPno.setText(pno);
        txtName.setText(lblIN14.getText());
        txtUP.setText(lblItemP14.getText().substring(2));
    }//GEN-LAST:event_btnIt14MouseClicked

    private void btnIt15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt15MouseClicked
        String pno = "Cho-0007";
        txtPno.setText(pno);
        txtName.setText(lblIN15.getText());
        txtUP.setText(lblItemP15.getText().substring(2));
    }//GEN-LAST:event_btnIt15MouseClicked

    private void btnIt16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt16MouseClicked
        String pno = "Cho-008";
        txtPno.setText(pno);
        txtName.setText(lblIN16.getText());
        txtUP.setText(lblItemP16.getText().substring(2));
    }//GEN-LAST:event_btnIt16MouseClicked

    private void btnIt17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt17MouseClicked
        String pno = "Swt-0001";
        txtPno.setText(pno);
        txtName.setText(lblIN17.getText());
        txtUP.setText(lblItemP17.getText().substring(2));
    }//GEN-LAST:event_btnIt17MouseClicked

    private void btnIt18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt18MouseClicked
        String pno = "Swt-0002";
        txtPno.setText(pno);
        txtName.setText(lblIN18.getText());
        txtUP.setText(lblItemP18.getText().substring(2));
    }//GEN-LAST:event_btnIt18MouseClicked

    private void btnIt19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt19MouseClicked
        String pno = "Swt-0003";
        txtPno.setText(pno);
        txtName.setText(lblIN19.getText());
        txtUP.setText(lblItemP19.getText().substring(2));
    }//GEN-LAST:event_btnIt19MouseClicked

    private void btnIt20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt20MouseClicked
        String pno = "Swt-0004";
        txtPno.setText(pno);
        txtName.setText(lblIN20.getText());
        txtUP.setText(lblItemP20.getText().substring(2));
    }//GEN-LAST:event_btnIt20MouseClicked

    private void btnIt21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt21MouseClicked
        String pno = "Swt-0005";
        txtPno.setText(pno);
        txtName.setText(lblIN21.getText());
        txtUP.setText(lblItemP21.getText().substring(2));
    }//GEN-LAST:event_btnIt21MouseClicked

    private void btnIt22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt22MouseClicked
        String pno = "Swt-0006";
        txtPno.setText(pno);
        txtName.setText(lblIN22.getText());
        txtUP.setText(lblItemP22.getText().substring(2));
    }//GEN-LAST:event_btnIt22MouseClicked

    private void btnIt23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt23MouseClicked
        String pno = "Swt-0007";
        txtPno.setText(pno);
        txtName.setText(lblIN23.getText());
        txtUP.setText(lblItemP23.getText().substring(2));
    }//GEN-LAST:event_btnIt23MouseClicked

    private void btnIt24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt24MouseClicked
        String pno = "Swt-0008";
        txtPno.setText(pno);
        txtName.setText(lblIN24.getText());
        txtUP.setText(lblItemP24.getText().substring(2));
    }//GEN-LAST:event_btnIt24MouseClicked

    private void btnIt25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt25MouseClicked
        String pno = "Oth-0001";
        txtPno.setText(pno);
        txtName.setText(lblIN25.getText());
        txtUP.setText(lblItemP25.getText().substring(2));
    }//GEN-LAST:event_btnIt25MouseClicked

    private void btnIt26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt26MouseClicked
        String pno = "Oth-0002";
        txtPno.setText(pno);
        txtName.setText(lblIN26.getText());
        txtUP.setText(lblItemP26.getText().substring(2));
    }//GEN-LAST:event_btnIt26MouseClicked

    private void btnIt27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt27MouseClicked
        String pno = "Oth-0003";
        txtPno.setText(pno);
        txtName.setText(lblIN27.getText());
        txtUP.setText(lblItemP27.getText().substring(2));
    }//GEN-LAST:event_btnIt27MouseClicked

    private void btnIt28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt28MouseClicked
        String pno = "Oth-0004";
        txtPno.setText(pno);
        txtName.setText(lblIN28.getText());
        txtUP.setText(lblItemP28.getText().substring(2));
    }//GEN-LAST:event_btnIt28MouseClicked

    private void btnIt29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt29MouseClicked
        String pno = "Oth-0005";
        txtPno.setText(pno);
        txtName.setText(lblIN29.getText());
        txtUP.setText(lblItemP29.getText().substring(2));
    }//GEN-LAST:event_btnIt29MouseClicked

    private void btnIt30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt30MouseClicked
        String pno = "Oth-0006";
        txtPno.setText(pno);
        txtName.setText(lblIN30.getText());
        txtUP.setText(lblItemP30.getText().substring(2));
    }//GEN-LAST:event_btnIt30MouseClicked

    private void btnIt31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt31MouseClicked
        String pno = "Oth-0007";
        txtPno.setText(pno);
        txtName.setText(lblIN31.getText());
        txtUP.setText(lblItemP31.getText().substring(2));
    }//GEN-LAST:event_btnIt31MouseClicked

    private void btnIt32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIt32MouseClicked
        String pno = "Oth-0008";
        txtPno.setText(pno);
        txtName.setText(lblIN32.getText());
        txtUP.setText(lblItemP32.getText().substring(2));
    }//GEN-LAST:event_btnIt32MouseClicked

    private void txtCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyPressed
        char key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER) {
            float net = Float.parseFloat(txtNet.getText());
            
            float cash = Float.parseFloat(txtCash.getText());
            
            txtBalence.setText(String.valueOf(cash - net + "0"));
            
        }
    }//GEN-LAST:event_txtCashKeyPressed

    private void btnFF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFF6ActionPerformed
        
        float net = Float.parseFloat(txtNet.getText());
        float cash = Float.parseFloat(txtCash.getText());
        txtBalence.setText(String.valueOf(cash - net + "0"));
    }//GEN-LAST:event_btnFF6ActionPerformed
    int no = 0;
    private void PriviweBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriviweBillActionPerformed
        myBill();


    }//GEN-LAST:event_PriviweBillActionPerformed

    private void PrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBillActionPerformed
 
        printBill();
    }//GEN-LAST:event_PrintBillActionPerformed

    private void SaveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBillActionPerformed
        
        try {
            DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
            int x = jTable2.getRowCount();
            FileWriter myWriter = new FileWriter("bigbazaar bill save.txt");

            String info;

            info = "                    Bigbazaar\n       No:12/123, Mumbai,Maharashta, India\n                Tle:+9176126301 \n                Tle:+9156767898\n\n" + "  Time:" + " " + lblTime.getText() + "\n" + "  Cashier :" + " " + lblOutput.getText() + "\n  Counter: 08\n****************************************************"
                    + "\n  Name                                    Total";
            myWriter.write("****************************************************\n");
            myWriter.write(info);
            for (int k = 0; k < x; k++) {
                myWriter.write("\n" + "  " + tablemodel.getValueAt(k, 1).toString() + "\n            " + tablemodel.getValueAt(k, 3).toString() + "*" + "" + tablemodel.getValueAt(k, 2).toString() + "                       " + tablemodel.getValueAt(k, 4).toString() + "0");
            }
            myWriter.write("\n====================================================\n");
            myWriter.write("*Net Total = " + "IND." + txtNet.getText());
            myWriter.write("\n*Cash       = " + "IND." + txtCash.getText() + ".00");
            myWriter.write("\n\n*Balance  = " + "IND." + txtBalence.getText());
            myWriter.write("\n****************************************************\n");
            myWriter.write("                     Thank You!\n                    Dhanyawaadh!\n                     Come Again!");
            myWriter.write("\n*****************************************************\n        Now you can join our Online Shopping\n       ....Achhe Zindargi ke liye Hameesha....\n                     BIGBAZAAR\n----------------------------------------------------");

            myWriter.close();
            JOptionPane.showMessageDialog(null, "save file");

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveBillActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       //this update code is find by me, anoter student in our class
        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row in the table to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String pno = txtPno.getText().trim();
        String name = txtName.getText().trim();
        String upriceStr = txtUP.getText().trim();
        String qtyStr = txtQty.getText().trim();
        String totalStr = txtTotal.getText().trim();

        if (pno.isEmpty() || name.isEmpty() || upriceStr.isEmpty() || qtyStr.isEmpty() || totalStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields (Pno, Name, U-Price, QTY, Total) must be filled for update.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int newQty;
        double newUprice;
        double newTotal;

        try {
            newQty = Integer.parseInt(qtyStr);
            newUprice = Double.parseDouble(upriceStr);
            newTotal = Double.parseDouble(totalStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Quantity, Unit Price, and Total.", "Input Error", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Invalid number format in update fields", e);
            return;
        }

        String oldQtyStr = tablemodel.getValueAt(selectedRow, 3).toString();
        String oldUpriceStr = tablemodel.getValueAt(selectedRow, 2).toString();

        int oldQty = 0;
        double oldUprice = 0.0;
        double oldTotal = 0.0;

        try {
            oldQty = Integer.parseInt(oldQtyStr);
            oldUprice = Double.parseDouble(oldUpriceStr);
            oldTotal = oldQty * oldUprice;
        } catch (NumberFormatException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error parsing old quantity/price from table for update. Data might be corrupted.", e);
            JOptionPane.showMessageDialog(this, "Error reading existing item data from table. Please check table data.", "Data Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int quantityDifference = newQty - oldQty;

        PreparedStatement checkPst = null;
        ResultSet checkRs = null;
        PreparedStatement updateDbPst = null;

        try {

            String checkSql = "SELECT qty FROM item WHERE pno = ?";
            checkPst = db.con.prepareStatement(checkSql);
            checkPst.setString(1, pno);
            checkRs = checkPst.executeQuery();

            if (checkRs.next()) {
                int currentDbStock = checkRs.getInt("qty");

                int adjustedDbStock = currentDbStock - quantityDifference;

                if (adjustedDbStock < 0) {
                    JOptionPane.showMessageDialog(this, "Not enough stock available for " + name + " to increase quantity. Available: " + currentDbStock, "Stock Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String updateDbSql = "UPDATE item SET qty = ? WHERE pno = ?";
                updateDbPst = db.con.prepareStatement(updateDbSql);
                updateDbPst.setInt(1, adjustedDbStock);
                updateDbPst.setString(2, pno);
                int rowsAffected = updateDbPst.executeUpdate();

                if (rowsAffected > 0) {

                    tablemodel.setValueAt(pno, selectedRow, 0);
                    tablemodel.setValueAt(name, selectedRow, 1);
                    tablemodel.setValueAt(upriceStr, selectedRow, 2);
                    tablemodel.setValueAt(qtyStr, selectedRow, 3);
                    tablemodel.setValueAt(totalStr, selectedRow, 4);

                    grandtotal = grandtotal - oldTotal + newTotal;
                    txtNet.setText(String.format("%.2f", grandtotal));

                    Clear();
                    JOptionPane.showMessageDialog(this, "Item updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update item stock in database. Item might not exist.", "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                JOptionPane.showMessageDialog(this, "Item with Product Number " + pno + " not found in database. Cannot update stock.", "Item Not Found", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Database error during Update operation", ex);
            JOptionPane.showMessageDialog(this, "A database error occurred: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {

            try {
                if (checkRs != null) {
                    checkRs.close();
                }
                if (checkPst != null) {
                    checkPst.close();
                }
                if (updateDbPst != null) {
                    updateDbPst.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error closing database resources after update", e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnIt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIt25ActionPerformed
       
    }//GEN-LAST:event_btnIt25ActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
         if (jTable2.getRowCount() > 0) {
            Send billsend = new Send(getBillDetails());
            billsend.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "No items to print in the bill.", "Print Error", JOptionPane.WARNING_MESSAGE);
        }
//         Send mySend = new Send();
//         mySend.setVisible(true);
        
        
    }//GEN-LAST:event_sendActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Product CSV File");

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection != JFileChooser.APPROVE_OPTION) {
            return; // User canceled save dialog
        }

        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        if (!filePath.toLowerCase().endsWith(".csv")) {
            filePath += ".csv"; // Ensure the file has .csv extension
        }

        java.io.File file = new java.io.File(filePath);
        if (file.exists()) {
            int overwrite = JOptionPane.showConfirmDialog(this,
                    "File already exists. Overwrite?",
                    "Confirm Overwrite", JOptionPane.YES_NO_OPTION);
            if (overwrite != JOptionPane.YES_OPTION) {
                return; // User chose not to overwrite
            }
        }

        DBConnection dbConnection = new DBConnection();
        String query = "SELECT * FROM item";

        try (
                Connection conn = dbConnection.con; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query); PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Write CSV headers
            for (int i = 1; i <= columnCount; i++) {
                writer.print(metaData.getColumnName(i));
                if (i < columnCount) {
                    writer.print(",");
                }
            }
            writer.println();

            // Write CSV data rows
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    Object value = rs.getObject(i);
                    if (value != null) {
                        String stringValue = value.toString();
                        // Escape commas and quotes in CSV
                        if (stringValue.contains(",") || stringValue.contains("\"")) {
                            stringValue = "\"" + stringValue.replace("\"", "\"\"") + "\"";
                        }
                        writer.print(stringValue);
                    }
                    if (i < columnCount) {
                        writer.print(",");
                    }
                }
                writer.println();
            }

            JOptionPane.showMessageDialog(this, "Products exported to CSV file:\n" + filePath);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Export failed: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            dbConnection.closeConnection();
        }
        
        
        
        
        
        //bill csv
//        JFileChooser fileChooser = new JFileChooser();
//fileChooser.setDialogTitle("Save Bill as CSV");
//
//int userSelection = fileChooser.showSaveDialog(null);
//
//if (userSelection == JFileChooser.APPROVE_OPTION) {
//    File fileToSave = fileChooser.getSelectedFile();
//
//    // Add .csv extension if not present
//    String filePath = fileToSave.getAbsolutePath();
//    if (!filePath.toLowerCase().endsWith(".csv")) {
//        filePath += ".csv";
//    }
//
//    try (FileWriter writer = new FileWriter(filePath)) {
//        String billText = txtArea.getText(); // JTextArea name
//        String[] lines = billText.split("\\n");
//
//        for (String line : lines) {
//            writer.write(line + "\n");
//        }
//
//        JOptionPane.showMessageDialog(null, "Bill saved successfully at:\n" + filePath);
//
//    } catch (IOException e) {
//        JOptionPane.showMessageDialog(null, "Error saving the file!");
//        e.printStackTrace();
//    }
//}

    }//GEN-LAST:event_exportActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
      txtPno.setText("");
        txtName.setText("");
        txtUP.setText("");
        txtQty.setText("");
        txtTotal.setText("");
        txtCash.setText("");
        txtBalence.setText("");
        txtArea.setText("");
        txtNet.setText("");
        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        tablemodel.setRowCount(0); 
        grandtotal=0.0;
                
                
        
    }//GEN-LAST:event_nextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if (jTable2.getRowCount() > 0) {
            billZoom billview = new billZoom(getBillDetails());
            billview.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No items to print in the bill.", "Print Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AD1 myad= new AD1();
         myad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIt3ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
      AddItem addItem = new AddItem();
        addItem.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
        //find stock of sale
        try {

            String msg = "SELECT * FROM item WHERE pno=? ";
            pst = db.con.prepareStatement(msg);
            pst.setString(1, txtFind.getText());
            rs = pst.executeQuery();

            //Sort kireema
            DefaultTableModel tabelModel = (DefaultTableModel) jTable1.getModel();
            String fno = txtFind.getText();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tabelModel);
            jTable1.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(fno));

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFindKeyPressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImage2;
    private javax.swing.JLabel BGImage3;
    private javax.swing.JButton PrintBill;
    private javax.swing.JButton PriviweBill;
    private javax.swing.JButton SaveBill;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFF;
    private javax.swing.JButton btnFF1;
    private javax.swing.JButton btnFF6;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnIt1;
    private javax.swing.JButton btnIt10;
    private javax.swing.JButton btnIt11;
    private javax.swing.JButton btnIt12;
    private javax.swing.JButton btnIt13;
    private javax.swing.JButton btnIt14;
    private javax.swing.JButton btnIt15;
    private javax.swing.JButton btnIt16;
    private javax.swing.JButton btnIt17;
    private javax.swing.JButton btnIt18;
    private javax.swing.JButton btnIt19;
    private javax.swing.JButton btnIt2;
    private javax.swing.JButton btnIt20;
    private javax.swing.JButton btnIt21;
    private javax.swing.JButton btnIt22;
    private javax.swing.JButton btnIt23;
    private javax.swing.JButton btnIt24;
    private javax.swing.JButton btnIt25;
    private javax.swing.JButton btnIt26;
    private javax.swing.JButton btnIt27;
    private javax.swing.JButton btnIt28;
    private javax.swing.JButton btnIt29;
    private javax.swing.JButton btnIt3;
    private javax.swing.JButton btnIt30;
    private javax.swing.JButton btnIt31;
    private javax.swing.JButton btnIt32;
    private javax.swing.JButton btnIt4;
    private javax.swing.JButton btnIt5;
    private javax.swing.JButton btnIt6;
    private javax.swing.JButton btnIt7;
    private javax.swing.JButton btnIt8;
    private javax.swing.JButton btnIt9;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnShift;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton export;
    private javax.swing.JLabel findS;
    private my_pos_system.ImageAvater imageAvater;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblIN1;
    private javax.swing.JLabel lblIN10;
    private javax.swing.JLabel lblIN11;
    private javax.swing.JLabel lblIN12;
    private javax.swing.JLabel lblIN13;
    private javax.swing.JLabel lblIN14;
    private javax.swing.JLabel lblIN15;
    private javax.swing.JLabel lblIN16;
    private javax.swing.JLabel lblIN17;
    private javax.swing.JLabel lblIN18;
    private javax.swing.JLabel lblIN19;
    private javax.swing.JLabel lblIN2;
    private javax.swing.JLabel lblIN20;
    private javax.swing.JLabel lblIN21;
    private javax.swing.JLabel lblIN22;
    private javax.swing.JLabel lblIN23;
    private javax.swing.JLabel lblIN24;
    private javax.swing.JLabel lblIN25;
    private javax.swing.JLabel lblIN26;
    private javax.swing.JLabel lblIN27;
    private javax.swing.JLabel lblIN28;
    private javax.swing.JLabel lblIN29;
    private javax.swing.JLabel lblIN3;
    private javax.swing.JLabel lblIN30;
    private javax.swing.JLabel lblIN31;
    private javax.swing.JLabel lblIN32;
    private javax.swing.JLabel lblIN4;
    private javax.swing.JLabel lblIN5;
    private javax.swing.JLabel lblIN6;
    private javax.swing.JLabel lblIN7;
    private javax.swing.JLabel lblIN8;
    private javax.swing.JLabel lblIN9;
    private javax.swing.JLabel lblItemP1;
    private javax.swing.JLabel lblItemP10;
    private javax.swing.JLabel lblItemP11;
    private javax.swing.JLabel lblItemP12;
    private javax.swing.JLabel lblItemP13;
    private javax.swing.JLabel lblItemP14;
    private javax.swing.JLabel lblItemP15;
    private javax.swing.JLabel lblItemP16;
    private javax.swing.JLabel lblItemP17;
    private javax.swing.JLabel lblItemP18;
    private javax.swing.JLabel lblItemP19;
    private javax.swing.JLabel lblItemP2;
    private javax.swing.JLabel lblItemP20;
    private javax.swing.JLabel lblItemP21;
    private javax.swing.JLabel lblItemP22;
    private javax.swing.JLabel lblItemP23;
    private javax.swing.JLabel lblItemP24;
    private javax.swing.JLabel lblItemP25;
    private javax.swing.JLabel lblItemP26;
    private javax.swing.JLabel lblItemP27;
    private javax.swing.JLabel lblItemP28;
    private javax.swing.JLabel lblItemP29;
    private javax.swing.JLabel lblItemP3;
    private javax.swing.JLabel lblItemP30;
    private javax.swing.JLabel lblItemP31;
    private javax.swing.JLabel lblItemP32;
    private javax.swing.JLabel lblItemP4;
    private javax.swing.JLabel lblItemP5;
    private javax.swing.JLabel lblItemP6;
    private javax.swing.JLabel lblItemP7;
    private javax.swing.JLabel lblItemP8;
    private javax.swing.JLabel lblItemP9;
    private javax.swing.JLabel lblKP;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel logo1;
    private javax.swing.JButton next;
    private javax.swing.JButton send;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBalence;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNet;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUP;
    // End of variables declaration//GEN-END:variables

    private void loadBGImage() {
        //some images resize 
        BGImage2.setIcon(resize("src\\fff.png"));
        logo1.setIcon(resize1("src\\logo.jpg"));
        BGImage3.setIcon(resize2("src\\wall2.png"));
        // btnFF.setIcon(resize3("src\\t5.png"));
        btnIt1.setIcon(resize4("src\\to1.png"));
        btnIt2.setIcon(resize4("src\\to2.jpg"));
        btnIt3.setIcon(resize4("src\\to3.jpg"));
        btnIt4.setIcon(resize4("src\\t.jpg"));
        btnIt5.setIcon(resize4("src\\to5.jpg"));
        btnIt6.setIcon(resize4("src\\to4.png"));
        btnIt7.setIcon(resize4("src\\delta t.jpg"));
        btnIt8.setIcon(resize4("src\\bob1.png"));
        btnIt9.setIcon(resize4("src\\c1.jpg"));
        btnIt10.setIcon(resize4("src\\c2.jpg"));
        btnIt11.setIcon(resize4("src\\c3.jpg"));
        btnIt12.setIcon(resize4("src\\c4.jpg"));
        btnIt13.setIcon(resize4("src\\cc.jpg"));
        btnIt14.setIcon(resize4("src\\hartCoco.jpg"));
        btnIt15.setIcon(resize4("src\\c5.jpg"));
        btnIt16.setIcon(resize4("src\\t.jpg"));

        btnIt17.setIcon(resize4("src\\mu.jpg"));
        btnIt18.setIcon(resize4("src\\rolo.jpg"));
        btnIt19.setIcon(resize4("src\\oo.jpg"));
        btnIt20.setIcon(resize4("src\\uno.jpg"));
        btnIt21.setIcon(resize4("src\\lolipop1.jpg"));
        btnIt22.setIcon(resize4("src\\mm.jpg"));
        btnIt23.setIcon(resize4("src\\kisses.jpg"));
        btnIt24.setIcon(resize4("src\\jalebi.jpg"));

        btnIt25.setIcon(resize4("src\\machis.jpg"));
        btnIt26.setIcon(resize4("src\\pin.jpg"));
        btnIt27.setIcon(resize4("src\\kapuru.jpg"));
        btnIt28.setIcon(resize4("src\\spoon.jpg"));
        btnIt29.setIcon(resize4("src\\bordpin.jpg"));
        btnIt30.setIcon(resize4("src\\litt.png"));
        btnIt31.setIcon(resize4("src\\dhaga.png"));
        btnIt32.setIcon(resize4("src\\needel.jpg"));
        
         findS.setIcon(resize5("src\\SSS.png"));
    }

    private Icon resize(String image) {

        ImageIcon icon = new ImageIcon(image);
        Image scal = icon.getImage().getScaledInstance(BGImage2.getWidth(), BGImage2.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scal);

    }

    private Icon resize1(String image) {

        ImageIcon icon = new ImageIcon(image);
        Image scal = icon.getImage().getScaledInstance(logo1.getWidth(), logo1.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scal);

    }

    private Icon resize2(String image) {

        ImageIcon icon = new ImageIcon(image);
        Image scal = icon.getImage().getScaledInstance(BGImage3.getWidth(), BGImage3.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scal);

    }

    private Icon resize4(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scal = icon.getImage().getScaledInstance(btnIt1.getWidth(), btnIt1.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scal);

    }
     private Icon resize5(String image) {
        ImageIcon icon = new ImageIcon(image);
        Image scal = icon.getImage().getScaledInstance(findS.getWidth(), findS.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scal);

    }

//      private Icon resize3(String image) {
//
//        ImageIcon icon = new ImageIcon(image);
//        Image scal = icon.getImage().getScaledInstance(btnFF.getWidth(), btnFF.getHeight(), Image.SCALE_SMOOTH);
//        return new ImageIcon(scal);
//
//    }
    private void loadTime() {
        SimpleDateFormat myFormat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
        Date date = new Date();
        lblTime.setText(myFormat.format(date));
       
        Timer myTimer = new Timer(1000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                lblTime.setText(myFormat.format(date));
               
            }
        });

        myTimer.start();

    }

    private void loadImageU(User user) {

        if (user.getImage() == null) {
            ImageIcon icon = new ImageIcon(imagePath);
            Image scaled = icon.getImage().getScaledInstance(lblWidth, lblHeight, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
            imageAvater.setImage(icon);
        } else {
            ImageIcon icon = new ImageIcon(user.getImage());
            Image scaled = icon.getImage().getScaledInstance(lblWidth, lblHeight, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
            imageAvater.setImage(icon);
        }
        imageAvater.repaint();

    }

    private void upadateImage(String imagePath, User user) {
        try {
            File imageFile = new File(imagePath);
            byte[] databaseImage = Files.readAllBytes(imageFile.toPath());
            String msg = "UPDATE  user set image=? where user_id=? ";
            pst = db.con.prepareStatement(msg);
            pst.setBytes(1, databaseImage);
            pst.setString(2, getUser.getUserId());
            pst.executeUpdate();
            this.getUser.setImage(databaseImage);
            JOptionPane.showMessageDialog(null, "Image Updated");
        } catch (IOException | SQLException ex) {
            System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    private void Display() {

        try {
            String msg = "SELECT * FROM item";
            pst = db.con.prepareStatement(msg);
            rs = pst.executeQuery();
            while (rs.next()) {
                String pno = rs.getString(1);
                String name = rs.getString(2);
                String qty = rs.getString(3);
                String unit_price = rs.getString(4);

                DefaultTableModel tablemodel = (DefaultTableModel) jTable1.getModel();

                Object[] data = new Object[4];
                data[0] = pno;
                data[1] = name;
                data[2] = qty;
                data[3] = unit_price;

                tablemodel.addRow(data);

            }
        } catch (SQLException ex) {;

            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void table1Desing() {
        JTableHeader header = jTable1.getTableHeader();
        header.setOpaque(false);
        header.setFont(new Font("Arial", Font.BOLD, 12));
        header.setForeground(Color.black);
        header.setBackground(new Color(255, 204, 0));

    }

    private void Clear() {
        txtPno.setText("");
        txtName.setText("");
        txtUP.setText("");
        txtQty.setText("");
        txtTotal.setText("");
       
       
       
    }

    private boolean isQtyAvailable(String dpno, int qty) {
        try {
            String sql = "select * from item where Pno=?";
            pst = db.con.prepareStatement(sql);
            pst.setString(1, dpno);
            rs = pst.executeQuery();
            rs.next();
            int tableQty = rs.getInt(3);
            if (tableQty >= qty) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private void myBill() {
        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        int x = jTable2.getRowCount();
        int num = no++;
        txtArea.setText("");
        String info;

        info = "                                Bigbazaar\n       No:12/123, Mumbai,Maharashta, India \n                        Tle:+9176126301 \n                        Tle:+9154657683\n\n" + "  Time:" + " " + lblTime.getText() + "\n" + "  Cashier :" + " " + lblOutput.getText() + "\n  Counter: 08\n**************************************************"
                + "\n  Name                                                  Total(₹)";
        txtArea.append("**************************************************\n");
        txtArea.append(info);
        for (int k = 0; k < x; k++) {
            txtArea.append("\n" + "  " + tablemodel.getValueAt(k, 1).toString() + "\n            " + tablemodel.getValueAt(k, 3).toString() + "*" + "" + tablemodel.getValueAt(k, 2).toString() + "                                      " + tablemodel.getValueAt(k, 4).toString() + "0");
        }
        txtArea.append("\n===================================\n");
        txtArea.append("*Net Total = " + "(₹)INR." + txtNet.getText());
        txtArea.append("\n*Cash       = " + "(₹)INR." + txtCash.getText() + ".00");
        txtArea.append("\n\n*Balance  = " + "(₹)INR." + txtBalence.getText());
        txtArea.append("\n*************************************************\n");
        txtArea.append("                              Thank You!\n                          Dhanyawaadh!\n                            Come Again!");
        txtArea.append("\n*************************************************\n        Now you can join our Online Shopping\n       ....Achhe Zindargi ke liye Hameesha....\n                             BIGBAZAAR\n--------------------------------------------------------------");
    }

    private void printBill() {
       
        DefaultTableModel tablemodel = (DefaultTableModel) jTable2.getModel();
        int x = jTable2.getRowCount();
        ArrayList<String> billDetails = new ArrayList<>();

        String info;
        billDetails.add("******************************************\n");
//        info="                    Bigbazaar"+"\n"+"       No:12/123, Mumbai,Maharashta, India\n                Tle:+91761263014 \n                Tle:+9156767898\n\n"+"  Time:"+" " +lblTime.getText()+"\n"+"  Cashier :"+" "+lblOutput.getText()+"\n  Counter: 08\n**************************************************"
//              +"\n  Name                                    Total";
        billDetails.add("                                   Bigbazaar\n");
        billDetails.add("              No:12/123, Mumbai,Maharashta, India\n");
        billDetails.add("                               Tle:+9176126301 \n");
        billDetails.add("                               Tle:+9156767898\n\n");
        billDetails.add("                               ");
        billDetails.add("  Time:" + " " + lblTime.getText() + "\n");
        billDetails.add("  Cashier :" + " " + lblOutput.getText());
        billDetails.add("\n  Counter: 08");
        billDetails.add("\n******************************************");
        billDetails.add("\n  Name                                                         Total(₹)");
//                billDetails.add("                                    Total");

        for (int k = 0; k < x; k++) {
            billDetails.add("\n" + "  " + tablemodel.getValueAt(k, 1).toString() + "\n      " + tablemodel.getValueAt(k, 3).toString() + "*" + "" + tablemodel.getValueAt(k, 2).toString());
            billDetails.add("                                                                     " + tablemodel.getValueAt(k, 4).toString() + "0");
        }
        billDetails.add("\n=======================================\n");
        billDetails.add("*Net Total = " + "(₹)INR." + txtNet.getText());
        billDetails.add("\n*Cash       = " + "(₹)INR." + txtCash.getText() + ".00");
        billDetails.add("\n\n*Balance  = " + "(₹)INR." + txtBalence.getText());
        billDetails.add("\n*******************************************\n");
        billDetails.add("                                   Thank You!");
        billDetails.add("\n                                 Dhanyawaadh!");
        billDetails.add("\n                                  Come Again!");

        billDetails.add("\n\n********************************************\n");
        billDetails.add("                 Now you can join our Online Shopping\n");
        billDetails.add("           ....Achhe Zindargi ke liye Hameesha....\n");
        billDetails.add("                                BIGBAZAAR");
        billDetails.add("\n----------------------------------------------------------------------");
        String logoPath = "src//logo.jpg"; // Update this to the correct path

        BillPrinter billPrinter = new BillPrinter(logoPath, billDetails);
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(billPrinter);

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
                JOptionPane.showMessageDialog(null, "Printing Redy");
            } catch (PrinterException ex) {
                System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }

        }

    }

    private void sendEmail(String sentTo, String subject, String messageText) {

        final String fromEmail = "contact.kawya@gmail.com"; // Your Gmail
        final String password = "fcfi doiv lrtg xvjq";     // App password from Gmail (not your actual password)

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS

        javax.mail.Session session = javax.mail.Session.getInstance(props, new javax.mail.Authenticator() {
           
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            javax.mail.Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(
                    javax.mail.Message.RecipientType.TO, InternetAddress.parse(sentTo)
            );
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email failed: " + e.getMessage());
        }

    }

    private void Clear2() {
        txtPno.setText("");
        txtName.setText("");
        txtUP.setText("");
        txtQty.setText("");
        txtTotal.setText("");
         
    }

    
     public String getBillDetails() {
        return txtArea.getText();
    }
}
