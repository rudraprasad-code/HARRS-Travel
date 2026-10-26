import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;


public class MEM_USE_SER_UPDATION extends javax.swing.JFrame {

    public MEM_USE_SER_UPDATION() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMPh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMFee = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 610));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 610));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select  a service user");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 274, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEMBER NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 137, 49));

        txtMNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 146, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 137, 49));

        txtMName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 380, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 137, 49));

        txtMAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 558, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHONE/MOBAILE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 137, 49));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        txtMPh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 251, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SERVICE FEE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 137, 49));

        txtMFee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 174, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MEMBERSHIP DATE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 150, 45));

        txtMDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 160, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ISSUE STATUS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 150, 45));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YYY-MM-DD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 209, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1440, 20));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 800, 164, 49));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 800, 160, 49));

        jButton3.setBackground(new java.awt.Color(0, 255, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 180, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SERVICE UPDATION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 1428, 99));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STATUS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 429, 137, 40));

        txtMStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 174, 40));

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 280, 360));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -14, 1450, 930));

        setSize(new java.awt.Dimension(1060, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM Member";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        new MODIFI_3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         txtMNo.setEditable(false);
      
        txtMStatus.setEditable(false);
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
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
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

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
          // getSelectedValue() method extracts the current cursor location value into a variable
        String MembNo = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String query = "SELECT * FROM Member WHERE memb_no = " + (Mno) + ";";
        try {
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {

                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memB_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");

                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                jTextField1.setText(MIssue);
                txtMStatus.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            int Mno = Integer.parseInt(txtMNo.getText().trim());
            // Steps to confirm deletion
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure to updare this record ?");
            if (opt == JOptionPane.YES_OPTION) {
                try {

            String MName = txtMName.getText();
            String MAdd = txtMAdd.getText();
            String MPh1 = txtMPh.getText();
            String MDate = txtMDate.getText();
            String MEDate = txtMDate.getText();  
            String issue = jTextField1.getText();// This is temporarily assigned same as membership date
            double MFee = Double.parseDouble(txtMFee.getText());
                 // Member table
                     String strSQL = "Update Member set memb_name ='"+(MName)+"', memb_add = '"+(MAdd)+"', memb_phone = '"+(MPh1)+"', mdate = '"+(MDate)+"', mfee = '"+(MFee)+"', mem_issue = '"+(issue)+"' where memb_no = " + (Mno);
                    int rowsEffected = stmt.executeUpdate(strSQL);

                    if (rowsEffected == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record updated");
                        // Text boxes cleared
                        txtMNo.setText("");
                        txtMName.setText("");
                        txtMAdd.setText("");
                        txtMPh.setText("");
                        txtMDate.setText("");
                        txtMFee.setText("");
                        txtMStatus.setText("");
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
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MEM_USE_SER_UPDATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MEM_USE_SER_UPDATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MEM_USE_SER_UPDATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MEM_USE_SER_UPDATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEM_USE_SER_UPDATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtMAdd;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtMFee;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNo;
    private javax.swing.JTextField txtMPh;
    private javax.swing.JTextField txtMStatus;
    // End of variables declaration//GEN-END:variables
}
