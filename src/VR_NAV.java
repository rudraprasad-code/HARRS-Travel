import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VR_NAV extends javax.swing.JFrame {
Statement stmt = null;
    ResultSet rs = null;
    Connection cn;
    public VR_NAV() {
        initComponents();
    try {
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");
        String sq="select * from veh";
        stmt=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs=stmt.executeQuery(sq);      
    } catch (SQLException ex) {
        Logger.getLogger(VR_NAV.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new rojeru_san.complementos.RSButtonHover();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setBackground(new java.awt.Color(231, 238, 239));
        jLabel8.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("PLEASE WRITE THE VEHICLE NO. OF THE VEHICLE TO GET ITS RECORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 481, 28));

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 249, 30));

        jButton1.setBackground(new java.awt.Color(146, 157, 159));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("First");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 80, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 100, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 140, -1));

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Last");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 120, -1));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("BACK TO HOME PAGE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 810, 247, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("VEH NO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 40));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, 40));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 340, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("VEH NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 40));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 470, 40));

        jButton5.setBackground(new java.awt.Color(192, 169, 169));
        jButton5.setText("Exit");
        jButton5.setColorHover(new java.awt.Color(255, 0, 0));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 90, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 5, 320));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("ORT DISC.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 40));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("TYPE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 40));

        jButton8.setBackground(new java.awt.Color(146, 157, 159));
        jButton8.setText("GET RECORD");
        jButton8.setColorHover(new java.awt.Color(51, 204, 0));
        jButton8.setColorTextHover(new java.awt.Color(0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 130, 30));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("PRICE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 40));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 250, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("VEH CAPACITY(IN L)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 40));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 350, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("BATCH NO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 40));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 190, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("PURCHASE DATE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 190, 40));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 300, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Mileage");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 70, 40));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 100, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("BOOKING PRICE(\\DAY)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 190, 40));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 240, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("STATUS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 130, 40));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 240, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jSeparator1.setMinimumSize(new java.awt.Dimension(3, 3));
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 754, 1470, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("ISSUE STATUS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 150, 40));

        jLabel1.setBackground(new java.awt.Color(231, 238, 239));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        setSize(new java.awt.Dimension(1060, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
            
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
       if( rs.previous()){
         String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                String issue= rs.getString("issue_status");
                String mai= rs.getString("mileage");
            jTextField1.setText(""+no);
                jTextField2.setText(""+no);
                jTextField3.setText(""+name);
                jTextField4.setText(""+disc);
                jTextField5.setText(""+type);
                jTextField6.setText(""+price);
                jTextField7.setText(""+cap);
                jTextField8.setText(""+batchno);
                jTextField9.setText(""+date);
                jTextField10.setText(""+bPrice);
                jTextField11.setText(""+st);
                jTextField12.setText(""+issue);
                jTextField13.setText(""+mai);
       
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
       }
       else{ jButton3.setEnabled(true);
            jButton3.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at First record position", "user",0);
       }
    } catch (SQLException ex) {
        Logger.getLogger(VR_NAV.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         new MAIN_FRAME().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        if(rs.next()){
         String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                String issue= rs.getString("issue_status");
                  String mai= rs.getString("mileage");
            jTextField1.setText(""+no);
                jTextField2.setText(""+no);
                jTextField3.setText(""+name);
                jTextField4.setText(""+disc);
                jTextField5.setText(""+type);
                jTextField6.setText(""+price);
                jTextField7.setText(""+cap);
                jTextField8.setText(""+batchno);
                jTextField9.setText(""+date);
                jTextField10.setText(""+bPrice);
                jTextField11.setText(""+st);
                jTextField12.setText(""+issue);
                jTextField13.setText(""+mai);
        
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
        }
        else{ jButton2.setEnabled(true);
             jButton2.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at last record position", "user",0);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(VR_NAV.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{

if(rs.first())
{
                String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                  String issue= rs.getString("issue_status");
                    String mai= rs.getString("mileage");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);
jTextField1.setText(""+no);
jTextField2.setText(""+no);
jTextField3.setText(""+name);
jTextField4.setText(""+disc);
jTextField5.setText(""+type);
jTextField6.setText(""+price);
jTextField7.setText(""+cap);
jTextField8.setText(""+batchno);
 jTextField9.setText(""+date);
jTextField10.setText(""+bPrice);
jTextField11.setText(""+st);
 jTextField12.setText(""+issue);
 jTextField13.setText(""+mai);
  

  }
 
    


}
catch(HeadlessException e){
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
                   } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         try {
        if(rs.last()){
         String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                String issue= rs.getString("issue_status");
                 String mai= rs.getString("mileage");
            jTextField1.setText(""+no);
                jTextField2.setText(""+no);
                jTextField3.setText(""+name);
                jTextField4.setText(""+disc);
                jTextField5.setText(""+type);
                jTextField6.setText(""+price);
                jTextField7.setText(""+cap);
                jTextField8.setText(""+batchno);
                jTextField9.setText(""+date);
                jTextField10.setText(""+bPrice);
                jTextField11.setText(""+st);
                jTextField12.setText(""+issue);
                jTextField13.setText(""+mai);
        
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
        }
        else{ jButton2.setEnabled(true);
             //jButton2.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at Last record position", "user",0);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(VR_NAV.class.getName()).log(Level.SEVERE, null, ex);
    }



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String num=jTextField1.getText();
        
        try {
            //REGISTER
           // Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("java.sql.driver");

            //CONNECTION
            String db_url="jdbc:mysql://localhost:3306/travel";
            String pwd="arjun";
            String user="root";

            Connection conn=DriverManager.getConnection(db_url,user,pwd);

            //EXECUTED QUERIES
            stmt=(Statement) conn.createStatement();

            rs=stmt.executeQuery( "SELECT * FROM VEH WHERE V_NO="+(num));



            if (rs.next()) {
                String no = rs.getString("v_no");
                String name = rs.getString("V_name");
                String disc = rs.getString("otr_disc");
                String type = rs.getString("type");
                String price = rs.getString("price");
                String cap = rs.getString("v_cap");
                String batchno = rs.getString("batchno");
                String date = rs.getString("pdate");
                String bPrice = rs.getString("rs_book");
                String st = rs.getString("status");
                String issue= rs.getString("issue_status");
                 String mai= rs.getString("mileage");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);
jTextField1.setText(""+no);
                jTextField2.setText(""+no);
                jTextField3.setText(""+name);
                jTextField4.setText(""+disc);
                jTextField5.setText(""+type);
                jTextField6.setText(""+price);
                jTextField7.setText(""+cap);
                jTextField8.setText(""+batchno);
                jTextField9.setText(""+date);
                jTextField10.setText(""+bPrice);
                jTextField11.setText(""+st);
                jTextField12.setText(""+issue);
                jTextField13.setText(""+mai);
            } else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN VEH TABLE"+'\n'+"THE VEH_NO IS WRONG");
            }



        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VR_NAV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private rojeru_san.complementos.RSButtonHover jButton5;
    private javax.swing.JButton jButton7;
    private rojeru_san.complementos.RSButtonHover jButton8;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
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
