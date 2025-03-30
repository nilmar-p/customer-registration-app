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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.BankAccount;

public class JsonUtils {

    public static void saveAccount(BankAccount newAccount) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path fileLocation = Paths.get("C:\\data-java-project\\file.json");
        Files.createDirectories(fileLocation.getParent());

        List<BankAccount> accounts = new ArrayList<>();

        if (Files.exists(fileLocation)) {
            try {
                String content = Files.readString(fileLocation);

                if (!content.isEmpty()) {
                    // Desserializar a lista completa
                    accounts = mapper.readValue(content,
                            new TypeReference<List<BankAccount>>() {
                    });
                }
            } catch (Exception e) {
                System.err.println("Erro ao ler arquivo existente: " + e.getMessage());
                // Se houver erro, começa com lista vazia
            }
        }
        accounts.add(newAccount);

        String json = mapper.writeValueAsString(accounts);

        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
    }

    //apagar
    public static void loadJsonAccountsIntoTable(JTable clientsTable) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DefaultTableModel clientsTableModel = (DefaultTableModel) clientsTable.getModel();

        clientsTableModel.setRowCount(0);

        List<BankAccount> accounts = mapper.readValue(new File("C:\\data-java-project\\file.json"), new TypeReference<List<BankAccount>>() {
        });

        for (BankAccount account : accounts) {
            Object[] accountA = {clientsTableModel.getRowCount() + 1, account.getName(), account.getCpf(), account.getAccountType(), "AÇÃO"};
            clientsTableModel.addRow(accountA);

        }
    }

    public static void loadNewAccountIntoTable(BankAccount newAccount, JTable clientsTable) throws IOException {
        DefaultTableModel clientsTableModel = (DefaultTableModel) clientsTable.getModel();

        Object[] accountA = {clientsTableModel.getRowCount() + 1, newAccount.getName(), newAccount.getCpf(), newAccount.getAccountType(), "AÇÃO"};
        clientsTableModel.addRow(accountA);

    }

    public static void deleteAccountFromJson(String cpf, JTable clientsTable) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path fileLocation = Paths.get("C:\\data-java-project\\file.json");
        Files.createDirectories(fileLocation.getParent());

        String content = Files.readString(fileLocation);

        List<BankAccount> accounts = new ArrayList<>();
        accounts = mapper.readValue(content, new TypeReference<List<BankAccount>>() {
        });

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCpf().equals(cpf)) {
                accounts.remove(i);
                break;
            }
        }

        String json = mapper.writeValueAsString(accounts);

        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.WRITE);

        refreshAccountsTable(clientsTable);
    }

//    public static void updateAccountInJson(String cpf, JTable clientsTable) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        Path fileLocation = Paths.get("C:\\data-java-project\\file.json");
//        Files.createDirectories(fileLocation.getParent());
//
//        String content = Files.readString(fileLocation);
//
//        List<BankAccount> accounts = new ArrayList<>();
//        accounts = mapper.readValue(content, new TypeReference<List<BankAccount>>() {
//        });
//
//        for (int i = 0; i < accounts.size(); i++) {
//            if (accounts.get(i).getCpf().equals(cpf)) {
//                accounts.remove(i);
//                break;
//            }
//        }
//    }

    public static void refreshAccountsTable(JTable clientsTable) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DefaultTableModel clientsTableModel = (DefaultTableModel) clientsTable.getModel();

        clientsTableModel.setRowCount(0);

        List<BankAccount> accounts = mapper.readValue(new File("C:\\data-java-project\\file.json"), new TypeReference<List<BankAccount>>() {
        });

        for (BankAccount account : accounts) {
            Object[] accountA = {clientsTableModel.getRowCount() + 1, account.getName(), account.getCpf(), account.getAccountType(), "AÇÃO"};
            clientsTableModel.addRow(accountA);

        }
    }
}
