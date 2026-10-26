import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class vehicle_return extends javax.swing.JFrame {

    
    public vehicle_return() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        JButton111 = new rojerusan.RSMaterialButtonRectangle();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select if a service user");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 40));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Member No.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 135, 39));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 142, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Name");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 135, 38));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 339, 38));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Membership Date");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 135, 41));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 221, 41));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Status");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 135, 42));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 139, 42));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select if a main user");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 201, 37));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 252, 39));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Vehicle Name");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 550, 120, 38));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 252, 38));

        jButton10.setBackground(new java.awt.Color(102, 102, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Payment");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, 160, 50));

        JButton111.setBackground(new java.awt.Color(204, 255, 204));
        JButton111.setForeground(new java.awt.Color(0, 0, 0));
        JButton111.setText("Show");
        JButton111.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        JButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton111ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, 110, 50));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Accession No.");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 550, 140, 41));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 840, 41));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("<BACK");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setText("Ending Odometer");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 690, 140, 41));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("Total Price");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, 90, 41));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, 252, 39));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VEHICLE RETURN FORM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 90));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("Disc");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 180, 41));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 481, 1530, 20));

        jList1.setBackground(new java.awt.Color(107, 92, 78));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 230));

        jList2.setBackground(new java.awt.Color(107, 92, 78));
        jList2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList2.setModel(new DefaultListModel());
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 200, 230));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 210, 40));

        jLabel9.setBackground(new java.awt.Color(102, 255, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, 200, 40));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1440, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents
      Statement mem = null;
    ResultSet rmem = null;
    String st1 = "YES";
 String meme = "SELECT * FROM Member WHERE mem_issue = '" + st1 +  "';";

    Statement mm = null;
    ResultSet rmm = null;
      String st = "YES";
 String mme = "SELECT * FROM Members WHERE mem_issue = '" + st +  "';";

   Statement ve = null;
    ResultSet rve = null;
      String st2 = "YES";
 String vee= "SELECT * FROM veh WHERE issue_status = '" + st2 +  "';";

 Statement smissue = null;
    ResultSet rsmissue = null;
    String m = "SELECT * FROM Missue";

    Statement stissue = null;
    ResultSet rstissue = null;
    String t = "SELECT * FROM Tissue";
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MAIN_FRAME().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        // dModel to perform DefaultListModel for Member
        // method operations
        jList1.removeAll();
        jList2.removeAll();
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        // Method to add elements into jList1 control for member
        dModel.clear();

        try {
          //  Class.forName("com.mysql.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");

            // Listing Members
            mem = con.createStatement();
            rmem = mem.executeQuery(meme);
            while (rmem.next()) {
                String Mno = rmem.getString("memb_no");
                String MName = rmem.getString("memb_name");
                // To make the Member no. as 4 digit because we will extract 4 digit from list value
		// in mouse click event.

                dModel.addElement(Mno + "- " + MName);
                }

            jList1.setModel(dModel);

            //for main members
            DefaultListModel cModel = (DefaultListModel) jList2.getModel();
            cModel.clear();
           mm = con.createStatement();
            rmm = mm.executeQuery(mme);
            while (rmm.next()) {
               int Ano = rmm.getInt("memb_no");
                String BTitle = rmm.getString("memb_name");


                cModel.addElement(Ano + "- " + BTitle);

        }
             jList2.setModel(cModel);
        }


    catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
        String MembNo = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String query = "SELECT * FROM Member WHERE memb_no = " + (Mno) + ";";
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            mem = con.createStatement();
            rmem = mem.executeQuery(query);
            if (rmem.next()) {
               // int num=1000;
                String MName = rmem.getString("memb_name");
                String MDate = rmem.getString("mdate");
                String MStatus = rmem.getString("mem_status");
                // Displaying the contents in respective text boxes.
                jTextField1.setText(Mno);
                jTextField2.setText(MName);
                jTextField3.setText(MDate);
                jTextField4.setText(MStatus);
                //jLabel10.setText("10000");
                
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }


            // Extrating the Acc_no from Tissue table to find details in  table
            String query1 = "SELECT * FROM missue WHERE memb_no = " + (Mno) + ";";
            // Create SQL statement and execute query.
            stissue = con.createStatement();
            rstissue = stissue.executeQuery(query1);
            int ACno = 0;
            if ( rstissue.next()) {
                ACno =  rstissue.getInt("acc_no");
             //  System.out.println(""+ACno);
                jTextField9.setText(""+ACno);
            }
            // Extrating the Library details for Acc_no from Lib table
            String query2 = "SELECT * FROM veh WHERE v_no = " + (ACno) + ";";
            // Create SQL statement and execute query.
            ve= con.createStatement();
            rve = ve.executeQuery(query2);
            String nam, disc;
            if (rve.next()) {
                nam = rve.getString("V_name");
                disc = rve.getString("otr_disc");
             //   int num=1000;
                jTextField10.setText(nam);
                jTextField11.setText(disc);
                jLabel9.setText("Returned");
                int start=Integer.parseInt(jTextField12.getText());
               // jLabel10.setText("10000");
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
        String query = "SELECT * FROM Members WHERE memb_no = " + (Mno) + ";";
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            mem = con.createStatement();
            rmem = mem.executeQuery(query);
            if (rmem.next()) {
                String MName = rmem.getString("memb_name");
                String MDate = rmem.getString("mdate");
                String MStatus = rmem.getString("mem_status");
                // Displaying the contents in respective text boxes.
                jTextField1.setText(Mno);
                jTextField2.setText(MName);
                jTextField3.setText(MDate);
                jTextField4.setText(MStatus);
                // jLabel10.setText("10000");
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }


            // Extrating the Acc_no from Tissue table to find details in  table
            String query1 = "SELECT * FROM missue WHERE memb_no = " + (Mno) + ";";
            // Create SQL statement and execute query.
            stissue = con.createStatement();
            rstissue = stissue.executeQuery(query1);
            int ACno = 0;
            if ( rstissue.next()) {
                ACno =  rstissue.getInt("acc_no");
             //  System.out.println(""+ACno);
                jTextField9.setText(""+ACno);
            }
            // Extrating the Library details for Acc_no from Lib table
            String query2 = "SELECT * FROM veh WHERE v_no = " + (ACno) + ";";
            // Create SQL statement and execute query.
            ve= con.createStatement();
            rve = ve.executeQuery(query2);
            String nam, disc;
            if (rve.next()) {
                nam = rve.getString("V_name");
                disc = rve.getString("otr_disc");
                jTextField10.setText(nam);
                jTextField11.setText(disc);
                jLabel9.setText("Issued");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jList2MouseClicked
   /* private void JButton111ActionPerformed(java.awt.event.ActionEvent evt){
        Statement stmt = null;
        ResultSet rs = null;
        Connection cn;
        try {
             
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
        String sq="select * from veh";
        stmt=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs=stmt.executeQuery(sq); 
         if(rs.next()){
         float mai = Float.parseFloat(rs.getString("mileage"));
         float km=Float.parseFloat(jTextField12.getText());
         double total=(km/mai)*102.43;
           jLabel10.setText("total");
                 }       
    
    
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         int y=0;
        if(y==0){
            new pay_ment().setVisible(true);
            //this.setVisible(false);
            y=y+1;
        }
        if(y==1){
            try {
                //Class.forName("com.mysql.jdbc.Driver");
                Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
                // Missue table
                int Mno = 0, Acno = 0;
                Mno = Integer.parseInt(jTextField1.getText().trim());
                Acno = Integer.parseInt(jTextField9.getText().trim());
                // Steps to confirm return
                int opt = JOptionPane.showConfirmDialog(null, "sure that the vehivle is in the same condition as given ");
                if (opt == JOptionPane.YES_OPTION)
                {
                    String strSQLr = "Delete from missue where memb_no = " + (Mno);
                    stissue.executeUpdate(strSQLr);
                    // Change the status as library book issued
                    String sta="NON";  // Lib table
                    String strSQLa = "Update veh set issue_status ='"+(sta)+"' where v_no = " + (Acno);
                    ve.executeUpdate(strSQLa);
                    // Change the status as Member has a book
                    if(Mno<7000){
                        String stb = "NON";  // Member table
                        String strSQLb = "Update Member set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                        mem.executeUpdate(strSQLb);
                    }
                    else
                    if(Mno>7000){
                        String stb = "NON";  // Member table
                        String strSQLb = "Update Members set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                        mm.executeUpdate(strSQLb);
                    }

                    //JOptionPane.showMessageDialog(this, "Thanks for returning vehicle");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_jButton10ActionPerformed
}
    private void JButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton111ActionPerformed
         Statement stmt = null;
        ResultSet rs = null;
        Connection cn;
        try {
             
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
        String sq="select * from veh";
        stmt=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs=stmt.executeQuery(sq); 
         if(rs.next()){
         float mai = Float.parseFloat(rs.getString("mileage"));
         float km=Float.parseFloat(jTextField12.getText());
         double total=(km/mai)*102.43;
           jLabel10.setText(""+total);
                 }       
    
    
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JButton111ActionPerformed
    
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
            java.util.logging.Logger.getLogger(vehicle_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicle_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicle_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicle_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new vehicle_return().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButton111;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
