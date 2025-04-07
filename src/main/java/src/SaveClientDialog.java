package src;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ClientAccount;
import utils.JsonUtils;
import utils.MaskUtils;

/**
 *
 * @author Administrator
 */
public class SaveClientDialog extends javax.swing.JDialog {

    /**
     * Creates new form SaveClientDialog
     */
    public SaveClientDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        clientGender = new javax.swing.JComboBox<>();
        clientPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clientEmail = new javax.swing.JTextField();
        clientCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clientStreet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clientNeighborhood = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clientHouseNumber = new javax.swing.JTextField();
        clientCEP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        clientCity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salvar cliente");
        setMinimumSize(new java.awt.Dimension(650, 370));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
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

        clientGender.setBackground(new java.awt.Color(0, 102, 153));
        clientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        clientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientGenderActionPerformed(evt);
            }
        });
        getContentPane().add(clientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 35));

        clientPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clientPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clientPhoneFocusLost(evt);
            }
        });
        clientPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(clientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 35));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Telefone");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, 35));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 35, 35));

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("E-mail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, 35));
        getContentPane().add(clientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 35));

        clientCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clientCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clientCPFFocusLost(evt);
            }
        });
        getContentPane().add(clientCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 35));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 35, 35));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nome");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 35, 35));
        getContentPane().add(clientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 35));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salvar cliente");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, -1));
        getContentPane().add(clientStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, 35));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rua");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 35, 35));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bairro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 120, 50, 35));
        getContentPane().add(clientNeighborhood, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 100, 35));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("N°");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 35, 35));

        clientHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientHouseNumberActionPerformed(evt);
            }
        });
        getContentPane().add(clientHouseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 50, 35));

        clientCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clientCEPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clientCEPFocusLost(evt);
            }
        });
        getContentPane().add(clientCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 35));

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CEP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 35, 35));

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cidade");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 200, 50, 35));

        clientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCityActionPerformed(evt);
            }
        });
        getContentPane().add(clientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String gender = (String) clientGender.getSelectedItem();

        ClientAccount client = null;

        try {
            client = new ClientAccount(
                    this.clientName.getText().trim().toUpperCase(),
                    this.clientCPF.getText().trim().toUpperCase(),
                    this.clientEmail.getText().trim().toUpperCase(),
                    this.clientPhone.getText().trim().toUpperCase(),
                    gender,
                    this.clientStreet.getText().trim().toUpperCase(),
                    this.clientNeighborhood.getText().trim().toUpperCase(),
                    this.clientHouseNumber.getText().trim().toUpperCase(),
                    this.clientCEP.getText().trim().toUpperCase(),
                    this.clientCity.getText().trim().toUpperCase()
            );
        } catch (IOException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        try {
            if (!MaskUtils.isFormValid(client)) {
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(SaveClientDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            JsonUtils.saveClient(client);
            JOptionPane.showMessageDialog(null, "USUÁRIO REGISTRADO COM SUCESSO!", "Operação concluída", JOptionPane.INFORMATION_MESSAGE);
            JsonUtils.refreshTableAccounts(MenuScreen.table);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR CONTA: " + ex);
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientGenderActionPerformed

    private void clientPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientPhoneActionPerformed

    private void clientHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientHouseNumberActionPerformed

    private void clientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientCityActionPerformed

    private void clientCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientCPFFocusLost
//        try {
//            MaskUtils.cpfMask(clientCPF, clientCPF.getText());
//        } catch (IOException ex) {
//            Logger.getLogger(SaveClientDialog.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_clientCPFFocusLost

    private void clientCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientCPFFocusGained
//        MaskUtils.maskRemove(clientCPF);
    }//GEN-LAST:event_clientCPFFocusGained

    private void clientPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientPhoneFocusLost
//        try {
//            MaskUtils.phoneMask(clientPhone);
//        } catch (IOException ex) {
//            Logger.getLogger(SaveClientDialog.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_clientPhoneFocusLost

    private void clientPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientPhoneFocusGained
//        MaskUtils.maskRemove(clientPhone);
    }//GEN-LAST:event_clientPhoneFocusGained

    private void clientCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientCEPFocusLost
//        try {
//            MaskUtils.cepMask(clientCEP);
//        } catch (IOException ex) {
//            Logger.getLogger(SaveClientDialog.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_clientCEPFocusLost

    private void clientCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientCEPFocusGained
//        MaskUtils.maskRemove(clientCEP);
    }//GEN-LAST:event_clientCEPFocusGained

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
            java.util.logging.Logger.getLogger(SaveClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SaveClientDialog dialog = new SaveClientDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField clientCEP;
    private javax.swing.JTextField clientCPF;
    private javax.swing.JTextField clientCity;
    private javax.swing.JTextField clientEmail;
    private javax.swing.JComboBox<String> clientGender;
    private javax.swing.JTextField clientHouseNumber;
    private javax.swing.JTextField clientName;
    private javax.swing.JTextField clientNeighborhood;
    private javax.swing.JTextField clientPhone;
    private javax.swing.JTextField clientStreet;
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
