package loops_and_Math;

import javax.swing.JOptionPane;

class leitor_tt extends leitor{

    public static void main(String... args){
        leitor Reader = new leitor();

        Object option[] = {"CHARAT", "TO_UPPER", "TO_LOWER", "SUBSTRING", "TRIM", "REPLACE", "VALUE_OF", "INDEX_OF"};

        try {
            String seletor = (String) JOptionPane.showInputDialog(
                null,
                "Selecione a tarefa: ",
                "Selecionador",
                JOptionPane.CLOSED_OPTION,
                null,
                option,
                "SUBSTRING");
            switch (seletor) {
                case "CHARAT":
                    Reader.CHARAT();
                    break;
                case "TO_UPPER":
                    Reader.TO_UPPER();
                    break;
                case "TO_LOWER":
                    Reader.TO_LOWER();
                    break;
                case "SUBSTRING":
                    Reader.SUBSTRING();
                    break;
                case "TRIM":
                    Reader.TRIM();
                    break;
                case "REPLACE":
                    Reader.REPLACE();
                    break;
                case "VALUE_OF":
                    Reader.VALUE_OF();
                    break;
                case "INDEX_OF":
                    Reader.INDEX_OF();
                    break;
                default:
                    Reader.CHARAT();
                    break;
            }
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "erro: " + erro, "error", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "exit");
        }
    }
}