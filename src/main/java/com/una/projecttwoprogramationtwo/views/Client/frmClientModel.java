/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.una.projecttwoprogramationtwo.views.Client;

import com.una.projecttwoprogramationtwo.controllers.Clients.ClientController;
import com.una.projecttwoprogramationtwo.controllers.Clients.ClientInterface;
import com.una.projecttwoprogramationtwo.views.frmMain;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientModel extends javax.swing.JFrame {

    private DefaultTableModel tblModel;
    private String[] header = {"Nombre", "Apellido", "Cedula", "Edad", "Telefono", "E-mail"};

    public frmClientModel() {
        initComponents();
        filltble();
        clearFields();
    }

    private void filltble() {
        try {
            ClientInterface ClientInterface = new ClientController();

            String[][] data = ClientInterface.getAll();
            tblModel = new DefaultTableModel(data, header) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblClientRegister.setModel(tblModel);
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error al leer los datos");
            e.printStackTrace();
        }
    }

    private void refreshTable() {
        tblClientRegister.setModel(tblModel);
    }

    private void clearFields() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");

    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPadel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientRegister = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(546, 565));

        jPanel1.setPreferredSize(new java.awt.Dimension(546, 330));
        jPanel1.setLayout(new java.awt.BorderLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(546, 280));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nombre:");
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtNombre, gridBagConstraints);

        jLabel2.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel4.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtApellido, gridBagConstraints);

        jLabel3.setText("Cedula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel4.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtCedula, gridBagConstraints);

        jLabel4.setText("Edad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel4.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtEdad, gridBagConstraints);

        jLabel5.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel4.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtTelefono, gridBagConstraints);

        jLabel6.setText("E-mai:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel4.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(txtEmail, gridBagConstraints);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPadel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Cliente"));
        jPadel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setViewportView(tblClientRegister);

        jPadel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPadel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String name = txtNombre.getText();
        String lastName = txtApellido.getText();
        String ced = txtCedula.getText();
        String telephone = txtTelefono.getText();
        String age = txtEdad.getText();
        String email = txtEmail.getText();

        String[] clientData = {ced, name, email, telephone, age, lastName};

        // Agregar el usuario al contenedor y guardar en el archivo
        try {
            ClientController clientController = new ClientController();
            clientController.add(clientData);
            showMessage("El Cliente se ha agregado correctamente.");
            filltble();
            clearFields();

        } catch (Exception e) {
            showMessage(e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (tblClientRegister.getSelectedRowCount() != 1) {
            return;
        }
        String name = txtNombre.getText();
        String lastName = txtApellido.getText();
        String ced = txtCedula.getText();
        String telephone = txtTelefono.getText();
        String age = txtEdad.getText();
        String email = txtEmail.getText();
       

        String[] clientData = {ced, name, email, telephone, age, lastName};

        try {
            ClientController ClientController = new ClientController();
            ClientController.update(clientData);
            showMessage("El Cliente se ha Actualizado correctamente.");
            filltble();
            clearFields();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (tblClientRegister.getSelectedRowCount() != 1) {
            return;
        }
        String idClient = txtCedula.getText();

        try {
            ClientController ClientController = new ClientController();
            ClientController.delete(idClient);
            showMessage("El Cliente se ha Eliminado correctamente.");
            filltble();
            clearFields();

        } catch (Exception e) {
            showMessage(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmClientModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPadel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClientRegister;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
