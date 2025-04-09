package utils;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class BackupUtils {
    private static Path dirBackups = Paths.get("C:\\customer-registration-app\\users", LoginUtils.loggedUser, "backups");
    private static Path dirClientsJson = Paths.get("C:\\customer-registration-app\\users", LoginUtils.loggedUser, "clients.json");

    public static void createBackupFile() {
        try {
            Files.createDirectories(dirBackups);

            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String zipFileName = "BACKUP-" + timestamp + ".zip";

            Path zipFile = dirBackups.resolve(zipFileName);

            try (
                    FileOutputStream fos = new FileOutputStream(zipFile.toFile());
                    ZipOutputStream zipOut = new ZipOutputStream(fos);
                    FileInputStream fis = new FileInputStream(dirClientsJson.toFile())
            ) {
                ZipEntry zipEntry = new ZipEntry("clients.json");
                zipOut.putNextEntry(zipEntry);

                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    zipOut.write(buffer, 0, len);
                }

                zipOut.closeEntry();
                System.out.println("Backup criado com sucesso: " + zipFile.getFileName());

            }
            JOptionPane.showMessageDialog(null, "BACKUP CRIADO COM SUCESSO!", "Operação concluída", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO AO CRIAR BACKUP!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
