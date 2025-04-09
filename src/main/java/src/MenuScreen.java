package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.ClientAccount;
import utils.BackupUtils;
import utils.JsonUtils;
import utils.LoginUtils;

public class MenuScreen extends javax.swing.JFrame {

    public static int client_id;

    public static String name;
    public static String cpf;
    public static String email;
    public static String phone;

    public static String gender;

    public static String street;
    public static String neighborhood;
    public static String houseNumber;
    public static String cep;
    public static String city;

    public static JTable table;

    public MenuScreen() {
        initComponents();
        
        setLocationRelativeTo(null);

        Path fileLocation = JsonUtils.getFileLocation();
        try {
            Files.createDirectories(fileLocation.getParent());
        } catch (IOException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO NO FILES.CREATEDIRECTORIES!" + ex);
        }

        if (Files.exists(fileLocation)) {
            try {
                JsonUtils.refreshTableAccounts(clientsTable);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR CONTAS!" + e);
            }
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

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        loggedUserLabel = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchFilter = new javax.swing.JComboBox<>();
        searchInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Clientes - Nilmar");
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientsTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "Telefone", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientsTable.setMaximumSize(new java.awt.Dimension(650, 0));
        clientsTable.setMinimumSize(new java.awt.Dimension(650, 0));
        clientsTable.setRowHeight(30);
        clientsTable.setSelectionBackground(new java.awt.Color(30, 136, 229));
        clientsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clientsTable.setShowGrid(false);
        clientsTable.getTableHeader().setReorderingAllowed(false);
        clientsTable.setUpdateSelectionOnSort(false);
        clientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(clientsTable);
        if (clientsTable.getColumnModel().getColumnCount() > 0) {
            clientsTable.getColumnModel().getColumn(0).setMinWidth(50);
            clientsTable.getColumnModel().getColumn(0).setMaxWidth(50);
            clientsTable.getColumnModel().getColumn(1).setResizable(false);
            clientsTable.getColumnModel().getColumn(2).setMinWidth(230);
            clientsTable.getColumnModel().getColumn(2).setMaxWidth(230);
            clientsTable.getColumnModel().getColumn(3).setMinWidth(150);
            clientsTable.getColumnModel().getColumn(3).setMaxWidth(150);
            clientsTable.getColumnModel().getColumn(4).setResizable(false);
        }
        clientsTable.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 720, 560));

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NOVO CLIENTE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(220, 100));
        jButton3.setMinimumSize(new java.awt.Dimension(220, 100));
        jButton3.setPreferredSize(new java.awt.Dimension(220, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CRIAR BACKUP");
        jButton2.setAutoscrolls(true);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(220, 100));
        jButton2.setMinimumSize(new java.awt.Dimension(220, 100));
        jButton2.setPreferredSize(new java.awt.Dimension(220, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        loggedUserLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loggedUserLabel.setText(LoginUtils.loggedUser);
        loggedUserLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sair");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loggedUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIcon)
                    .addComponent(loggedUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        userIcon.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 510));

        jPanel2.setBackground(new java.awt.Color(191, 191, 201));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENU DE CLIENTES");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        searchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Cidade" }));
        searchFilter.setFocusable(false);
        searchFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFilterActionPerformed(evt);
            }
        });

        searchInput.setToolTipText(null);
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchInput.getAccessibleContext().setAccessibleParent(clientsTable);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void clientsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = clientsTable.rowAtPoint(evt.getPoint());
            if (row >= 0) {
                clientsTable.setRowSelectionInterval(row, row);
                clientsTable.setFocusable(true);
                clientsTable.requestFocusInWindow();

                DefaultTableModel model = (DefaultTableModel) clientsTable.getModel();

                JPopupMenu popupMenu = new JPopupMenu();

                JMenuItem viewItem = new JMenuItem("Visualizar cliente");
                viewItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int clientId = (Integer) clientsTable.getValueAt(row, 0);

                        ClientAccount client = null;

                        try {
                            client = JsonUtils.returnRowClientAsObject(clientId);

                            client_id = client.getClient_id();
                            name = client.getName();
                            cpf = client.getCpf();
                            email = client.getEmail();
                            phone = client.getPhone();

                            gender = client.getGender();

                            street = client.getStreet();
                            neighborhood = client.getNeighborhood();
                            houseNumber = client.getHouseNumber();
                            cep = client.getCep();
                            city = client.getCity();

                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, "ERRO AO VISUALIZAR CLIENTE!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        }

                        ShowClientDialog modalView = new ShowClientDialog(MenuScreen.this, true);
                        modalView.setVisible(true);
                    }
                });

                JMenuItem deleteItem = new JMenuItem("Excluir");
                deleteItem.addActionListener(new ActionListener() {
                    int client_id = (Integer) clientsTable.getValueAt(row, 0);

                    public void actionPerformed(ActionEvent e) {
                        int confirmDelete = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

                        if (confirmDelete == JOptionPane.YES_OPTION) {
                            try {
                                model.removeRow(row);
                                JsonUtils.deleteClientFromJson(client_id);
                                JOptionPane.showMessageDialog(null, "CLIENTE EXCLUÍDO COM SUCESSO!", "Operação concluída", JOptionPane.INFORMATION_MESSAGE);
                                JsonUtils.refreshTableAccounts(clientsTable);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR CLIENTE!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                throw new RuntimeException(ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "OPERAÇÃO CANCELADA!", "Operação cancelada", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

                JMenuItem updateItem = new JMenuItem("Editar");
                updateItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int clientId = (Integer) clientsTable.getValueAt(row, 0);

                        ClientAccount client = null;

                        try {
                            client = JsonUtils.returnRowClientAsObject(clientId);

                            client_id = client.getClient_id();
                            name = client.getName();
                            cpf = client.getCpf();
                            email = client.getEmail();
                            phone = client.getPhone();

                            gender = client.getGender();

                            street = client.getStreet();
                            neighborhood = client.getNeighborhood();
                            houseNumber = client.getHouseNumber();
                            cep = client.getCep();
                            city = client.getCity();

                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        try {
                            UpdateClientDialog modalUpdate = new UpdateClientDialog(MenuScreen.this, true);
                            modalUpdate.setVisible(true);

                            JsonUtils.refreshTableAccounts(clientsTable);
                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });

                popupMenu.add(viewItem);
                popupMenu.add(updateItem);
                popupMenu.add(deleteItem);
                popupMenu.show(clientsTable, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_clientsTableMousePressed

    private void clientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clientsTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        table = clientsTable;

        SaveClientDialog modalSave = new SaveClientDialog(MenuScreen.this, true);
        modalSave.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String search = searchInput.getText().trim().toUpperCase();
        String filter = (String) searchFilter.getSelectedItem();

        try {
            JsonUtils.searchClient(search, filter.trim().toUpperCase(), clientsTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        String search = searchInput.getText().trim().toUpperCase();
        String filter = (String) searchFilter.getSelectedItem();

        try {
            JsonUtils.searchClient(search, filter.trim().toUpperCase(), clientsTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFilterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BackupUtils.createBackupFile();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LoginScreen loginScreen = new LoginScreen();

        loginScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuScreen().setVisible(true);
            }
        });
    }

    //main methods
    public static void clearFormFields(javax.swing.JTextField nameField,
            javax.swing.JTextField cpfField,
            javax.swing.JTextField emailField,
            javax.swing.JTextField phoneField,
            javax.swing.JComboBox<String> genderField,
            javax.swing.JTextField streetField,
            javax.swing.JTextField neighborhoodField,
            javax.swing.JTextField houseNumberField,
            javax.swing.JTextField cepField,
            javax.swing.JTextField cityField) {

        nameField.setText("");
        cpfField.setText("");
        emailField.setText("");
        phoneField.setText("");
        streetField.setText("");
        neighborhoodField.setText("");
        houseNumberField.setText("");
        cepField.setText("");
        cityField.setText("");

        genderField.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel loggedUserLabel;
    private javax.swing.JComboBox<String> searchFilter;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables

}
