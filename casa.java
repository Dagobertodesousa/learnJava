import java.util.Scanner;
import javax.swing.JOptionPane;

class casa
{
    double area, perimetro;
    String rua, telhado;
    boolean porta, portao, janela;
    int numero;
    
    Scanner lerTexto = new Scanner(System.in);
    String lerGrafico;

    // modo de entrada de dados por texto - console -

    void alterAreaTexto(){
        System.out.print("area: ");
        area = lerTexto.nextDouble();
    }
    void alterPerimetroTexto(){
        System.out.print("perimetro: ");
        perimetro = lerTexto.nextDouble();
    }
    void alterTelhadoTexto(){
        System.out.print("telhado: ");
        telhado = lerTexto.next();
    }
    void alterPortaTexto(){
        System.out.print("porta: ");
        porta = lerTexto.nextBoolean();
    }
    void alterPortaoTexto(){
        System.out.print("portão: ");
        portao = lerTexto.nextBoolean();
    }
    void alterRuaTexto(){
        System.out.print("rua: ");
        rua = lerTexto.next();
    }
    void alterJanelaTexto(){
        System.out.print("janela: ");
        janela = lerTexto.nextBoolean();
    }
    void alterNumeroTexto(){
        System.out.print("numero: ");
        numero = lerTexto.nextInt();
    }

// ------------------------------------------------------------
void imprimirTexto(){
    System.out.println("a casa de numero: " + numero + " logradouro: " + rua + " de area: " + area + "m² e perimetro: " + perimetro + "m com telhado, tipo: " + telhado + " porta " + porta + " e portão " + portao + " e janela " + janela);
}
    // modo de entrada de dados grafico - menu flutuante - 

    
    void alterAreaGrafico(){
        lerGrafico = JOptionPane.showInputDialog("area: ");
        area = Double.parseDouble(lerGrafico);
    }
    void alterPerimetroGrafico(){
        lerGrafico = JOptionPane.showInputDialog("perimetro: ");
        perimetro = Double.parseDouble(lerGrafico);
    }
    void alterTelhadoGrafico(){
        lerGrafico = JOptionPane.showInputDialog("telhado: ");
        telhado = String.valueOf(lerGrafico);
    }
    void alterPortaGrafico(){
        lerGrafico = JOptionPane.showInputDialog("porta: ");
        porta = Boolean.parseBoolean(lerGrafico);
    }
    void alterPortaoGrafico(){
        lerGrafico = JOptionPane.showInputDialog("portão: ");
        portao = Boolean.parseBoolean(lerGrafico);
    }
    void alterRuaGrafico(){
        lerGrafico = JOptionPane.showInputDialog("rua: ");
        rua = String.valueOf(lerGrafico);
    }
    void alterJanelaGrafico(){
        lerGrafico = JOptionPane.showInputDialog("janela: ");
        janela = Boolean.parseBoolean(lerGrafico);
    }
    void alterNumeroGrafico(){
        lerGrafico = JOptionPane.showInputDialog("numero: ");
        numero = Integer.parseInt(lerGrafico);
    }

// ------------------------------------------------------------
    void imprimirGrafico(){
        JOptionPane.showMessageDialog(null, "a casa de numero: " + numero + " logradouro: " + rua + " de area: " + area + "m² e perimetro: " + perimetro + "m com telhado, tipo: " + telhado + " porta " + porta + " e portão " + portao + " e janela " + janela);
    }
}