/**
 * GUI interface
 *
 * @author Andre Queiroz
 */
package view;

import dao.EmployeeDao;
import dto.EmployeeDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeFormView extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    public EmployeeFormView() {
        initComponents();
        listEmployees();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        btnLoadFields = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        btnCleanFields = new javax.swing.JButton();
        btnAlter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address.setText("Address");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Name", "Address"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        btnLoadFields.setText("Load Fields");
        btnLoadFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFieldsActionPerformed(evt);
            }
        });

        id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id.setText("Id");

        txtId.setEnabled(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Employee Registration");

        btnCleanFields.setText("Clean Fields");
        btnCleanFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanFieldsActionPerformed(evt);
            }
        });

        btnAlter.setText("Alter");
        btnAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(address)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addComponent(txtName)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoadFields)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCleanFields)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(title)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(title)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadFields)
                    .addComponent(btnRegister)
                    .addComponent(btnCleanFields)
                    .addComponent(btnAlter)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        registerEmployee();
        listEmployees();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoadFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFieldsActionPerformed
        loadFields();
    }//GEN-LAST:event_btnLoadFieldsActionPerformed

    private void btnCleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanFieldsActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnCleanFieldsActionPerformed

    private void btnAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterActionPerformed
        alterEmployee();
        listEmployees();
        cleanFields();
    }//GEN-LAST:event_btnAlterActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFormView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnCleanFields;
    private javax.swing.JButton btnLoadFields;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void registerEmployee() {
        // Declare variables and receive user input
        String name = txtName.getText();
        String address = txtAddress.getText();

        // Throw values to dto
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeName(name);
        employeeDto.setEmployeeAddress(address);

        // Run dao class and its methods
        EmployeeDao dao = new EmployeeDao();
        dao.registerEmployee(employeeDto);

    }

    private void listEmployees() {
        try {
            EmployeeDao employee = new EmployeeDao();

            DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
            model.setNumRows(0);

            ArrayList<EmployeeDto> list = employee.searchEmployee();

            for (int i = 0; i < list.size(); i++) {
                model.addRow(new Object[]{
                    list.get(i).getEmployeeId(),
                    list.get(i).getEmployeeName(),
                    list.get(i).getEmployeeAddress()
                });
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Error listing values" + error.getMessage());
        }
    }

    private void loadFields() {

        int selectedLine = employeeTable.getSelectedRow();
        txtId.setText(employeeTable.getModel().getValueAt(selectedLine, 0).toString());
        txtName.setText(employeeTable.getModel().getValueAt(selectedLine, 1).toString());
        txtAddress.setText(employeeTable.getModel().getValueAt(selectedLine, 2).toString());

    }

    private void cleanFields() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtName.requestFocus();
    }

    public void alterEmployee() {
        int employeeId;
        String verification;
        String employeeName;
        String employeeAddress;

        verification = txtId.getText();
        if (verification.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "You need to select a row and load the fields.");
        } else {

            employeeId = Integer.parseInt(txtId.getText());
            employeeName = txtName.getText();
            employeeAddress = txtAddress.getText();

            EmployeeDto dto = new EmployeeDto();
            dto.setEmployeeId(employeeId);
            dto.setEmployeeName(employeeName);
            dto.setEmployeeAddress(employeeAddress);

            EmployeeDao dao = new EmployeeDao();
            dao.alterEmployee(dto);
        }
    }

}
