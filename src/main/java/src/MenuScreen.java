package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.ClientAccount;
import utils.JsonUtils;
import src.UpdateAccountDialog;

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

    public MenuScreen() {
        initComponents();
        setLocationRelativeTo(null);

        Path fileLocation = Paths.get("C:\\data-java-project\\file.json");
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
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        clientGender = new javax.swing.JComboBox<>();
        clientLabel4 = new javax.swing.JLabel();
        clienteLabel3 = new javax.swing.JLabel();
        clientPhone = new javax.swing.JTextField();
        clientEmail = new javax.swing.JTextField();
        clientLabel2 = new javax.swing.JLabel();
        clienteLabel1 = new javax.swing.JLabel();
        clientCPF = new javax.swing.JTextField();
        clientName = new javax.swing.JTextField();
        clientLabel = new javax.swing.JLabel();
        clientLabel5 = new javax.swing.JLabel();
        clientStreet = new javax.swing.JTextField();
        clientNeighborhood = new javax.swing.JTextField();
        clientLabel7 = new javax.swing.JLabel();
        clientHouseNumber = new javax.swing.JTextField();
        clientCEP = new javax.swing.JTextField();
        clientLabel6 = new javax.swing.JLabel();
        clientLabel8 = new javax.swing.JLabel();
        clientLabel9 = new javax.swing.JLabel();
        clientCity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Clientes - Nilmar");
        setMinimumSize(new java.awt.Dimension(850, 700));
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
        clientsTable.setSelectionBackground(new java.awt.Color(30, 136, 229));
        clientsTable.setShowGrid(false);
        clientsTable.getTableHeader().setReorderingAllowed(false);
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
            clientsTable.getColumnModel().getColumn(2).setResizable(false);
            clientsTable.getColumnModel().getColumn(3).setResizable(false);
            clientsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 407, 835, 250));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar novo cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 841, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 200, 35));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pesquisa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 70, 30));

        jButton1.setBackground(new java.awt.Color(30, 136, 229));
        jButton1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 80, 35));

        clientGender.setBackground(new java.awt.Color(30, 136, 229));
        clientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        clientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientGenderActionPerformed(evt);
            }
        });

        clientLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel4.setText("Sexo");

        clienteLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clienteLabel3.setText("Número");

        clientPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPhoneActionPerformed(evt);
            }
        });

        clientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientEmailActionPerformed(evt);
            }
        });

        clientLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel2.setText("E-mail");

        clienteLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clienteLabel1.setText("CPF");

        clientCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCPFActionPerformed(evt);
            }
        });

        clientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameActionPerformed(evt);
            }
        });

        clientLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        clientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel.setText("Nome");

        clientLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel5.setText("Rua");

        clientLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel7.setText("N°");

        clientHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientHouseNumberActionPerformed(evt);
            }
        });

        clientLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel6.setText("Bairro");

        clientLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel8.setText("CEP");

        clientLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel9.setText("Cidade");

        clientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(clienteLabel3)
                            .addGap(6, 6, 6)
                            .addComponent(clientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(clientLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(clientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(clientLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(clienteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(clientLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(clientLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(clientLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(clientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(clientLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(clientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(clientLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(clientCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clienteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clienteLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clientLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 720, 220));

        jButton2.setBackground(new java.awt.Color(30, 136, 229));
        jButton2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALVAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clientsTableMouseClicked

    private void clientsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMousePressed

        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = clientsTable.rowAtPoint(evt.getPoint());
            if (row >= 0) {
                DefaultTableModel model = (DefaultTableModel) clientsTable.getModel();

                JPopupMenu popupMenu = new JPopupMenu();

                JMenuItem viewItem = new JMenuItem("Visualizar cliente");
                viewItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int clientId = (Integer) clientsTable.getValueAt(row, 0);

                        ClientAccount client = null;

                        try {
                            client = JsonUtils.returnRowClientObject(clientId);
                            //String genderI = (String) clientGender.getSelectedItem();

                            client_id = client.getClient_id();
                            name = client.getName();
                            cpf = client.getCpf();
                            email = client.getEmail();
                            phone = client.getPhone();

                            gender = "Feminino";

                            street = client.getStreet();
                            neighborhood = client.getNeighborhood();
                            houseNumber = client.getHouseNumber();
                            cep = client.getCep();
                            city = client.getCity();

                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
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
                                JsonUtils.deleteAccountFromJson(client_id);
                                JOptionPane.showMessageDialog(null, "USUÁRIO EXCLUÍDO COM SUCESSO!", "Operação concluída", JOptionPane.INFORMATION_MESSAGE);
                                JsonUtils.refreshTableAccounts(clientsTable);
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "ERRO");
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
                            client = JsonUtils.returnRowClientObject(clientId);
                            //String genderI = (String) clientGender.getSelectedItem();

                            client_id = client.getClient_id();
                            name = client.getName();
                            cpf = client.getCpf();
                            email = client.getEmail();
                            phone = client.getPhone();

                            gender = "Feminino";

                            street = client.getStreet();
                            neighborhood = client.getNeighborhood();
                            houseNumber = client.getHouseNumber();
                            cep = client.getCep();
                            city = client.getCity();

                        } catch (IOException ex) {
                            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        try {
                            UpdateAccountDialog modalUpdate = new UpdateAccountDialog(MenuScreen.this, true);
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

    private void clientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientCityActionPerformed

    private void clientHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientHouseNumberActionPerformed

    private void clientPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPhoneActionPerformed

    }//GEN-LAST:event_clientPhoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String gender = (String) clientGender.getSelectedItem();

        ClientAccount client = null;

        try {
            client = new ClientAccount(
                    this.clientName.getText(),
                    this.clientCPF.getText(),
                    this.clientEmail.getText(),
                    this.clientPhone.getText(),
                    gender,
                    this.clientStreet.getText(),
                    this.clientNeighborhood.getText(),
                    this.clientHouseNumber.getText(),
                    this.clientCEP.getText(),
                    this.clientCity.getText()
            );
        } catch (IOException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        //checa se todos os campos estao preenchidos
        if (clientName.getText().isEmpty() || clientCPF.getText().isEmpty() || clientEmail.getText().isEmpty()
                || clientPhone.getText().isEmpty() || clientStreet.getText().isEmpty() || clientNeighborhood.getText().isEmpty()
                || clientHouseNumber.getText().isEmpty() || clientCEP.getText().isEmpty() || clientCity.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO: Todos os campos devem estar preenchidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //cpf format check
        if (client.getCpf().length() != 11 || !client.getCpf().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF deve conter exatamente 11 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //cpf valid check
        try {
            if (!JsonUtils.isValidCpf(client.getCpf())) {
                JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF já cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        //phone check
        if (client.getPhone().length() != 11 || !client.getPhone().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número de celular deve conter exatamente 11 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //cep check
        if (client.getCep().length() != 8 || !client.getCep().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CEP deve conter exatamente 8 dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //house number check
        if (!client.getHouseNumber().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número da casa deve conter apenas dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            JsonUtils.saveAccount(client);
            JsonUtils.refreshTableAccounts(clientsTable);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR CONTA: " + ex);
            Logger.getLogger(MenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        clearFormFields(
                this.clientName,
                this.clientCPF,
                this.clientEmail,
                this.clientPhone,
                this.clientGender,
                this.clientStreet,
                this.clientNeighborhood,
                this.clientHouseNumber,
                this.clientCEP,
                this.clientCity
        );

    }//GEN-LAST:event_jButton2ActionPerformed

    private void clientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientGenderActionPerformed

    private void clientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientEmailActionPerformed

    private void clientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameActionPerformed

    private void clientCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientCPFActionPerformed

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
    private javax.swing.JTextField clientCEP;
    private javax.swing.JTextField clientCPF;
    private javax.swing.JTextField clientCity;
    private javax.swing.JTextField clientEmail;
    private javax.swing.JComboBox<String> clientGender;
    private javax.swing.JTextField clientHouseNumber;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JLabel clientLabel2;
    private javax.swing.JLabel clientLabel4;
    private javax.swing.JLabel clientLabel5;
    private javax.swing.JLabel clientLabel6;
    private javax.swing.JLabel clientLabel7;
    private javax.swing.JLabel clientLabel8;
    private javax.swing.JLabel clientLabel9;
    private javax.swing.JTextField clientName;
    private javax.swing.JTextField clientNeighborhood;
    private javax.swing.JTextField clientPhone;
    private javax.swing.JTextField clientStreet;
    private javax.swing.JLabel clienteLabel1;
    private javax.swing.JLabel clienteLabel3;
    private javax.swing.JTable clientsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
