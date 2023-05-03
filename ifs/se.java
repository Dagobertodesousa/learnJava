package ifs;
import java.util.Scanner;
import javax.swing.JOptionPane;

class se {

        Scanner inputSc = new Scanner(System.in);
        String Input;
        int v1,v2;
        Object ob[] = {"Grafico", "Texto"};
        
        void comecar(){
            Input = (String) JOptionPane.showInputDialog(null, "Escolha o modo de apresentação:", "Interface", JOptionPane.QUESTION_MESSAGE, null, ob, "Texto");

            if (Input == "Texto"){
                    modoTexto();
            } else
            if (Input == "Grafico"){
                    modoGrafico();
            } else {
                JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        }
        void modoTexto(){
            System.out.print("primeiro valor: ");
            v1 = inputSc.nextInt();
            
            System.out.print("segundo valor: ");
            v2 = inputSc.nextInt();
            
            System.out.printf("A soma do primeiro valor com o segundo valor: " + (v1+v2));
        }

        void modoGrafico(){
            
            Input = JOptionPane.showInputDialog("primeiro valor:");
            v1 = Integer.parseInt(Input);

            Input = JOptionPane.showInputDialog("segundo valor:");
            v2 = Integer.parseInt(Input);

            JOptionPane.showMessageDialog(null, "A soma da primeira valor com a segunda valor: "+(v1+v2));
        }
    }
