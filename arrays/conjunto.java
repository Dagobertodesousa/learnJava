package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class conjunto {
    double pessoas[] = new double[100000];
    public void compor(){
        DecimalFormat df = new DecimalFormat();
        for (int i = 0; i < pessoas.length; i++){
            pessoas[i] = (Math.random() * 10);
            df.applyPattern("#.###");
            df.format(pessoas[i]);
        }
        for (int i = 0; i <= 3; i++){
            JOptionPane.showMessageDialog(null, pessoas[i], "Retorno", 0);
        }
    }
    public void publico(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "qual valor", null, 0));

        boolean resultado = false;
        resultado = (pessoas.equals(valor)) ? true : false;
        String encontrado = (resultado == true) ? "Encontrado" : "Não encontrado";
        JOptionPane.showMessageDialog(null, "Resultado: " + encontrado, "Retorno", 0);
    }
    public void privado(){
        String valor = "";
        Arrays.sort(pessoas);
        for (int i = 0; i <= 99; i++){
            valor += pessoas[i] + " ";
            if ((i+1) % 10 == 0){
                valor += "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, valor, "primeiros 100", 0);
    }
    protected void protegido(){

    }

    public static void main(String[] args){
        conjunto cj = new conjunto();
        cj.compor();
        cj.publico();
        cj.privado();
    }
}
