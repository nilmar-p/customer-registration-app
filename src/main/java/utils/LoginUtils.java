package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import model.UserAccount;

public class LoginUtils {

    public static String loggedUser;

    public static boolean createAccount(UserAccount newAccount) throws IOException {
        String userName = newAccount.getUserName();
        Path userDir = Paths.get("C:\\customer-registration-app\\users", userName);
        Path fileLocation = userDir.resolve("accountSettings.json");

        if (Files.exists(userDir)) {
            return false;
        }

        Files.createDirectories(userDir);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(newAccount);

        Files.write(fileLocation, json.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);

        return true;
    }

    public static boolean areLoginCredentialsValid(String user, String password) {
        ObjectMapper mapper = new ObjectMapper();
        Path userJsonPath = Paths.get("C:\\customer-registration-app\\users", user, "accountSettings.json");

        if (!Files.exists(userJsonPath)) {
            JOptionPane.showMessageDialog(null, "Usuário não existe!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String content;
        UserAccount settings = null;

        try {
            content = Files.readString(userJsonPath);

            if (!content.isEmpty()) {
                settings = mapper.readValue(content, UserAccount.class);

            } else {
                JOptionPane.showMessageDialog(null, "O arquivo AccountSettings.json está vazio!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!settings.getUserPassword().equals(password)) {
            JOptionPane.showMessageDialog(null, "Senha incorreta para " + user + "!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);

        loggedUser = user;
        return true;
    }

}
