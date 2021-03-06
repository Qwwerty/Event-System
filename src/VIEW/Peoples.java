/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.ControllerPeoples;
import UTIL.Utils;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Peoples extends javax.swing.JFrame {

    /**
     * Creates new form Peoples
     */
    public Peoples() {
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

        jPanel1 = new javax.swing.JPanel();
        jtIdPeoples = new javax.swing.JTextField();
        jbSearchPeoples = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtNamePeople = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtAdressPeople = new javax.swing.JTextField();
        jtCityPeople = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEmailPeople = new javax.swing.JTextField();
        jbSavePeoples = new javax.swing.JButton();
        jbCreatePeoples = new javax.swing.JButton();
        jbCancelPeople = new javax.swing.JButton();
        jbDeletePeoples = new javax.swing.JButton();
        jlRegistrationPeople = new javax.swing.JLabel();
        jtPhonePeoples = new javax.swing.JFormattedTextField();
        jtCpfPeoples = new javax.swing.JFormattedTextField();
        jtRgPeoples = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Peoples");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jtIdPeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jtIdPeoples.setText("0");
        jtIdPeoples.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdPeoplesFocusLost(evt);
            }
        });

        jbSearchPeoples.setText("...");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel1.setText("Name");

        jtNamePeople.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel3.setText("RG");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel5.setText("Adress");

        jtAdressPeople.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        jtCityPeople.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jLabel7.setText("Phone");

        jLabel8.setText("E-mail");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/uwyo-events-calendar-wyoming.png"))); // NOI18N

        jtEmailPeople.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        jbSavePeoples.setBackground(new java.awt.Color(238, 203, 63));
        jbSavePeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbSavePeoples.setText("Save");
        jbSavePeoples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSavePeoplesActionPerformed(evt);
            }
        });

        jbCreatePeoples.setBackground(new java.awt.Color(238, 203, 63));
        jbCreatePeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbCreatePeoples.setText("Create");
        jbCreatePeoples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreatePeoplesActionPerformed(evt);
            }
        });

        jbCancelPeople.setBackground(new java.awt.Color(238, 203, 63));
        jbCancelPeople.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbCancelPeople.setText("Cancel");
        jbCancelPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelPeopleActionPerformed(evt);
            }
        });

        jbDeletePeoples.setBackground(new java.awt.Color(238, 203, 63));
        jbDeletePeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N
        jbDeletePeoples.setText("Delete");
        jbDeletePeoples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletePeoplesActionPerformed(evt);
            }
        });

        jlRegistrationPeople.setText("Registration Number:");

        try {
            jtPhonePeoples.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtPhonePeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        try {
            jtCpfPeoples.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCpfPeoples.setFont(new java.awt.Font("DialogInput", 1, 13)); // NOI18N

        try {
            jtRgPeoples.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtRgPeoples.setFont(new java.awt.Font("DialogInput", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jtPhonePeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jtEmailPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jtNamePeople)
                                            .addComponent(jLabel5)
                                            .addComponent(jtAdressPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtCpfPeoples)
                                            .addComponent(jtRgPeoples))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtCityPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtIdPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSearchPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(jlRegistrationPeople)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jbCreatePeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSavePeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDeletePeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancelPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSearchPeoples)
                    .addComponent(jlRegistrationPeople))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEmailPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtNamePeople, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCpfPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtRgPeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtAdressPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCityPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPhonePeoples, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSavePeoples)
                    .addComponent(jbCreatePeoples)
                    .addComponent(jbCancelPeople)
                    .addComponent(jbDeletePeoples))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(495, 495, 495))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdPeoplesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdPeoplesFocusLost
        this.actionSearch();
        try {
            if (Integer.parseInt(jtIdPeoples.getText()) != 0) {
                ControllerPeoples controller = new ControllerPeoples();
                String JSON = controller.recuperar(Integer.parseInt(jtIdPeoples.getText()));
                System.out.println(JSON);
                String[][] dados = Utils.JsonToVector(JSON, "people");

                if (dados != null) {
                    jtIdPeoples.setText(dados[0][8]);
                    jtNamePeople.setText(dados[0][0]);
                    jtAdressPeople.setText(dados[0][3]);
                    jtCityPeople.setText(dados[0][4]);
                    jtEmailPeople.setText(dados[0][6]);
                    jtPhonePeoples.setText(dados[0][5]);
                    jtRgPeoples.setText(dados[0][2]);
                    jtCpfPeoples.setText(dados[0][1]);
                    jlRegistrationPeople.setText("Registration Number: " + dados[0][7]);
                } else {
                    JOptionPane.showMessageDialog(null, "An unexpected error happened, try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "People not found.");
            this.actionCancel();
        }
    }//GEN-LAST:event_jtIdPeoplesFocusLost

    private void jbCancelPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelPeopleActionPerformed
        this.actionCancel();
        this.clean();
    }//GEN-LAST:event_jbCancelPeopleActionPerformed

    private void jbCreatePeoplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreatePeoplesActionPerformed
        this.actionSearch();
        this.clean();
    }//GEN-LAST:event_jbCreatePeoplesActionPerformed

    private void jbSavePeoplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSavePeoplesActionPerformed
        ControllerPeoples controller = new ControllerPeoples();
        String[][] dados = new String[9][2];

        dados[0][0] = "name";
        dados[0][1] = jtNamePeople.getText();

        dados[1][0] = "CFP";
        dados[1][1] = jtCpfPeoples.getText().replace(".", "")
                .replace("-", "").trim();

        dados[2][0] = "RG";
        dados[2][1] = jtRgPeoples.getText().replace(".", "")
                .replace("-", "").trim();

        dados[3][0] = "adress";
        dados[3][1] = jtAdressPeople.getText().replace(",", "");

        dados[4][0] = "city";
        dados[4][1] = jtCityPeople.getText();

        dados[5][0] = "phone";
        dados[5][1] = jtPhonePeoples.getText().replace("-", "")
                .replace("(", "")
                .replace(")", "").trim();

        dados[6][0] = "email";
        dados[6][1] = jtEmailPeople.getText();

        Random r = new Random();
        int low = 10;
        int high = 32000;
        int result = r.nextInt(high - low) + low;

        dados[7][0] = "registrationNumber";
        dados[7][1] = String.valueOf(result);

        dados[8][0] = "id";
        dados[8][1] = jtIdPeoples.getText();

        try {
            if (Integer.parseInt(jtIdPeoples.getText()) == 0) {
                String JSON = Utils.stringToJson(dados);
                if (this.validInformations()) {
                    
                    Boolean isRegistration = false;
                    
                    do{
                        if(controller.validRegistrationNumber(JSON))
                            isRegistration = true;
                        else
                            isRegistration = false;
                    }
                    while(isRegistration == false);
                    
                    if (controller.validCPF(JSON)) {
                        if (controller.inserirGenerico(JSON)) {
                            JOptionPane.showMessageDialog(null, "Successfully inserted.", "Info", JOptionPane.INFORMATION_MESSAGE);
                            this.actionCancel();
                        } else {
                            JOptionPane.showMessageDialog(null, "Not inserted.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Existing CPF, try another CPF.", "Information", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Check the complete information. Try again.", "Information", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (this.validInformations()) {
                    String JSON = Utils.stringToJson(dados);
                    if (controller.atualizar(JSON)) {
                        this.validInformations();
                        JOptionPane.showMessageDialog(null, "Successfully updated.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        this.actionCancel();
                    } else {
                        JOptionPane.showMessageDialog(null, "Check the complete information. Try again.", "Information", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Check the complete information. Try again.", "Information", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error happened, try again.", "Error", JOptionPane.ERROR_MESSAGE);
            this.actionCancel();
        }
    }//GEN-LAST:event_jbSavePeoplesActionPerformed

    private void jbDeletePeoplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletePeoplesActionPerformed
        ControllerPeoples controller = new ControllerPeoples();

        try {
            controller.deletar(Integer.parseInt(jtIdPeoples.getText()));
            JOptionPane.showMessageDialog(null, "Successfully deleted.");
            this.actionCancel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error happened, try again.", "Error", JOptionPane.ERROR_MESSAGE);
            this.actionCancel();
        }
    }//GEN-LAST:event_jbDeletePeoplesActionPerformed

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
            java.util.logging.Logger.getLogger(Peoples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peoples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peoples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peoples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peoples().setVisible(true);
            }
        });
    }

    private void actionSearch() {
        jbCreatePeoples.setEnabled(false);
        jtIdPeoples.setEnabled(false);
        jbSearchPeoples.setEnabled(false);
    }

    private void actionCancel() {
        jbCreatePeoples.setEnabled(true);
        jtIdPeoples.setEnabled(true);
        jbSearchPeoples.setEnabled(true);
        this.clean();
    }

    public void clean() {
        jtIdPeoples.setText("0");
        jtNamePeople.setText("");
        jtAdressPeople.setText("");
        jtCityPeople.setText("");
        jtEmailPeople.setText("");
        jtPhonePeoples.setText("");
        jtRgPeoples.setText("");
        jtCpfPeoples.setText("");
        jlRegistrationPeople.setText("Registration Number:");
    }

    public Boolean validInformations() {
        String CPF = jtCpfPeoples.getText().replace(".", "")
                .replace("-", "").trim();

        String RG = jtRgPeoples.getText().replace(".", "")
                .replace("-", "").trim();

        if (!jtNamePeople.getText().equals("")
                && !CPF.isEmpty() && !RG.isEmpty()
                && !jtAdressPeople.getText().equals("")
                && !jtCityPeople.getText().equals("")) {
            return true;
        };
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton jbCancelPeople;
    private javax.swing.JButton jbCreatePeoples;
    private javax.swing.JButton jbDeletePeoples;
    private javax.swing.JButton jbSavePeoples;
    private javax.swing.JButton jbSearchPeoples;
    private javax.swing.JLabel jlRegistrationPeople;
    private javax.swing.JTextField jtAdressPeople;
    private javax.swing.JTextField jtCityPeople;
    private javax.swing.JFormattedTextField jtCpfPeoples;
    private javax.swing.JTextField jtEmailPeople;
    private javax.swing.JTextField jtIdPeoples;
    private javax.swing.JTextField jtNamePeople;
    private javax.swing.JFormattedTextField jtPhonePeoples;
    private javax.swing.JFormattedTextField jtRgPeoples;
    // End of variables declaration//GEN-END:variables
}
