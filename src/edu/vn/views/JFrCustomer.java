/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.vn.views;

import edu.vn.models.Customer;
import edu.vn.models.CustomerDAO;
import edu.vn.utils.FileUtil;
import edu.vn.utils.Validation;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author macbook
 */
public class JFrCustomer extends javax.swing.JFrame {
    CustomerDAO dao = new CustomerDAO();

    /**
     * Creates new form JFrCustomer
     */
    public JFrCustomer() {
        initComponents();
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("WindowClosing");
                try {
                    dao.saveFile();
                    JOptionPane.showMessageDialog(e.getWindow(), "Record data successfully");
                } catch (Exception ex) {
                    System.out.println(e.toString());
                }
            }


        });

    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbCustomer.getModel();
        model.setRowCount(0);
        for (Customer cc : dao.getAlls()) {
            Object[] rowdata = new Object[5];
            rowdata[0] = cc.getId();
            rowdata[1] = cc.getName();
            rowdata[2] = cc.getAddress();
            rowdata[3] = cc.getPhone();
            rowdata[4] = cc.getEmail();
            model.addRow(rowdata);
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

        jLabel1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("CUSTOMER MANAGMENT");

        lbID.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        lbID.setText("Customer ID:");

        lbName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        lbName.setText("Full Name:");

        lbAdd.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        lbAdd.setText("Address:");

        lbPhone.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        lbPhone.setText("Phone Number:");

        lbEmail.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        lbEmail.setText("Email:");

        txtID.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "CustomerID", "Full Name", "Address", "Phone", "Email"
                }
        ));
        tbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCustomer);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/vn/views/add-group (1).png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/vn/views/download.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    btnSaveActionPerformed(evt);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrCustomer(), e.getMessage()
                            ,"Invalid information",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/vn/views/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnDeleteActionPerformed(evt);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrCustomer(), "ID does not exist"
                            ,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/vn/views/research.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    btnFindActionPerformed(evt);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrCustomer(), "ID does not exist"
                            ,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbID)
                                                                        .addComponent(lbEmail)
                                                                        .addComponent(lbAdd)
                                                                        .addComponent(lbName)
                                                                        .addComponent(lbPhone)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(34, 34, 34)
                                                                                .addComponent(btnSave)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(btnDelete)
                                                                                .addGap(48, 48, 48)
                                                                                .addComponent(btnFind)
                                                                                .addGap(12, 12, 12)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnOpen)
                                                .addGap(60, 60, 60)
                                                .addComponent(lbMessage)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnExit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel1)
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbID)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbName)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbAdd)
                                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbPhone)
                                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbEmail)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAdd)
                                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnOpen)
                                                        .addComponent(btnExit)
                                                        .addComponent(lbMessage)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        dao.openFile();
        fillTable();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            dao.saveFile();
            JOptionPane.showMessageDialog(this, "Record data successfully");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void clearForm() {
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        clearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    public Customer getModel() {

        Customer cc = new Customer();
        cc.setId(txtID.getText());
        cc.setName(txtName.getText());
        cc.setAddress(txtAddress.getText());
        cc.setPhone(txtPhone.getText());
        cc.setEmail(txtEmail.getText());
        return cc;
    }


    private void validForm() throws Exception {
        if(txtID.getText().length() == 0) throw new Exception("ID cannot be blank");
        if(txtName.getText().length() == 0) throw new Exception("Name cannot be blank");
        if(!Validation.isName(txtName)) throw new Exception("Invalid name. Must letters !");
        if(txtAddress.getText().length() == 0) throw new Exception("Address cannot be blank");
        if(txtPhone.getText().length() == 0) throw new Exception("Phone cannot be blank");
        if(!Validation.isNumber(txtPhone)) throw new Exception("Invalid Phone. It is a positive sequence number");
        if(txtEmail.getText().length() == 0) throw new Exception("Email cannot be blank");
        if(!Validation.isEmail(txtEmail)) throw new Exception("Invalid format email");

    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnSaveActionPerformed

            validForm();
            Customer cc = getModel();
            if (dao.save(cc) >= 0) {
                lbMessage.setText("Saved successfully");
                lbMessage.setForeground(Color.blue);

            } else {
                lbMessage.setText("Saved unsuccessfully");
                lbMessage.setForeground(Color.red);
            }
            clearForm();
            fillTable();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void setModel(Customer cc) {
        txtID.setText(cc.getId());
        txtName.setText(cc.getName());
        txtAddress.setText(cc.getAddress());
        txtPhone.setText(cc.getPhone());
        txtEmail.setText(cc.getEmail());
    }

    private void tbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseClicked
        int pos = tbCustomer.getSelectedRow();
        setModel(dao.getCustomerByPositon(pos));

    }//GEN-LAST:event_tbCustomerMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnDeleteActionPerformed
        String strID = JOptionPane.showInputDialog(this, "Input id to delete:");
        if (dao.del(strID) >= 0) {
            lbMessage.setText("Deleted successfully");
            lbMessage.setForeground(Color.blue);
            fillTable();
        } else {
            throw new Exception();
        }
        clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnFindActionPerformed
        String strID = JOptionPane.showInputDialog(this, "Input id to find :");
        int pos = dao.findById(strID);
        if (pos >= 0) {
            setModel(dao.getCustomerByPositon(pos));
        } else {
            throw new Exception();
        }
        fillTable();
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(JFrCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JTable tbCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables


}