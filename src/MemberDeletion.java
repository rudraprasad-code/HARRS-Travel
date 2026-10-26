import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
public class MemberDeletion extends javax.swing.JFrame {

    public MemberDeletion() {
        initComponents();
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
        txtMName = new javax.swing.JTextField();
        txtMNo = new javax.swing.JTextField();
        txtMAdd = new javax.swing.JTextField();
        txtMPh = new javax.swing.JTextField();
        txtMFee = new javax.swing.JTextField();
        txtMDate = new javax.swing.JTextField();
        txtMStatus = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member Deletion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 30, 1536, 57));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 110, 238, 41));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Member No. :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 170, 238, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 230, 238, 41));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mobile No. :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 290, 238, 41));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Membership Fee :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 350, 238, 41));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Membership Date :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 410, 238, 41));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(" Status :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 490, 238, 41));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        txtMName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 340, 41));

        txtMNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, 41));

        txtMAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 430, 41));

        txtMPh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMPh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 264, 41));

        txtMFee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 170, 41));

        txtMDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 210, 41));

        txtMStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 170, 41));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1536, 10));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SeLect Member");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 340, 40));

        jList1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 290, 340));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("YYYY-MM-DD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 210, 30));

        jLabel10.setBackground(new java.awt.Color(255, 204, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        setSize(new java.awt.Dimension(1060, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM Members";
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         // getSelectedValue() method extracts the current cursor location value into a variable
        String MembNo = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String query = "SELECT * FROM Members WHERE memb_no = " + (Mno) + ";";
        try {
           // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {

                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("mem_phone");
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
                txtMStatus.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
          //  Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            int Mno = Integer.parseInt(txtMNo.getText().trim());
            // Steps to confirm deletion
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete this record ?");
            if (opt == JOptionPane.YES_OPTION) {
                try {
                   // Member table
                    String strSQL = "delete from members where memb_no="+Mno ;
                    int rowsEffected = stmt.executeUpdate(strSQL);

                    if (rowsEffected == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record Deleted");
                        // Text boxes cleared
                        txtMNo.setText("");
                        txtMName.setText("");
                        txtMAdd.setText("");
                        txtMPh.setText("");
                        txtMDate.setText("");
                        txtMFee.setText("");
                        txtMStatus.setText("");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberDeletion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtMAdd;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtMFee;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNo;
    private javax.swing.JTextField txtMPh;
    private javax.swing.JTextField txtMStatus;
    // End of variables declaration//GEN-END:variables
}
