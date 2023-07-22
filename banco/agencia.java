package banco;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class agencia {
    private DecimalFormat df = new DecimalFormat("#,###.00");
    private double saldo = 0.0;
    private String nomeTitular = "";
    private int agencia = 0, conta = 0;
    private static String banco = "CEF";
    
    private static String[] moeda = {"real", "dolar", "euro", "bc", "rubro", "yene", "yuan"};

    private void init(double saldo, String nomeTitular, int agencia, int conta){
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.conta = conta;
    }

    private void saldo(double saldo){
        JOptionPane.showMessageDialog(null, "Titular: " + this.nomeTitular + "\nSaldo: " + saldo);
    }

    private void extrato(){
        df.applyPattern("R$ #,###.00");
        JOptionPane.showMessageDialog(null,
        "##############################\nbanco: " + banco + "\nagencia: " + this.agencia + "    -   conta: " + this.conta + "\n==============================\nnome: " + this.nomeTitular + "\nsaldo: " + df.format(this.saldo) + "\n##############################");
    }

    private void deposito(double dp){
        this.saldo += dp;
        saldo(this.saldo);
    }
    private void deposito(double dp, int conta){
        this.saldo += dp;
        saldo(this.saldo);
    }

    private void saque(double sq){
        this.saldo -= sq;
        saldo(this.saldo);
    }
    private void saque(double sq, int conta){
        if (this.conta != conta){
            this.saldo -= sq;
            saldo(this.saldo);
        }
    }
    
    private void transferencia(double trans, int conta){
        saque(trans);
        deposito(trans);
        saldo(this.saldo);
    }

    private double getSaldo(){
        return saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
// ----------------------------------------------------------------------------------------------------------------------
    private static void sair(){
        System.exit(0);
    }


    public static void main(String[] args){
        agencia Agencia1 = new agencia();
        agencia Agencia2 = new agencia();
        Agencia1.init(688239.56, "Fulanin de Tal", 0001, 280981);
        Agencia1.extrato();
        Agencia2.init(58523.63, "Sicrano Lima", 1, 233985);
        Agencia2.transferencia(6000, Agencia2.conta);
        Agencia2.extrato();
        sair();
    }
}
