/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.una.projecttwoprogramationtwo.views.User;

import com.una.projecttwoprogramationtwo.controllers.User.UserController;
import com.una.projecttwoprogramationtwo.controllers.User.UserInterface;
import com.una.projecttwoprogramationtwo.views.frmMain;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henry
 */
public class frmUserModel extends javax.swing.JFrame {

    private DefaultTableModel tblModel;
    private String[] header = {"Id", "Contraseña", "Nombre", "E-mail", "Telefono", "Edad", "Apellido"};

    /**
     * Creates new form frmUserModel
     */
    public frmUserModel() {
        initComponents();
        filltble();
        clearFields();
    }

    private void filltble() {
        try {
            UserInterface userInterface = new UserController();

            String[][] data = userInterface.getAllUser();
            tblModel = new DefaultTableModel(data, header) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblUserRegister.setModel(tblModel);
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error al leer los datos");
            e.printStackTrace();
        }
    }

    private void refreshTable() {
        tblUserRegister.setModel(tblModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        agregarButton = new java.awt.Button();
        modificarButton = new java.awt.Button();
        eliminarButton = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idUserUniqueField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telephoneFIeld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lastNameFIeld = new javax.swing.JTextField();
        ExitButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserRegister = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 650));

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        agregarButton.setLabel("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(agregarButton);

        modificarButton.setLabel("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(modificarButton);

        eliminarButton.setLabel("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(eliminarButton);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Usuario:");
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        idUserUniqueField.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(idUserUniqueField, gridBagConstraints);

        jLabel2.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel4.add(jLabel2, gridBagConstraints);

        passwordField.setText("jTextField2");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(passwordField, gridBagConstraints);

        jLabel3.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel4.add(jLabel3, gridBagConstraints);

        nameField.setText("jTextField3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(nameField, gridBagConstraints);

        jLabel4.setText("E-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel4.add(jLabel4, gridBagConstraints);

        emailField.setText("jTextField4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(emailField, gridBagConstraints);

        jLabel5.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel4.add(jLabel5, gridBagConstraints);

        telephoneFIeld.setText("jTextField5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(telephoneFIeld, gridBagConstraints);

        jLabel6.setText("Edad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel4.add(jLabel6, gridBagConstraints);

        ageField.setText("jTextField6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(ageField, gridBagConstraints);

        jLabel7.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel4.add(jLabel7, gridBagConstraints);

        lastNameFIeld.setText("jTextField7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 3, 18);
        jPanel4.add(lastNameFIeld, gridBagConstraints);

        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 0, 0));
        ExitButton.setText("X");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        jPanel4.add(ExitButton, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        tblUserRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        tblUserRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserRegisterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserRegister);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        frmMain main = new frmMain();

        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        if (tblUserRegister.getSelectedRowCount() != 1) {
            return;
        }
        String idUsuario = idUserUniqueField.getText();

        try {
            UserController userController = new UserController();
            userController.delete(idUsuario);
            showMessage("El usuario se ha Eliminado correctamente.");
            filltble();
            clearFields();

        } catch (Exception e) {
            showMessage(e.getMessage());
        }

    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        String idUsuario = idUserUniqueField.getText();
        String password = passwordField.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String telephone = telephoneFIeld.getText();
        String age = ageField.getText();
        String lastName = lastNameFIeld.getText();

        String[] userData = {idUsuario, password, name, email, telephone, age, lastName};

        // Agregar el usuario al contenedor y guardar en el archivo
        try {
            UserController userController = new UserController();
            userController.save(userData);
            showMessage("El usuario se ha agregado correctamente.");
            filltble();
            clearFields();

        } catch (Exception e) {
            showMessage(e.getMessage());
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        // TODO add your handling code here:
        if (tblUserRegister.getSelectedRowCount() != 1) {
            return;
        }
        String idUsuario = idUserUniqueField.getText();
        String password = passwordField.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String telephone = telephoneFIeld.getText();
        String age = ageField.getText();
        String lastName = lastNameFIeld.getText();

        String[] userData = {idUsuario, password, name, email, telephone, age, lastName};

        try {
            UserController userController = new UserController();
            userController.update(userData);
            showMessage("El usuario se ha Actualizado correctamente.");
            filltble();
            clearFields();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_modificarButtonActionPerformed

    private void tblUserRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserRegisterMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = tblUserRegister.getSelectedRow();
            String idUsuario = (String) tblModel.getValueAt(fila, 0);
            String password = (String) tblModel.getValueAt(fila, 1);
            String name = (String) tblModel.getValueAt(fila, 2);
            String email = (String) tblModel.getValueAt(fila, 3);
            String telephone = (String) tblModel.getValueAt(fila, 4);
            String age = (String) tblModel.getValueAt(fila, 5);
            String lastName = (String) tblModel.getValueAt(fila, 6);

            idUserUniqueField.setText(idUsuario);
            passwordField.setText(password);
            nameField.setText(name);
            emailField.setText(email);
            telephoneFIeld.setText(telephone);
            ageField.setText(age);
            lastNameFIeld.setText(lastName);

        }
    }//GEN-LAST:event_tblUserRegisterMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(frmUserModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUserModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUserModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUserModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUserModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JTextField ageField;
    private java.awt.Button agregarButton;
    private java.awt.Button eliminarButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idUserUniqueField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameFIeld;
    private java.awt.Button modificarButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable tblUserRegister;
    private javax.swing.JTextField telephoneFIeld;
    // End of variables declaration//GEN-END:variables

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void clearFields() {
        idUserUniqueField.setText("");
        passwordField.setText("");
        nameField.setText("");
        emailField.setText("");
        telephoneFIeld.setText("");
        ageField.setText("");
        lastNameFIeld.setText("");
    }

}
