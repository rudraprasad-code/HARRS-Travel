import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class veh_issue extends javax.swing.JFrame {

   
    public veh_issue() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new rojerusan.RSMaterialButtonCircle();
        jButton4 = new rojerusan.RSMaterialButtonRectangle();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1440, 910));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText(" < BACK  ");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 39));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select if a service user");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 28));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member No.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 123, 135, 39));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 123, 142, 39));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 180, 339, 38));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 180, 135, 38));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Membership Date");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 236, 135, 41));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 236, 221, 41));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 296, 139, 42));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 295, 135, 42));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select if a main user");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 201, 28));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 407, 1521, 13));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Select a Vehicle");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 28));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Booking No.");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 472, 135, 39));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 472, 252, 39));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vehicle Name");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 529, 135, 38));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 529, 252, 38));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Disc");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 585, 135, 41));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 585, 709, 41));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vehicle No.");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 644, 135, 42));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 645, 211, 42));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 700, 211, 42));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter Issue Date :");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 699, 135, 42));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 211, 42));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Issue Status");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 140, 42));

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(226, 140, 10));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VEHICLE ISSUE FORM");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1515, 61));

        jList1.setBackground(new java.awt.Color(0, 0, 0));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 240));

        jList2.setBackground(new java.awt.Color(0, 0, 0));
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setModel(new DefaultListModel());
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 210, 240));

        jList3.setBackground(new java.awt.Color(0, 0, 0));
        jList3.setForeground(new java.awt.Color(255, 255, 255));
        jList3.setModel(new DefaultListModel());
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 210, 270));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 430, 60));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PickUp Location");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 140, 42));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 211, 42));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setOpaque(true);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 770, 200, 40));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 770, 160, 60));

        jButton4.setBackground(new java.awt.Color(102, 0, 255));
        jButton4.setText("Payment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 700, 220, 60));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Booking Price");
        jLabel25.setOpaque(true);
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 770, 140, 42));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DropOff Location");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 140, 42));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 211, 42));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Payment Status");
        jLabel23.setOpaque(true);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 710, 140, 39));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 710, 210, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.jpg"))); // NOI18N
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 930));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 236, 221, 41));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Payment Status");
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 140, 42));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 211, 42));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 211, 42));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Payment Status");
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 140, 42));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PickUp Location");
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 140, 42));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 211, 42));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.jpg"))); // NOI18N
        jLabel20.setOpaque(true);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 930));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Issue Status");
        jLabel24.setOpaque(true);
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 140, 42));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 211, 42));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
         
    Statement mem = null;
    ResultSet rmem = null;
    String st1 = "NON";
    String meme = "SELECT * FROM member WHERE mem_issue = '" + st1 +  "';";

    Statement mm = null;
    ResultSet rmm = null;
    String st = "NON";
    String mme = "SELECT * FROM members WHERE mem_issue = '" + st +  "';";

    Statement ve = null;
    ResultSet rve = null;
    String st2 = "NON";
    String vee= "SELECT * FROM veh WHERE issue_status = '" + st2 +  "';";

    Statement smissue = null;
    ResultSet rsmissue = null;
    String m = "SELECT * FROM missue";

    Statement stissue = null;
    ResultSet rstissue = null;
    String t = "SELECT * FROM tissue";
    
    Statement sbook = null;
    ResultSet rsbook = null;
    String b = "SELECT * FROM booking";
        
    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    
    
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         String MembNo = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String quer = "SELECT * FROM Member WHERE memb_no = " + (Mno) + ";";
        try {
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
          mem = con.createStatement();
            rmem = mem.executeQuery(quer);

            if (rmem.next()) {
                String MName = rmem.getString("memb_name");
                String MDate = rmem.getString("mdate");
                String MStatus = rmem.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                jTextField1.setText(Mno);
                jTextField2.setText(MName);
                jTextField3.setText(MDate);
                jTextField4.setText(MStatus);
            } else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN TABLE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
        String MembNo = (String) jList2.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String quer = "SELECT * FROM Members WHERE memb_no = " + (Mno) + ";";
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
           mm = con.createStatement();
            rmm = mm.executeQuery(quer);

            if ( rmm.next()) {
                String MName =  rmm.getString("memb_name");
                String MDate = rmm.getString("mdate");
                String MStatus = rmm.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                jTextField1.setText(Mno);
                jTextField2.setText(MName);
                jTextField3.setText(MDate);
                jTextField4.setText(MStatus);
            } else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN TABLE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
        String MembNo = (String) jList3.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String quer = "SELECT * FROM veh WHERE v_no = " +(Mno)+ ";";
        try {
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            ve = con.createStatement();
            rve = ve.executeQuery(quer);

            if (rve.next()) {
                String MName = rve.getString("v_name");
                String disc = rve.getString("otr_disc");
                String MStatus = rve.getString("issue_status");
                String book = rve.getString("RS_Book");
                // Displaying the contents in respective text boxes.
          
               jTextField5.setText(Mno);
               jTextField6.setText(MName);
               jTextField7.setText(disc);
               jTextField8.setText(Mno);
               jTextField10.setText(MStatus);
               jLabel26.setText(book);
               jButton1.setEnabled(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN TABLE");
            }
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField8.setEditable(false);
        jTextField7.setEditable(false);
        jTextField6.setEditable(false);
        jTextField5.setEditable(false);
        jTextField10.setEditable(false);

     
       try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");

            mem = con.createStatement();
            rmem = mem.executeQuery(meme);
            // for service users
                      
            DefaultListModel dModel = (DefaultListModel) jList1.getModel();
            dModel.clear();
            while (rmem.next()) {
                String Mno = rmem.getString("memb_no");
                String MName = rmem.getString("memb_name");
                dModel.addElement(Mno + "- " + MName);
            
          }
           jList1.setModel(dModel);
           //for veh
           DefaultListModel fModel = (DefaultListModel) jList3.getModel();
                 fModel.clear();
            ve = con.createStatement();
            rve = ve.executeQuery(vee);
            while (rve.next()) {
                String Ano = rve.getString("v_no");
                String BTitle = rve.getString("v_name");

                fModel.addElement(Ano + "- " + BTitle);

        }
             jList3.setModel(fModel);
        //for main members
        DefaultListModel cModel = (DefaultListModel) jList2.getModel();
            cModel.clear();
           mm = con.createStatement();
            rmm = mm.executeQuery(mme);
            while (rmm.next()) {
                String Ano = rmm.getString("memb_no");
                String BTitle = rmm.getString("memb_name");


                cModel.addElement(Ano + "- " + BTitle);

        }
             jList2.setModel(cModel);

        }

    catch (SQLException e) {
        JOptionPane.showMessageDialog(this,e.getMessage());
        }
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new MAIN_FRAME().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x=jComboBox1.getSelectedIndex();

        if(x==0) {
            jButton4.setEnabled(true);
            jButton1.setEnabled(false);
        }
        else

        if(x==1) {
            jButton4.setEnabled(false);
            jButton1.setEnabled(true);
        }
         try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Missue table
            smissue = con.createStatement();
            rsmissue =smissue.executeQuery(m);

            // Tissue table
            stissue = con.createStatement();
            rstissue = stissue.executeQuery(t);

            sbook = con.createStatement();
            rsbook =smissue.executeQuery(b);

            int Acno = Integer.parseInt(jTextField5.getText().trim());
            int Mno = Integer.parseInt(jTextField1.getText().trim());
            int Vno = Integer.parseInt(jTextField8.getText().trim());
            String name=jTextField2.getText();
            String idt = jTextField9.getText();
            String ploc = jTextField11.getText();
            String dloc = jTextField12.getText();
            String vname = jTextField6.getText();
            Object ps = jComboBox1.getSelectedItem();
            String rdt = idt;
            String mdt = jTextField3.getText();
            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {

                String strSQL = "INSERT INTO missue(acc_no, memb_no, idate, rdate) VALUES ('"+(Acno)+"', '"+(Mno)+"', '"+(idt)+"', '"+(rdt)+"')";

                String strSQL1 = "INSERT INTO tissue(acc_no, memb_no, idate, rdate) VALUES ('"+(Acno)+"', '"+(Mno)+"', '"+(idt)+"', '"+(rdt)+"')";
                String strSQL2 = "INSERT INTO booking(user_id, name, membership_date, booking_id,vehicle_id,veh_name,pickup_loc,dropoff_loc,booking_date,payment_status) VALUES ('"+(Mno)+"', '"+(name)+"', '"+(mdt)+"','"+(Acno)+"','"+(Vno)+"','"+(vname)+"','"+(ploc)+"','"+(dloc)+"', '"+(idt)+"', '"+(ps)+"')";

                smissue.executeUpdate(strSQL);
                stissue.executeUpdate(strSQL1);
                sbook.executeUpdate(strSQL2);

                // Change the status as veh issued
                String sta = "YES";  // Lib table
                String strSQLa = "Update veh set issue_status ='"+(sta)+"' where v_no = " + (Acno)+"";
                ve.executeUpdate(strSQLa);

                // Change the status as Member has a vehicle
                if(Mno>7000){
                    String stb = "YES";  // Member table
                    String strSQLb = "Update Members set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                    mm.executeUpdate(strSQLb);
                    JOptionPane.showMessageDialog(this, "Record update successfully");
                }
                else
                {
                    String stb = "YES";  // Member table
                    String strSQLb = "Update Member set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                    mem.executeUpdate(strSQLb);
                    JOptionPane.showMessageDialog(this, "Record update successfully"
                        + '\n'+"thanks have a nice journey");
                }
            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=jComboBox1.getSelectedIndex();
        int y=0;
        if(x==0) {
            jButton4.setEnabled(true);
            jButton1.setEnabled(false);
        }
        else

        if(x==1) {
            jButton4.setEnabled(false);
            jButton1.setEnabled(true);
        }
        if(y==0){
        new pay_ment().setVisible(true);
        //this.setVisible(false);
        y=y+1;
        }
        if(y==1){
         try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Missue table
            smissue = con.createStatement();
            rsmissue =smissue.executeQuery(m);

            // Tissue table
            stissue = con.createStatement();
            rstissue = stissue.executeQuery(t);

            sbook = con.createStatement();
            rsbook =smissue.executeQuery(b);

            int Acno = Integer.parseInt(jTextField5.getText().trim());
            int Mno = Integer.parseInt(jTextField1.getText().trim());
            int Vno = Integer.parseInt(jTextField8.getText().trim());
            String name=jTextField2.getText();
            String idt = jTextField9.getText();
            String ploc = jTextField11.getText();
            String dloc = jTextField12.getText();
            String vname = jTextField6.getText();
            Object ps = jComboBox1.getSelectedItem();
            String rdt = idt;
            String mdt = jTextField3.getText();
            int code = JOptionPane.showConfirmDialog(this, "Are you sure to Payment?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {

                String strSQL = "INSERT INTO missue(acc_no, memb_no, idate, rdate) VALUES ('"+(Acno)+"', '"+(Mno)+"', '"+(idt)+"', '"+(rdt)+"')";

                String strSQL1 = "INSERT INTO tissue(acc_no, memb_no, idate, rdate) VALUES ('"+(Acno)+"', '"+(Mno)+"', '"+(idt)+"', '"+(rdt)+"')";
                String strSQL2 = "INSERT INTO booking(user_id, name, membership_date, booking_id,vehicle_id,veh_name,pickup_loc,dropoff_loc,booking_date,payment_status) VALUES ('"+(Mno)+"', '"+(name)+"', '"+(mdt)+"','"+(Acno)+"','"+(Vno)+"','"+(vname)+"','"+(ploc)+"','"+(dloc)+"', '"+(idt)+"', '"+(ps)+"')";

                smissue.executeUpdate(strSQL);
                stissue.executeUpdate(strSQL1);
                sbook.executeUpdate(strSQL2);

                // Change the status as veh issued
                String sta = "YES";  // Lib table
                String strSQLa = "Update veh set issue_status ='"+(sta)+"' where v_no = " + (Acno)+"";
                ve.executeUpdate(strSQLa);

                // Change the status as Member has a vehicle
                if(Mno>7000){
                    String stb = "YES";  // Member table
                    String strSQLb = "Update Members set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                    mm.executeUpdate(strSQLb);
                    JOptionPane.showMessageDialog(this, "Record update successfully");
                }
                else
                {
                    String stb = "YES";  // Member table
                    String strSQLb = "Update Member set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                    mem.executeUpdate(strSQLb);
                    JOptionPane.showMessageDialog(this, "After successfull payment the issued vehicle are booking.."
               );
                }
            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         int x=jComboBox1.getSelectedIndex();
        
        if(x==0) {
            jButton4.setEnabled(true);
            jButton1.setEnabled(false);
        }
        else

        if(x==1) {
            jButton4.setEnabled(false);
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new veh_issue().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle jButton1;
    private javax.swing.JButton jButton3;
    private rojerusan.RSMaterialButtonRectangle jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
