import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class Edit_Book extends javax.swing.JFrame {

   
    public Edit_Book() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

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

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 3, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Booking");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1440, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 56, 350, 20));

        jTextField2.setBackground(new java.awt.Color(153, 122, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 320, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, 40));

        jTextField3.setBackground(new java.awt.Color(153, 122, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 320, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Membership Date");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 180, 40));

        jTextField5.setBackground(new java.awt.Color(153, 122, 0));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 320, 40));

        jTextField6.setBackground(new java.awt.Color(153, 122, 0));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 320, 40));

        jTextField7.setBackground(new java.awt.Color(153, 122, 0));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 320, 40));

        jTextField8.setBackground(new java.awt.Color(153, 122, 0));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 320, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vehicle No.");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 180, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vehicle Name");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 40));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PickUp Location");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 180, 40));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Enter Issue Date");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 180, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment Status");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 180, 40));

        jTextField9.setBackground(new java.awt.Color(153, 122, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 320, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 763, 1440, 10));

        jList1.setBackground(new java.awt.Color(0, 0, 0));
        jList1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 370, 370));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Select User");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 370, 40));

        jButton1.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jButton1.setText("Back To Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 790, 200, 50));

        jButton2.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 180, 50));

        jTextField11.setBackground(new java.awt.Color(153, 122, 0));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 320, 40));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DropOff Location");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 180, 40));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Booking No.");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 40));

        jTextField1.setBackground(new java.awt.Color(153, 122, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 320, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, 40));

        jTextField4.setBackground(new java.awt.Color(153, 122, 0));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 320, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM booking";
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         String MembNo = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String query = "SELECT * FROM booking WHERE user_id = " + (Mno) + ";";
        try {
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {
               String bno=rs.getString("booking_id");
                String name = rs.getString("name");
                String mdate = rs.getString("membership_date");
                String bdate = rs.getString("booking_date");
                String dloc = rs.getString("dropoff_loc");
                String ploc = rs.getString("pickup_loc");
                String ps = rs.getString("payment_status");
                String vi = rs.getString("vehicle_id");
                String vname = rs.getString("veh_name");

                // Displaying the contents in respective text boxes.
                jTextField7.setText(ploc);
                jTextField11.setText(dloc);
                jTextField2.setText(name);
                jTextField3.setText(mdate);
               jTextField6.setText(vi);
                jTextField8.setText(vname);
                jTextField9.setText(ps);
                jTextField5.setText(bdate);
                jTextField1.setText(bno);
              //  txtMStatus.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            int Mno = Integer.parseInt(jTextField1.getText().trim());
            // Steps to confirm deletion
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure to updare this record ?");
            if (opt == JOptionPane.YES_OPTION) {
                try {

            String name = jTextField2.getText();
            String mdate =jTextField3.getText();
            String bdate = jTextField5.getText();
            String dloc = jTextField11.getText();
            String ploc = jTextField7.getText();  
            String ps = jTextField9.getText();
            String vi = jTextField6.getText();
            String vname = jTextField8.getText();// This is temporarily assigned same as membership date
            //double MFee = Double.parseDouble(txtMFee.getText());
                 // Member table
                     String strSQL = "Update booking set name ='"+(name)+"', membership_date = '"+(mdate)+"', booking_date = '"+(bdate)+"', dropoff_loc = '"+(dloc)+"', pickup_loc = '"+(ploc)+"', payment_status = '"+(ps)+"', vehicle_id = '"+(vi)+"', veh_name = '"+(vname)+"' where booking_id = " + (Mno);
                    int rowsEffected = stmt.executeUpdate(strSQL);

                    if (rowsEffected == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record updated");
                        // Text boxes cleared
                        jTextField2.setText("");
                        jTextField11.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                        jTextField9.setText("");
                        jTextField1.setText("");
                      jTextField1.setText("");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to update");
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         jTextField1.setEditable(false);
      
        //txtMStatus.setEditable(false);
        // Creating a ListModel object dModel to perform DefaultListModel
        // method operations
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        // Method to add elements into jList1 control
        dModel.clear();
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String Mno = rs.getString("user_id");
                String MName = rs.getString("name");
                // To make the Member no. as 4 digit because we will extract 4 digit from list value
		// in mouse click event.

               dModel.addElement(Mno + "- " + MName);
                }

              jList1.setModel(dModel);
        }


    catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MAIN_FRAME().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(Edit_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
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
