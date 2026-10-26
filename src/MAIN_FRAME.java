
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rudra
 */
public class MAIN_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form MAIN_FRAME
     */
    public MAIN_FRAME() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("jMenu6");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem29.setText("jMenuItem29");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 122, -1, 631));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1474, 122, 50, 10));

        jPanel1.setBackground(new java.awt.Color(208, 170, 17));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/company.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 910));

        jMenuBar2.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar2.setMinimumSize(new java.awt.Dimension(1474, 50));
        jMenuBar2.setOpaque(true);
        jMenuBar2.setPreferredSize(new java.awt.Dimension(1474, 50));

        jMenu7.setBackground(new java.awt.Color(1, 107, 143));
        jMenu7.setText("          ABOUT US         ");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu7.setOpaque(true);
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenu7.add(jSeparator2);
        jMenu7.add(jSeparator4);

        jMenuItem9.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem9.setText("Description");
        jMenuItem9.setOpaque(true);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem34.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem34.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem34.setText("Admin List");
        jMenuItem34.setOpaque(true);
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem34);

        jMenuItem33.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem33.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem33.setText("Vehicle Type Available");
        jMenuItem33.setOpaque(true);
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem33);

        jMenuItem30.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem30.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem30.setText("Total Vehicles");
        jMenuItem30.setOpaque(true);
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem30);

        jMenuItem31.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem31.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem31.setText("Feedback");
        jMenuItem31.setOpaque(true);
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem31);

        jMenuItem32.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem32.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem32.setText("Log Out");
        jMenuItem32.setOpaque(true);
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem32);

        jMenuItem39.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem39.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem39.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem39.setText("Calculator");
        jMenuItem39.setOpaque(true);
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem39);

        jMenuItem40.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem40.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem40.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem40.setText("Notepad");
        jMenuItem40.setOpaque(true);
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem40);

        jMenuBar2.add(jMenu7);

        jMenu9.setBackground(new java.awt.Color(1, 107, 143));
        jMenu9.setText("            VEHICLES         ");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu9.setOpaque(true);

        jMenuItem2.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem2.setText("View Vehicles");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem3.setText("Search Vehicle");
        jMenuItem3.setOpaque(true);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuItem35.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem35.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem35.setText("Vehicle Type Available");
        jMenuItem35.setOpaque(true);
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem35);
        jMenu9.add(jSeparator5);

        jMenuItem10.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jMenuItem10.setText("Add Vehicle");
        jMenuItem10.setOpaque(true);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenuItem12.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jMenuItem12.setText("Delete  Vehicle");
        jMenuItem12.setOpaque(true);
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuItem11.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jMenuItem11.setText("Edit Vehicle");
        jMenuItem11.setOpaque(true);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);
        jMenu9.add(jSeparator1);

        jMenuItem5.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem5.setText("Total Vehicles");
        jMenuItem5.setOpaque(true);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuBar2.add(jMenu9);

        jMenu2.setBackground(new java.awt.Color(1, 107, 143));
        jMenu2.setText("          MEMBERS      ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu2.setOpaque(true);

        jMenuItem22.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem22.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem22.setText("Service User Registration");
        jMenuItem22.setOpaque(true);
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem22);

        jMenuItem23.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem23.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem23.setText("Service User Modification");
        jMenuItem23.setOpaque(true);
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem23);

        jMenuItem24.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem24.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem24.setText("Service User Deletion");
        jMenuItem24.setOpaque(true);
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem24);

        jMenuItem25.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem25.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem25.setText("Service User List");
        jMenuItem25.setOpaque(true);
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);
        jMenu2.add(jSeparator7);

        jMenuItem17.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem17.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem17.setText("Add Member");
        jMenuItem17.setOpaque(true);
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem19.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem19.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem19.setText("Edit Member");
        jMenuItem19.setOpaque(true);
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem21.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem21.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem21.setText("Member List");
        jMenuItem21.setOpaque(true);
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem21);

        jMenuItem20.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem20.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem20.setText("Delete Member");
        jMenuItem20.setOpaque(true);
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem20);

        jMenuItem18.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem18.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem18.setText("Search Member");
        jMenuItem18.setOpaque(true);
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuBar2.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(1, 107, 143));
        jMenu3.setText("        CUSTOMER SUPPORT      ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu3.setOpaque(true);

        jMenuItem26.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem26.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem26.setText("Contact Us");
        jMenuItem26.setOpaque(true);
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem26);

        jMenuItem38.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem38.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem38.setText("ContactSupport Team");
        jMenuItem38.setOpaque(true);
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem38);

        jMenuBar2.add(jMenu3);

        jMenu1.setBackground(new java.awt.Color(1, 107, 143));
        jMenu1.setText("          ON BOOKING         ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.setOpaque(true);

        jMenu8.setBackground(new java.awt.Color(51, 255, 255));
        jMenu8.setText("Vehicle Booking");
        jMenu8.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenu8.setOpaque(true);

        jMenuItem13.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jMenuItem13.setText("Create Booking");
        jMenuItem13.setOpaque(true);
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem13);

        jMenuItem6.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem6.setText("Edit Booking");
        jMenuItem6.setOpaque(true);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuItem36.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem36.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem36.setText("Search Booking");
        jMenuItem36.setOpaque(true);
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem36);

        jMenuItem37.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem37.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem37.setText("Payment");
        jMenuItem37.setOpaque(true);
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem37);

        jMenuItem14.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jMenuItem14.setText("Return Vehicle");
        jMenuItem14.setOpaque(true);
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem14);

        jMenu1.add(jMenu8);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem16.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem16.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jMenuItem16.setText("Available Vehicle");
        jMenuItem16.setOpaque(true);
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar2.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(255, 0, 0));
        jMenu4.setText("               QUIT               ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu4.setOpaque(true);
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 204, 204));
        jMenu5.setText("           Feedback              ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.setOpaque(true);

        jMenuItem28.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem28.setText("Customer Feedback");
        jMenuItem28.setOpaque(true);
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem28);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
         new MMRecordNav().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new view_vehicle().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new VR_NAV().setVisible(true);
       // this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new LOG_IN_FORM1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        new LOG_IN_FORM1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        new LOG_IN_FORM1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        new veh_issue().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        new vehicle_return().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        new contact_us().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        new Avilable_Veh().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        
        new LOG_IN_FORM2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
         new LOG_IN_FORM2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
         new LOG_IN_FORM2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
         new MEM_LIST().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        new MODIFI_3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        new MMmodification().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        new MEM_USE_SER_DEL().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        
        
        new MAIN_MEM_LIST().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new Description().setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        new Feedback_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
     Statement st=null;
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
             String sq="delete from login  where status='TRUE'";
           st=con.createStatement();
           st.executeUpdate(sq);
             System.exit(0);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }       
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
         new VEH_TYPE().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
       new total_vehicle().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        new MEM_LIST().setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
         new VEH_TYPE().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        new Feedback_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Edit_Book().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        new Search_Book().setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        new pay_ment().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        new contact_me().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Statement st=null;
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
             String sq="update login set status='FALSE' where status='TRUE'";
           st=con.createStatement();
           st.executeUpdate(sq);
             System.exit(0);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
      
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new total_vehicle().setVisible(true);
       // this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
         new MEM_LIST().setVisible(true);
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
       try{
           Runtime.getRuntime().exec("calc.exe");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        try{
           Runtime.getRuntime().exec("notepad.exe");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    /**FALSE
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
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MAIN_FRAME().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
