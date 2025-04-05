package utils;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ClientAccount;

public class MaskUtils {

//    public static void cpfMask(JTextField fieldCPF, String cpf) throws IOException {
//        if (!JsonUtils.isValidCpf(cpf)) {
//            fieldCPF.setForeground(Color.RED);
//            JOptionPane.showMessageDialog(null, "ATENÇÃO: CPF já cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//
//        String formatedCpf = fieldCPF.getText().substring(0, 3) + "."
//                + fieldCPF.getText().substring(3, 6) + "."
//                + fieldCPF.getText().substring(6, 9) + "-"
//                + fieldCPF.getText().substring(9);
//
//        fieldCPF.setText(formatedCpf);
//    }
//
//    public static void phoneMask(JTextField fieldPhone) throws IOException {
//        String formatedPhone = "(" + fieldPhone.getText().substring(0, 2) + ") "
//                + fieldPhone.getText().substring(2, 7) + "-"
//                + fieldPhone.getText().substring(7);
//
//        fieldPhone.setText(formatedPhone);
//    }
//
//    public static void cepMask(JTextField fieldCep) throws IOException {
//        String formatedCep = fieldCep.getText().substring(0, 5) + "-"
//                + fieldCep.getText().substring(5);
//
//        fieldCep.setText(formatedCep);
//    }
//
//    public static void maskRemove(JTextField field) {
//        field.setForeground(Color.black);
//        field.setCaretPosition(field.getText().length());
//        field.setText(field.getText().replaceAll("\\D", ""));
//    }
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
