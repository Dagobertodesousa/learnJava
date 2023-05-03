import java.util.Scanner;
import javax.swing.JOptionPane;

class casa
{
    double area, perimetro;
    String rua, telhado, lerGrafico;
    boolean porta, portao, janela;
    int numero;
    Object[] figure = {"quadrado", "retangulo", "triangulo", "circulo", "lozango", "elipse", "trapezio"};
    
    Scanner lerTexto = new Scanner(System.in);

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
    void seletorFigura(){
        String seletor = (String) JOptionPane.showInputDialog(
            null,
            "Selecione a figura geometrica:",
            "Seletor",
            JOptionPane.PLAIN_MESSAGE,
            null,
            figure,
            "circulo");

        switch (seletor){
            case "quadrado":
                JOptionPane.showMessageDialog(null, "Area do quadrado é dada por Base x Altura");
                break;
            case "retangulo":
                JOptionPane.showMessageDialog(null, "Area do retangulo é dada por Base x Altura");
                break;
            case "triangulo":
                JOptionPane.showMessageDialog(null, "Area do triangulo é dada por Base x Altura dividido por 2");
                break;
            case "lozango":
                JOptionPane.showMessageDialog(null, "Area do lozango é dada por Base x Altura");
                break;
            case "circulo":
                JOptionPane.showMessageDialog(null, "Area do circulo é dada por pi x raio²");
                break;
            case "trapezio":
                JOptionPane.showMessageDialog(null, "Area do trapezio é dada por Base menor + Base maior x Altura dividido por 2");
                break;
            case "elipse":
                JOptionPane.showMessageDialog(null, "Area da elipse só pode ser dada por Deus");
                break;
        }
    }
// ------------------------------------------------------------
    void imprimirGrafico(){
        JOptionPane.showMessageDialog(null, "a casa de numero: " + numero + " logradouro: " + rua + " de area: " + area + "m² e perimetro: " + perimetro + "m com telhado, tipo: " + telhado + " porta " + porta + " e portão " + portao + " e janela " + janela);
    }
}