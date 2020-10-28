/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.ControllerUser;
import UTIL.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPassword = new javax.swing.JLabel();
        jtPassword = new javax.swing.JPasswordField();
        lbPassword2 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jbCreate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();
        jbSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        jtUsernameSettings = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbPassword1 = new javax.swing.JLabel();
        jtPasswordSettings = new javax.swing.JPasswordField();
        lbPassword3 = new javax.swing.JLabel();
        jtNameSettings = new javax.swing.JTextField();
        jcTypeSettings = new javax.swing.JComboBox<>();

        lbPassword.setText("Password");

        lbPassword2.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setResizable(false);

        jbCreate.setBackground(new java.awt.Color(238, 203, 63));
        jbCreate.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });

        jbDelete.setBackground(new java.awt.Color(238, 203, 63));
        jbDelete.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbSave.setBackground(new java.awt.Color(238, 203, 63));
        jbSave.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbSave.setText("Save");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jbCancel.setBackground(new java.awt.Color(238, 203, 63));
        jbCancel.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jtId.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jtId.setText("0");
        jtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdFocusLost(evt);
            }
        });

        jbSearch.setText("...");

        lbUsername.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        lbUsername.setText("Username");

        jtUsernameSettings.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        lbPassword1.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        lbPassword1.setText("Password");

        jtPasswordSettings.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        lbPassword3.setFont(new java.awt.Font("DialogInput", 0, 13)); // NOI18N
        lbPassword3.setText("Name");

        jtNameSettings.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        jcTypeSettings.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jcTypeSettings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Common", "Administrator" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPassword3)
                    .addComponent(lbPassword1)
                    .addComponent(lbUsername)
                    .addComponent(jtUsernameSettings)
                    .addComponent(jtPasswordSettings)
                    .addComponent(jtNameSettings)
                    .addComponent(jcTypeSettings, 0, 296, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsernameSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPassword1)
                .addGap(1, 1, 1)
                .addComponent(jtPasswordSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPassword3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNameSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcTypeSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCreate)
                    .addComponent(jbDelete)
                    .addComponent(jbSave)
                    .addComponent(jbCancel))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdFocusLost

        if (Integer.parseInt(jtId.getText()) == 0) {
            this.actionSearch();
        } else {
            ControllerUser controll = new ControllerUser();
            this.actionSearch();
            try {
                String JSON = controll.recuperar(Integer.parseInt(jtId.getText()));
                System.out.println(JSON);
                String[][] dados = Utils.JsonToVector(JSON, "user");

                if (dados != null) {
                    jtUsernameSettings.setText(dados[0][0]);
                    jtNameSettings.setText(dados[0][1]);

                    if (dados[0][2].equals("Administrator")) {
                        jcTypeSettings.setSelectedIndex(1);
                    } else {
                        jcTypeSettings.setSelectedIndex(0);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "User not found.");
                this.actionCancel();
            }
        }
    }//GEN-LAST:event_jtIdFocusLost

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        this.actionCancel();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        ControllerUser controller = new ControllerUser();

        try {
            controller.deletar(Integer.parseInt(jtId.getText()));
            JOptionPane.showMessageDialog(null, "Successfully deleted.");
            this.actionCancel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error happened, try again.", "Error", JOptionPane.ERROR_MESSAGE);
            this.actionCancel();
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed

        ControllerUser controller = new ControllerUser();
        String[][] dados = null;
        try {
            if (Integer.parseInt(jtId.getText()) == 0) {

                dados = new String[4][2];

                dados[0][0] = "username";
                dados[0][1] = jtUsernameSettings.getText();

                dados[1][0] = "password";
                dados[1][1] = jtPasswordSettings.getText();

                dados[2][0] = "name";
                dados[2][1] = jtNameSettings.getText();

                dados[3][0] = "type";
                dados[3][1] = String.valueOf(jcTypeSettings.getSelectedItem());

                String JSON = Utils.stringToJson(dados);

                if (this.validInformations()) {
                    controller.inserirGenerico(JSON);
                    JOptionPane.showMessageDialog(null, "Successfully inserted.");
                    this.actionCancel();
                }else {
                    JOptionPane.showMessageDialog(null, "Check the complete information. Try again.", "Information", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                dados = new String[5][2];

                dados[0][0] = "username";
                dados[0][1] = jtUsernameSettings.getText();

                dados[1][0] = "password";
                dados[1][1] = jtPasswordSettings.getText();

                dados[2][0] = "name";
                dados[2][1] = jtNameSettings.getText();

                dados[3][0] = "type";
                dados[3][1] = String.valueOf(jcTypeSettings.getSelectedItem());

                dados[4][0] = "id";
                dados[4][1] = String.valueOf(jtId.getText());

                String JSON = Utils.stringToJson(dados);

                if (this.validInformations()) {
                    controller.atualizar(JSON);
                    JOptionPane.showMessageDialog(null, "Successfully updated. The information will be valid after logging in again", "Information", JOptionPane.INFORMATION_MESSAGE);
                    this.actionCancel();
                } else {
                    JOptionPane.showMessageDialog(null, "Check the complete information. Try again.", "Information", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error happened, try again.", "Error", JOptionPane.ERROR_MESSAGE);
            this.actionCancel();
        }
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        this.actionSearch();
        this.clean();
    }//GEN-LAST:event_jbCreateActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    private void actionSearch() {
        jbCreate.setEnabled(false);
        jtId.setEnabled(false);
        jbSearch.setEnabled(false);
    }

    private void actionCancel() {
        jbCreate.setEnabled(true);
        jtId.setEnabled(true);
        jbSearch.setEnabled(true);
        this.clean();
    }

    public void clean() {
        jtId.setText("0");
        jtNameSettings.setText("");
        jtPasswordSettings.setText("");
        jtUsernameSettings.setText("");
        jcTypeSettings.setSelectedIndex(0);
    }

    public Boolean validInformations() {
        if (!jtNameSettings.getText().equals("") && !jtUsernameSettings.getText().equals("") && !jtPasswordSettings.getText().equals("")) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbCreate;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbSave;
    private javax.swing.JButton jbSearch;
    private javax.swing.JComboBox<String> jcTypeSettings;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtNameSettings;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JPasswordField jtPasswordSettings;
    private javax.swing.JTextField jtUsernameSettings;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbPassword2;
    private javax.swing.JLabel lbPassword3;
    private javax.swing.JLabel lbUsername;
    // End of variables declaration//GEN-END:variables
}