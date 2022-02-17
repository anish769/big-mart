/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Anish
 */
public class FORMProduct extends javax.swing.JDialog {

    /**
     * Creates new form FORMProduct
     */
    public FORMProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    
     boolean addRecord = false;
    

    private void clearInputBoxes() {
        /*
        clear text boxes
        */
        txtProductId.setText("");
        txtProductName.setText("");
        txtBrand.setText("");
        txtUOM.setText("");
        txtMinStockLevel.setText("");
        txtSalesPrice.setText("");
    }

   private void addNew() throws SQLException {
        String sql_stmt = "INSERT INTO productdetails(ProductName,Brand,UOM,MinStockLevel,SalesPrice)";
        sql_stmt += " VALUES ('" + txtProductName.getText() + "','" + txtBrand.getText() + "','" + txtUOM.getText() + "','" + txtMinStockLevel.getText() + "','" + txtSalesPrice.getText() + "')";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }

    private void updateRecord() throws SQLException {
        String sql_stmt = "UPDATE productdetails SET ProductName = '" + txtProductName.getText() + "'";
        sql_stmt += ",Brand = '" + txtBrand.getText() + "'";
        sql_stmt += ",UOM = '" + txtUOM.getText() + "'";
        sql_stmt += ",MinStockLevel = '" + txtMinStockLevel.getText() + "'";
        sql_stmt += ",SalesPrice = '" + txtSalesPrice.getText() + "'";
        sql_stmt += " WHERE ProductID = '" + txtProductId.getText() + "'";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }

    private void deleteRecord() throws SQLException {
        String sql_stmt = "DELETE FROM productdetails WHERE ProductID = '" + txtProductId.getText() + "'";

        DBUtilities dbUtilities = new DBUtilities();

        dbUtilities.ExecuteSQLStatement(sql_stmt);
    }

  private void loadRecords() throws SQLException {

        String sql_stmt = "SELECT * FROM productdetails;";

        ResultSetTableModel tableModel = new ResultSetTableModel(sql_stmt);

        jTable1.setModel(tableModel);

        jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            try {
                if (jTable1.getSelectedRow() >= 0) {
                    Object ProductID = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    Object ProductName = jTable1.getValueAt(jTable1.getSelectedRow(), 1);
                    Object Brand = jTable1.getValueAt(jTable1.getSelectedRow(), 2);
                    Object UOM = jTable1.getValueAt(jTable1.getSelectedRow(), 3);
                    Object MinStockLevel = jTable1.getValueAt(jTable1.getSelectedRow(), 4);
                    Object SalesPrice = jTable1.getValueAt(jTable1.getSelectedRow(), 5);

                    txtProductId.setText(ProductID.toString());
                    txtProductName.setText(ProductName.toString());
                    txtBrand.setText(Brand.toString());
                    txtUOM.setText(UOM.toString());
                    txtMinStockLevel.setText(MinStockLevel.toString());
                    txtSalesPrice.setText(SalesPrice.toString());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }

   
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
        txtSalesPrice = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtUOM = new javax.swing.JTextField();
        txtMinStockLevel = new javax.swing.JTextField();
        btnViewAll = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 809));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employess/banner1.png"))); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-450, 240, 1100, 620);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Sales Price:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(710, 580, 160, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Product ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(710, 360, 120, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Brand:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(710, 460, 120, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("UOM:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(710, 500, 120, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Product Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(710, 410, 140, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Minimum Stock Level:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 540, 190, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel8.setText("Product Details");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 270, 360, 50);
        getContentPane().add(txtSalesPrice);
        txtSalesPrice.setBounds(900, 580, 260, 26);
        getContentPane().add(txtProductId);
        txtProductId.setBounds(900, 350, 260, 26);
        getContentPane().add(txtProductName);
        txtProductName.setBounds(900, 400, 260, 26);
        getContentPane().add(txtBrand);
        txtBrand.setBounds(900, 450, 260, 26);

        txtUOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUOMActionPerformed(evt);
            }
        });
        getContentPane().add(txtUOM);
        txtUOM.setBounds(900, 500, 260, 26);

        txtMinStockLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinStockLevelActionPerformed(evt);
            }
        });
        getContentPane().add(txtMinStockLevel);
        txtMinStockLevel.setBounds(900, 540, 260, 26);

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewAll);
        btnViewAll.setBounds(790, 720, 110, 40);

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNew);
        btnAddNew.setBounds(710, 660, 110, 40);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(870, 660, 110, 40);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(960, 720, 110, 40);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(1040, 660, 110, 40);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1201, 809));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "Brand", "UOM", "MinStockLevel", "SalesPrice"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMinStockLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinStockLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinStockLevelActionPerformed

    private void txtUOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUOMActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        addRecord = true;  
        try {
               
                addNew();
                loadRecords();             
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } 
        txtProductName.requestFocus();
                                     
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete Record?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
         try {
             deleteRecord();
             loadRecords();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }   
          clearInputBoxes();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        try {
        loadRecords();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?", "Confirm Update Record?", JOptionPane.YES_NO_OPTION);
        try {
            deleteRecord();
        } catch (SQLException ex) {
            Logger.getLogger(FORMProduct.class.getName()).log(Level.SEVERE, null, ex);
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
                 }// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtMinStockLevel;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtUOM;
    // End of variables declaration//GEN-END:variables

    
}
