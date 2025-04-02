package src;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ClientAccount;
import utils.JsonUtils;

public class UpdateAccountDialog extends javax.swing.JDialog {

    private static ClientAccount updatedClient;

    public static ClientAccount getUpdatedClient() {
        return updatedClient;
    }

    public UpdateAccountDialog(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);

        initComponents();

        editClientName.setText(MenuScreen.name);
        editClientCPF.setText(MenuScreen.cpf);
        editClientEmail.setText(MenuScreen.email);
        editClientPhone.setText(MenuScreen.phone);

        editClientGender.setSelectedIndex(1);

        editClientStreet.setText(MenuScreen.street);
        editClientNeighborhood.setText(MenuScreen.neighborhood);
        editClientHouseNumber.setText(MenuScreen.houseNumber);
        editClientCEP.setText(MenuScreen.cep);
        editClientCity.setText(MenuScreen.city);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        editClientGender = new javax.swing.JComboBox<>();
        editClientPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editClientEmail = new javax.swing.JTextField();
        editClientCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editClientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editClientStreet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editClientNeighborhood = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editClientHouseNumber = new javax.swing.JTextField();
        editClientCEP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        editClientCity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar cliente");
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(650, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(30, 136, 229));
        jButton1.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALVAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 50));

        editClientGender.setBackground(new java.awt.Color(30, 136, 229));
        editClientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        editClientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientGenderActionPerformed(evt);
            }
        });
        getContentPane().add(editClientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 35));

        editClientPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(editClientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 35));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Número");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 35));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 35, 35));

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("E-mail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, 60, 35));
        getContentPane().add(editClientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 35));
        getContentPane().add(editClientCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 35));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 35, 35));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nome");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 35, 35));
        getContentPane().add(editClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 35));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar cliente");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, -1));
        getContentPane().add(editClientStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, 35));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rua");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 35, 35));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bairro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 120, 50, 35));
        getContentPane().add(editClientNeighborhood, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 100, 35));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("N°");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 35, 35));

        editClientHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientHouseNumberActionPerformed(evt);
            }
        });
        getContentPane().add(editClientHouseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 50, 35));
        getContentPane().add(editClientCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 35));

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CEP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 35, 35));

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cidade");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 200, 50, 35));

        editClientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientCityActionPerformed(evt);
            }
        });
        getContentPane().add(editClientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String gender = (String) editClientGender.getSelectedItem();

        try {
            updatedClient = new ClientAccount(
                    MenuScreen.client_id,
                    this.editClientName.getText(),
                    this.editClientCPF.getText(),
                    this.editClientEmail.getText(),
                    this.editClientPhone.getText(),
                    gender,
                    this.editClientStreet.getText(),
                    this.editClientNeighborhood.getText(),
                    this.editClientHouseNumber.getText(),
                    this.editClientCEP.getText(),
                    this.editClientCity.getText()
            );
        } catch (IOException ex) {
            Logger.getLogger(UpdateAccountDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

        //checa se todos os campos estao preenchidos
        if (editClientName.getText().isEmpty() || editClientCPF.getText().isEmpty() || editClientEmail.getText().isEmpty()
                || editClientPhone.getText().isEmpty() || editClientStreet.getText().isEmpty() || editClientNeighborhood.getText().isEmpty()
                || editClientHouseNumber.getText().isEmpty() || editClientCEP.getText().isEmpty() || editClientCity.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO: Todos os campos devem estar preenchidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //cpf check
        if (updatedClient.getCpf().length() != 11 || !updatedClient.getCpf().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF deve conter exatamente 11 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (updatedClient.getPhone().length() != 11 || !updatedClient.getPhone().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número de celular deve conter exatamente 11 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //cep check
        if (updatedClient.getCep().length() != 8 || !updatedClient.getCep().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CEP deve conter exatamente 8 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //house number check
        if (!updatedClient.getHouseNumber().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número da casa deve conter apenas dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dispose();

        try {
            JsonUtils.updateAccountInJson(updatedClient);
        } catch (IOException ex) {
            Logger.getLogger(UpdateAccountDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editClientPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClientPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editClientPhoneActionPerformed

    private void editClientHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClientHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editClientHouseNumberActionPerformed

    private void editClientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClientCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editClientCityActionPerformed

    private void editClientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClientGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editClientGenderActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAccountDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateAccountDialog dialog = new UpdateAccountDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField editClientCEP;
    private javax.swing.JTextField editClientCPF;
    private javax.swing.JTextField editClientCity;
    private javax.swing.JTextField editClientEmail;
    private javax.swing.JComboBox<String> editClientGender;
    private javax.swing.JTextField editClientHouseNumber;
    private javax.swing.JTextField editClientName;
    private javax.swing.JTextField editClientNeighborhood;
    private javax.swing.JTextField editClientPhone;
    private javax.swing.JTextField editClientStreet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
