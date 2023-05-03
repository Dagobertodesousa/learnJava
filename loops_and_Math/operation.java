package loops_and_Math;

import javax.swing.JOptionPane;

public class operation {
    public static void main(String args[]){
        double value, value1, value2, operator;
        Object math[] = {"abs", "max", "min", "pow", "random", "round", "sqrt"};

        try {
            String seletor = (String) JOptionPane.showInputDialog(null,
                "1: round           |          2: max\n3: min           |          4: sqrt\n5: pow           |          6: abs\n7: random           |          8: \n",
                "Usos da biblioteca Math", JOptionPane.PLAIN_MESSAGE , null, math, "abs");

            switch (seletor){
                case "round":
                    value = Double.parseDouble(JOptionPane.showInputDialog(null, "valor a ser arredondado: "));
                    JOptionPane.showMessageDialog(null, "Valor arredondado de " + value +
                    " para " + Math.round(value), "Math.Round", JOptionPane.OK_OPTION);
                    break;
                case "max":
                    value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "primeiro valor para comparar: "));
                    value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "segundo valor para comparar: "));
                    
                    if (value1 > value2){
                        JOptionPane.showMessageDialog(null, "primeiro valor maior que segundo " + Math.max(value1,value2), "Math.Max", JOptionPane.OK_OPTION);
                    } else
                    if (value2 > value1){
                        JOptionPane.showMessageDialog(null, "segundo valor maior que primeiro " + Math.max(value1,value2), "Math.Max", JOptionPane.OK_OPTION);
                    } else {
                        JOptionPane.showConfirmDialog(null, "Algo de incoveniente aconteceu", "Math.Max", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "min":
                    value1 = Double.parseDouble(JOptionPane.showInputDialog(null, "primeiro valor para comparar: "));
                    value2 = Double.parseDouble(JOptionPane.showInputDialog(null, "segundo valor para comparar: "));
                    
                    if (value1 < value2){
                        JOptionPane.showMessageDialog(null, "primeiro valor menor que segundo " + Math.min(value1,value2), "Math.Min", JOptionPane.OK_OPTION);
                    } else
                    if (value2 < value1){
                        JOptionPane.showMessageDialog(null, "segundo valor menor que primeiro " + Math.min(value1,value2), "Math.Min", JOptionPane.OK_OPTION);
                    } else {
                        JOptionPane.showConfirmDialog(null, "Algo de incoveniente aconteceu", "Erro#", JOptionPane.QUESTION_MESSAGE);
                    };
                    break;
                case "sqrt":
                    value = Double.parseDouble(JOptionPane.showInputDialog(null, "valor para retornar raiz²: "));
                    JOptionPane.showConfirmDialog(null, "Raiz²: " + Math.sqrt(value), "Math.Sqrt", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "pow":
                    value = Double.parseDouble(JOptionPane.showInputDialog(null, "valor a ser potencializado: "));
                    operator = Double.parseDouble(JOptionPane.showInputDialog(null, "expoente de potencialização: "));

                    JOptionPane.showConfirmDialog(null, "Resultado da potencia: " + Math.pow(value, operator), "Math.Pow", JOptionPane.DEFAULT_OPTION);
                    break;
                case "abs":
                    value = Double.parseDouble(JOptionPane.showInputDialog(null, "valor para se ter seu valor absoluto: "));
                    JOptionPane.showMessageDialog(null, "valor absoluto " + Math.abs(value), "Math.abs", JOptionPane.OK_OPTION);
                    break;
                case "random":
                    value = Integer.parseInt(JOptionPane.showInputDialog(null, "valor limite para ser sorteado\nimportante usar multiplos 10, 100, 1000: "));
                    JOptionPane.showConfirmDialog(null, "randomico: " + ((int) Math.floor(Math.random() * value)), "Math.ramdom", JOptionPane.DEFAULT_OPTION);
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "Algum outro valor extra", "Outro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "erro: " + erro.getMessage(), "teve erro ai!?", JOptionPane.OK_OPTION);
            erro.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "--fim--", "teve erro ai!?", JOptionPane.CLOSED_OPTION);
        }
        System.exit(0);
    }
}
