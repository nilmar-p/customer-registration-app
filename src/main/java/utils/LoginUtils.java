package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import model.UserAccount;

public class LoginUtils {

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
    
    public static void checkLoginCredentials(String user, String password){
        
    }
}
