// /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package employess;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author monika
 */
public class FORMEmployees extends javax.swing.JDialog {

    /**
     * Creates new form FORMEmployees
     */
    public FORMEmployees(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
       
    boolean addRecord = false;

    
    private void clearInputBoxes() {
            txtEmployeeID.setText("");
            txtFullName.setText("");
            cboGender.setSelectedItem("");
            txtdepartment.setText("");
            txtPosition.setText("");
            txtsalary.setText("");
    }
    
    private void addNew() throws SQLException {
   
        String sql_stmt = "INSERT INTO employeeinfo (full_name,Gender,Position,Department,Salary)";
        sql_stmt += " VALUES ('" + txtFullName.getText() + "','" + cboGender.getSelectedItem().toString() 
                + "','" + txtPosition.getText() + "','" + txtdepartment.getText() + "','" + txtsalary.getText() + "')";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }

    private void updateRecord() throws SQLException {
        String sql_stmt = "UPDATE employeeinfo SET full_name = '" + txtFullName.getText() + "'";
        sql_stmt += ",Gender = '" + cboGender.getSelectedItem().toString() + "'";
        sql_stmt += ",Position = '" + txtPosition.getText() + "'";
        sql_stmt += ",Department = '" + txtdepartment.getText() + "'";
        sql_stmt += ",Salary = '" + txtsalary.getText() + "'";
        sql_stmt += " WHERE employee_id= '" + txtEmployeeID.getText() + "'";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }

    private void deleteRecord() throws SQLException {
        //delete query to remove employee record from employeeinfo table
        String sql_stmt = "DELETE FROM employeeinfo WHERE "
                + "employee_id = '" + txtEmployeeID.getText() + "'";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }


    private void loadRecords() throws SQLException, Exception {

        String sql_stmt = "SELECT * FROM employeeinfo";

        ResultSetTableModel tableModel = new ResultSetTableModel(sql_stmt);

        jTable2.setModel(tableModel);


        jTable2.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            try {
                if (jTable2.getSelectedRow() >= 0) {
                    Object employee_id = jTable2.getValueAt(jTable2.getSelectedRow(), 0);
                    Object full_name = jTable2.getValueAt(jTable2.getSelectedRow(), 1);
                    Object gender = jTable2.getValueAt(jTable2.getSelectedRow(), 2);
                    Object department = jTable2.getValueAt(jTable2.getSelectedRow(), 3);
                    Object position = jTable2.getValueAt(jTable2.getSelectedRow(), 4);
                    Object salary = jTable2.getValueAt(jTable2.getSelectedRow(), 5);

                    txtEmployeeID.setText(employee_id.toString());
                    txtFullName.setText(full_name.toString());
                    cboGender.setSelectedItem(gender.toString());
                    txtdepartment.setText(department.toString());
                    txtPosition.setText(position.toString());
                    txtsalary.setText(salary.toString());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }                                                            
    
    

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        txtdepartment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "employee_id", "full_name", "Gender", "Position", "Department", "Salary"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setBounds(getBounds());
        setMinimumSize(new java.awt.Dimension(1126, 758));
        setPreferredSize(new java.awt.Dimension(1141, 825));
        getContentPane().setLayout(null);

        btnAddNew.setBackground(new java.awt.Color(51, 0, 255));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNew);
        btnAddNew.setBounds(670, 130, 140, 60);

        btnUpdate.setBackground(new java.awt.Color(51, 0, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(670, 210, 140, 60);

        btnDelete.setBackground(new java.awt.Color(51, 0, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(670, 300, 140, 60);

        btnViewAll.setBackground(new java.awt.Color(102, 0, 255));
        btnViewAll.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewAll);
        btnViewAll.setBounds(670, 380, 140, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Employee ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 290, 140, 20);

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmployeeID);
        txtEmployeeID.setBounds(320, 290, 250, 26);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Full Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 330, 130, 28);

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFullName);
        txtFullName.setBounds(320, 340, 250, 26);

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });
        getContentPane().add(cboGender);
        cboGender.setBounds(320, 390, 250, 26);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Gender:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 380, 110, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("Position:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 430, 110, 28);

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });
        getContentPane().add(txtPosition);
        txtPosition.setBounds(320, 440, 250, 26);

        txtdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartmentActionPerformed(evt);
            }
        });
        getContentPane().add(txtdepartment);
        txtdepartment.setBounds(320, 480, 250, 26);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Department:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 470, 140, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Salary:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 520, 90, 28);

        txtsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryActionPerformed(evt);
            }
        });
        getContentPane().add(txtsalary);
        txtsalary.setBounds(320, 530, 250, 26);

        btnClose.setBackground(new java.awt.Color(102, 0, 255));
        btnClose.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(670, 470, 140, 60);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(1300, -80, 5, 5);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 10, 10);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(490, 110, 10, 10);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Full Name", "Gender", "Position", "Department", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 610, 1020, 120);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 10, 10);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(980, 0, 10, 10);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 10, 10);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employess/banner1.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 10, 1655, 800);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel8.setText("Employee Records");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 110, 390, 56);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(1225, 700));
        getContentPane().add(jPanel6);
        jPanel6.setBounds(10, 0, 1130, 740);

        jMenuBar2.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar2.setForeground(new java.awt.Color(153, 153, 255));
        jMenuBar2.setToolTipText("");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Tools");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Help");
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        addRecord = true;
        try {
            addNew();    
            clearInputBoxes(); 
            loadRecords();
        } catch (Exception ex) { 
            System.out.println(ex.getMessage());
        }
    clearInputBoxes();
    txtFullName.requestFocus();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete Record?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
         try {
             deleteRecord();
             loadRecords();
            
          } catch (Exception ex) {
             Logger.getLogger(FORMEmployees.class.getName()).log(Level.SEVERE, null, ex);
            } 
           clearInputBoxes();
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        try {  
            loadRecords();
            } 
        catch (Exception ex) { 
            System.out.println(ex.getMessage());
        } 
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenderActionPerformed

    private void txtsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);   
// TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartmentActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?", "Confirm Update Record?", JOptionPane.YES_NO_OPTION);
        try {
            deleteRecord();
        } catch (SQLException ex) {
            Logger.getLogger(FORMEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                if (addRecord == true) {
                  
                     updateRecord();
                } else {
                     addNew();
                }

                addRecord = false;

            loadRecords();
           
            } catch (Exception ex) {
                 Logger.getLogger(FORMEmployees.class.getName()).log(Level.SEVERE, null, ex);
             }
              clearInputBoxes();
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed
    /*
    
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
            java.util.logging.Logger.getLogger(FORMProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FORMProduct dialog = new FORMProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
                                     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
