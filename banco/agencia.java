package banco;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class agencia {
    private static final double
        moedaDolar = 5.0399,
        moedaEuro = 5.5562,
        moedaReal = 1,
        moedaBc = 143663.03,
        moedaRubro = 0.063,
        moedaYene = 0.0371,
        moedaYuan = 0.7291;
    
    static DecimalFormat df = new DecimalFormat();

    private double saldo = 0.0;
    private String nomeTitular = "";
    private int agencia = 0, conta = 0;
    private static String banco = "CEF";
    
    private static Object[] moeda = {"real", "dolar", "euro", "bc", "rubro", "yene", "yuan"};

    private void init(double saldo, String nomeTitular, int agencia, int conta){
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.conta = conta;
    }

    private void Saldo(){
        JOptionPane.showMessageDialog(null, "Titular: " + this.nomeTitular + "\nSaldo: " + this.saldo);
    }

    private void extrato(){
        df.applyPattern("R$ #,###,###,##0.00");
        JOptionPane.showMessageDialog(null,
        "##############################\nbanco: " + banco + "\nagencia: " + this.agencia + "    -   conta: " + this.conta + "\n==============================\nnome: " + this.nomeTitular + "\nsaldo: " + df.format(this.saldo) + "\n##############################");
    }

    private void deposito(double dp){
        this.saldo += dp;
    }

    private void saque(double sq){
        this.saldo -= sq;
    }
    
    private void transferencia(double trans, int conta){
        if (conta == this.conta){
            saque(trans);
        }
        deposito(trans);
    }

    private double getSaldo(){
        return saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    /* por fazer o restante da função de CAMBIO
    private void cambio(double valor, String moedaO, String moedaD){
        moedaO = (String) JOptionPane.showInputDialog(null, "Moeda de Origem", "Cambio", JOptionPane.QUESTION_MESSAGE, null, moeda, "real");
        moedaD = (String) JOptionPane.showInputDialog(null, "Moeda de Destino", "Cambio", JOptionPane.QUESTION_MESSAGE, null, moeda, "real");

        switch 

    }
     */

// ----------------------------------------------------------------------------------------------------------------------
    private static void sair(){
        System.exit(0);
    }


    public static void main(String[] args){
        agencia Agencia = new agencia();
        Agencia.init(688239.56, "Fulanin de Tal", 0001, 280981);
        Agencia.extrato();
    }
}
