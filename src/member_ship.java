import javax.swing.*;
import java.sql.*;
public class member_ship extends javax.swing.JFrame {

    public member_ship() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                               MEMBERSHIP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 20, 1278, 70));

        jButton2.setBackground(new java.awt.Color(0, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 110, 33));

        jButton3.setBackground(new java.awt.Color(0, 255, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 108, 39));

        jButton4.setBackground(new java.awt.Color(0, 255, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 106, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Member No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 177, 35));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 177, 35));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 370, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 177, 35));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 450, 35));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("YYYY-MM-DD");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 200, 20));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 450, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone/Mobail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 177, 35));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 190, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Membership Fee");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 177, 35));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 190, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ISSUE STATUS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 177, 35));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 190, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Membership Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 193, 35));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setToolTipText("");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 199, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("YYYY-MM-DD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 600, 199, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 193, 35));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setToolTipText("");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 199, 35));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 730, 430, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        setSize(new java.awt.Dimension(1060, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 Statement stmt = null;
    ResultSet rs = null;        // ResultSet for publisher table.
    String sql = "SELECT * FROM Members";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField6.setText("NON");
        jButton4.setEnabled(true);
try {
    //REGISTER
          //  Class.forName("com.mysql.jdbc.Driver");
             //Class.forName("java.sql.driver");

              //CONNECTION
           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","arjun");

           //EXECUTE QUERY
           stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Members");

           //for memb no
            int MNO=7000, Mno = 0;
            while (rs.next()) {
                MNO = rs.getInt("memb_no");
                               }
            MNO++;
            Mno = MNO;
           jTextField1.setText(Integer.toString(Mno));
              //for status
           jTextField9.setText(Integer.toString(Mno+100));
          jTextField2.setFocusable(true);
 }

catch(Exception e){
  JOptionPane.showMessageDialog(null ,e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
      e.printStackTrace();
                  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
jTextField2.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField3.setText("");
jTextField8.setText("");
jTextField4.setText("");
jTextField9.setText("");
 jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
       //REGISTER
           // Class.forName("com.mysql.jdbc.Driver");
               //Class.forName("java.sql.driver");

            //CONNECTION
       String db_url="jdbc:mysql://localhost:3306/travel";
       String pwd="arjun";
       String user="root";
           
       Connection conn=DriverManager.getConnection(db_url,user,pwd);
      
       //EXECUTED QUERIES
        stmt=conn.createStatement();

          rs=stmt.executeQuery(sql);
          
   
                              

int no=Integer.parseInt(jTextField1.getText());
String name=jTextField2.getText();
String add1=jTextField3.getText();
String add2=jTextField7.getText();
String date=jTextField8.getText();
int status=Integer.parseInt(jTextField9.getText());
String issue=jTextField6.getText();
String pno=jTextField4.getText();
double fee = Double.parseDouble(jTextField5.getText());


int then=JOptionPane.showConfirmDialog(null,"ARE YOU REALLY WANT TO BECOME MEMBER","FOR CONFORMATION",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

if(then==JOptionPane.YES_OPTION){
     String ssql="INSERT INTO Members(memb_no, memb_name, memb_add, mdate, medate, mfee, mem_status, mem_issue, MEM_phone)values('"+(no)+"', '"+(name)+"', '"+(add1+add2)+"', '"+(date)+"', '"+(date)+"', '"+(fee)+"', '"+(status)+"', '"+(issue)+"', '"+(pno)+"');";
  stmt.executeUpdate(ssql);
              
              new fdialog().setVisible(true);
           //jLabel12.setText("YOUR USER NAME IS:"+name+"  YOUR I.D NO IS:"+status);
  }

 jButton4.setEnabled(false);

}
catch(Exception e){
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
                   }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         jTextField1.setEditable(false);
       jTextField6.setEditable(false);
 jTextField9.setEditable(false);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new member_ship().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
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
