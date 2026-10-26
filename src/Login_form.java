
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login_form extends javax.swing.JFrame {

    public Login_form() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        root = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtname2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtemail2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtans = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtpassword2 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 4, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 318, 80));

        jButton1.setBackground(new java.awt.Color(234, 255, 123));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 265, 189, 56));

        jButton2.setBackground(new java.awt.Color(234, 255, 123));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 409, 189, 56));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 980));

        root.setBackground(new java.awt.Color(64, 64, 64));
        root.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(64, 64, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(64, 64, 64));
        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Log In");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 1091, 47));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Email");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 152, 96, 44));

        txtemail.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 202, 488, 41));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 370, 141, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 262, 96, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Forget Password ?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 371, -1, 36));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 449, 488, 42));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Do you have an account ? Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 620, 488, 42));

        jButton5.setBackground(new java.awt.Color(64, 64, 64));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 22, -1, 41));

        txtpassword.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 311, 488, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper2.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 6, 1290, 940));

        root.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(64, 64, 64));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(64, 64, 64));
        jLabel9.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 47, 47));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Admin  Register");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 84, 1068, 47));

        jLabel10.setBackground(new java.awt.Color(255, 204, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 96, 44));

        txtname2.setBackground(new java.awt.Color(236, 231, 231));
        txtname2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel3.add(txtname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 488, 41));

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Email");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 1959, 43));

        txtemail2.setBackground(new java.awt.Color(236, 231, 231));
        txtemail2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtemail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemail2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 488, 42));

        jLabel12.setBackground(new java.awt.Color(255, 204, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setText("Password");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 96, 34));

        jLabel13.setBackground(new java.awt.Color(255, 204, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("Sequirity Question");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 125, 36));

        jButton7.setBackground(new java.awt.Color(236, 231, 231));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setText("Signup Now");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 488, 42));

        jButton8.setBackground(new java.awt.Color(236, 231, 231));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setText("Back to Login Page");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 740, 488, 42));

        jComboBox1.setBackground(new java.awt.Color(236, 231, 231));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Your Favourite Game", "Your Favourite Friend", "Your Favourite Hero", "Your Favourite Movie" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 490, 50));

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Answer");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 110, 30));

        txtans.setBackground(new java.awt.Color(236, 231, 231));
        txtans.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel3.add(txtans, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 490, 40));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setText("Show Password");
        jCheckBox2.setOpaque(true);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 140, -1));

        txtpassword2.setBackground(new java.awt.Color(236, 231, 231));
        txtpassword2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel3.add(txtpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 490, 40));

        jButton6.setBackground(new java.awt.Color(64, 64, 64));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 22, -1, 41));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper2.jpg"))); // NOI18N
        jLabel8.setText("EXIT");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1210, 980));

        jButton11.setBackground(new java.awt.Color(64, 64, 64));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 0));
        jButton11.setText("EXIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 22, -1, 41));

        root.addTab("tab2", jPanel3);

        getContentPane().add(root, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, -50, -1, 1030));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemail2ActionPerformed
     
    }//GEN-LAST:event_txtemail2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        int yes=JOptionPane.showConfirmDialog(this, "Are you Sure ?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
            pst=con.prepareStatement("Select * from login where email=? and password=?");
            String sql="insert into login(name,email,password) values (?,?,?)";
            pst.setString(1, txtemail.getText());
            pst.setString(2, txtpassword.getText());
           String pass=txtemail.getText();
           String sq="update login set status='TRUE' where email='"+pass+"'";
           st=con.createStatement();
           st.executeUpdate(sq);
            
           
             
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                 MAIN_FRAME MAIN=new MAIN_FRAME();
                 MAIN.setVisible(true);
               this.setVisible(false);
               
                JOptionPane.showMessageDialog(this,"Login Successfully..");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Email or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 
         if(jCheckBox1.isSelected()){
            txtpassword.setEchoChar((char)0);
        }
        else{
             txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

         if(jCheckBox2.isSelected()){
            txtpassword2.setEchoChar((char)0);
        }
        else{
             txtpassword2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         root.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        root.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if(txtname2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field value is mandetory");
            txtname2.requestFocus();
        }
        
        else if(txtpassword2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field value is mandetory");
            txtpassword2.requestFocus();
        }
         
        else if(txtemail2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field value is mandetory");
            txtemail2.requestFocus();
        }
          
          else if(txtans.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field value is mandetory");
            txtans.requestFocus();
        }
        else
          {
              Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
            try {
                // Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
                pst=con.prepareStatement("Select * from login where email=?");
                pst.setString(1,txtemail2.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,"Use Another Email id");
                }
                else
                {
                    pst=con.prepareStatement("insert into login(name,email,password,sq,ans)values(?,?,?,?,?)");
                    pst.setString(1,txtname2.getText());
                    pst.setString(2,txtemail2.getText());
                    pst.setString(3,txtpassword2.getText());
                    pst.setString(4,jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                    pst.setString(5,txtans.getText());
                    pst.executeUpdate();
                    
                JOptionPane.showMessageDialog(this,"Registration Successfull \n Login Now");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

         new forgate_pass().setVisible(true);
               this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        root.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        root.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  int yes=JOptionPane.showConfirmDialog(this, "Are you Sure ?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes==JOptionPane.YES_OPTION)
            System.exit(0);       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Login_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane root;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemail2;
    private javax.swing.JTextField txtname2;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpassword2;
    // End of variables declaration//GEN-END:variables
}
