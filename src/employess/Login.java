/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employess;

import java.awt.Choice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anish
 */
public class Login extends javax.swing.JDialog {

        
    public FORMEmployees FORMEmployees;
    public Connection conn = null;
    public Statement stmt = null;
    ResultSet rslt = null;
    PreparedStatement pst = null;
    
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                try{
            conn = DriverManager.getConnection(Config.connection_url,Config.DATABASE_USER_ID,Config.DATABASE_PASSWORD);
            stmt = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollBar1 = new javax.swing.JScrollBar();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        chbpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.magenta);
        setForeground(new java.awt.Color(128, 19, 125));
        setIconImages(getIconImages());
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jInternalFrame1.setBackground(new java.awt.Color(51, 153, 255));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(141, 42, 42));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Username");
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 270, 100, 28);

        jLabel2.setBackground(new java.awt.Color(141, 42, 42));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 330, 94, 28);

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(txtUserName);
        txtUserName.setBounds(180, 280, 238, 26);

        btnlogin.setBackground(new java.awt.Color(204, 204, 204));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(51, 51, 51));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnlogin);
        btnlogin.setBounds(20, 490, 141, 47);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(200, 490, 151, 50);

        chbpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbpasswordActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(chbpassword);
        chbpassword.setBounds(180, 330, 240, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employess/banner1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jInternalFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 180, 310, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employess/banner1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jInternalFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(-70, 130, 1130, 610);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employess/anish.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 60, 570, 160);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        try {
            jInternalFrame1.setIcon(isFocusCycleRoot());
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
    String UserName = txtUserName.getText();
            String Password = chbpassword.getText();
            String sql = "SELECT * FROM login WHERE user_name = ?  and Password = ? ";
            
            try {
                  conn=DriverManager.getConnection(Config.connection_url,Config.DATABASE_USER_ID,Config.DATABASE_PASSWORD);
                  stmt =(Statement)conn.createStatement();
                  //res = stmt.executeQuery(sql);
                  pst = conn.prepareStatement(sql);
                  pst.setString(1, txtUserName.getText());
                  pst.setString(2, chbpassword.getText());
                  rslt = pst.executeQuery();
                  
                  while(rslt.next()){
                    if( rslt.getString(1).equals(UserName)&& rslt.getString(2).equals(Password)) {
                      Choose mf= new Choose(null,false);
                      this.hide();
                      mf.setVisible(true);
                  }
                  else {
                      JOptionPane.showMessageDialog(null, "Invalid User Name or Password!");
                      txtUserName.getText();
                      chbpassword.getText();
                      txtUserName.grabFocus();

                  } 
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }//GEN-LAST:event_btnloginActionPerformed

    private void chbpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbpasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JPasswordField chbpassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
