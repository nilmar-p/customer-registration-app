package utils;

import java.io.IOException;
import javax.swing.JOptionPane;
import model.ClientAccount;

public class MaskUtils {

    public static boolean isFormValid(ClientAccount client) throws IOException {

        // Empty filds check
        if (client.getName().isEmpty() || client.getCpf().isEmpty() || client.getEmail().isEmpty()
                || client.getPhone().isEmpty() || client.getStreet().isEmpty()
                || client.getNeighborhood().isEmpty() || client.getHouseNumber().isEmpty()
                || client.getCep().isEmpty() || client.getCity().isEmpty()) {

            JOptionPane.showMessageDialog(null, "ATENÇÃO: Todos os campos devem estar preenchidos!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // CPF check        
        if (client.getCpf().length() != 11 || !client.getCpf().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF deve conter exatamente 11 dígitos numéricos!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!JsonUtils.isCpfValid(client.getCpf())) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF já cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Phone check
        if (client.getPhone().length() != 11 || !client.getPhone().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número de celular deve conter exatamente 11 dígitos numéricos!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // CEP check
        if (client.getCep().length() != 8 || !client.getCep().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: CEP deve conter exatamente 8 dígitos numéricos!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // House number check
        if (!client.getHouseNumber().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: Número da casa deve conter apenas dígitos numéricos!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

}
