package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.ClientAccount;

public class JsonUtils {
    public static Path fileLocation = Paths.get("C:\\customer-registration-app\\users", LoginUtils.loggedUser, "clients.json");

    public static void saveClient(ClientAccount newClient) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Files.createDirectories(fileLocation.getParent());

        List<ClientAccount> clients = new ArrayList<>();

        if (Files.exists(fileLocation)) {
            try {
                String content = Files.readString(fileLocation);

                if (!content.isEmpty()) {
                    clients = mapper.readValue(content,
                            new TypeReference<List<ClientAccount>>() {
                            });
                }
            } catch (Exception e) {
                System.err.println("Erro ao ler arquivo existente: " + e.getMessage());
            }
        }
        clients.add(newClient);

        String json = mapper.writeValueAsString(clients);

        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
    }

    public static boolean isCpfValid(String cpf) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<ClientAccount> accounts = mapper.readValue(new File(String.valueOf(fileLocation)), new TypeReference<List<ClientAccount>>() {
        });

        for (ClientAccount account : accounts) {
            if (account.getCpf().equals(cpf)) {
                return false;
            }
        }

        return true;
    }

    public static void deleteAccountFromJson(int client_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Files.createDirectories(fileLocation.getParent());

        String content = Files.readString(fileLocation);

        List<ClientAccount> accounts = new ArrayList<>();
        accounts = mapper.readValue(content, new TypeReference<List<ClientAccount>>() {
        });

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getClient_id() == client_id) {
                accounts.remove(i);
                break;
            }
        }

        String json = mapper.writeValueAsString(accounts);
        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
    }

    public static void updateAccountInJson(ClientAccount updatedClient) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Files.createDirectories(fileLocation.getParent());

        String content = Files.readString(fileLocation);
        List<ClientAccount> accounts = new ArrayList<>();

        if (!content.isEmpty()) {
            accounts = mapper.readValue(content, new TypeReference<List<ClientAccount>>() {
            });
        }

        for (ClientAccount account : accounts) {
            if (updatedClient.getClient_id() == account.getClient_id()) {
                account.setName(updatedClient.getName());
                account.setCpf(updatedClient.getCpf());
                account.setEmail(updatedClient.getEmail());
                account.setPhone(updatedClient.getPhone());

                account.setGender(updatedClient.getGender());

                account.setStreet(updatedClient.getStreet());
                account.setNeighborhood(updatedClient.getNeighborhood());
                account.setHouseNumber(updatedClient.getHouseNumber());
                account.setCep(updatedClient.getCep());
                account.setCity(updatedClient.getCity());
                break;
            }
        }

        String json = mapper.writeValueAsString(accounts);
        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
    }

    public static void searchAccount(String search, String filter, JTable clientsTable) throws IOException {
        DefaultTableModel clientsTableModel = (DefaultTableModel) clientsTable.getModel();
        ObjectMapper mapper = new ObjectMapper();

        List<ClientAccount> accounts = mapper.readValue(new File(String.valueOf(fileLocation)), new TypeReference<List<ClientAccount>>() {
        });

        clientsTableModel.setRowCount(0);

        switch (filter) {
            case "NOME":
                for (ClientAccount account : accounts) {
                    if (account.getName().startsWith(search)) {
                        Object[] accountA = {account.getClient_id(), account.getName(),
                                account.getEmail(), account.getPhone(), account.getCity()};
                        clientsTableModel.addRow(accountA);
                    }
                }
                break;
            case "CPF":
                if (!search.matches("\\d+") && !search.equals("")) {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF deve conter apenas dígitos numéricos!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    break;
                }

                for (ClientAccount account : accounts) {
                    if (account.getCpf().startsWith(search)) {
                        Object[] accountA = {account.getClient_id(), account.getName(),
                                account.getEmail(), account.getPhone(), account.getCity()};
                        clientsTableModel.addRow(accountA);
                    }
                }
                break;
            case "CIDADE":
                for (ClientAccount account : accounts) {
                    if (account.getCity().startsWith(search)) {
                        Object[] accountA = {account.getClient_id(), account.getName(),
                                account.getEmail(), account.getPhone(), account.getCity()};
                        clientsTableModel.addRow(accountA);
                    }
                }
                break;
        }
    }

    public static void refreshTableAccounts(JTable clientsTable) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DefaultTableModel clientsTableModel = (DefaultTableModel) clientsTable.getModel();

        clientsTableModel.setRowCount(0);

        List<ClientAccount> accounts = mapper.readValue(new File(String.valueOf(fileLocation)), new TypeReference<List<ClientAccount>>() {
        });

        for (ClientAccount account : accounts) {
            Object[] accountA = {account.getClient_id(), account.getName(), account.getEmail(), account.getPhone(), account.getCity()};
            clientsTableModel.addRow(accountA);

        }
    }

    public static ClientAccount returnRowClientAsObject(int client_id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<ClientAccount> accounts = mapper.readValue(new File(String.valueOf(fileLocation)), new TypeReference<List<ClientAccount>>() {
        });

        ClientAccount client = null;
        for (ClientAccount account : accounts) {
            if (account.getClient_id() == client_id) {
                client = new ClientAccount(
                        account.getClient_id(),
                        account.getName(),
                        account.getCpf(),
                        account.getEmail(),
                        account.getPhone(),
                        account.getGender(),
                        account.getStreet(),
                        account.getNeighborhood(),
                        account.getHouseNumber(),
                        account.getCep(),
                        account.getCity()
                );
                break;
            }
        }

        return client;

    }
}