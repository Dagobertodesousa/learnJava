package geometria;
import java.lang.NumberFormatException;
import java.sql.Date;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

class calcgeom{
    
    Date data = new Date(0);
    Object[] forma = {"quadrado", "retangulo", "triangulo", "circulo", "lozango", "elipse", 0, "trapezio"};

    void seletorFigura(){
        try {
            String seletor = (String) JOptionPane.showInputDialog(
                null,
                "Selecione a figura geometrica:",
                "Seletor de Forma",
                JOptionPane.PLAIN_MESSAGE,
                null,
                forma,
                "circulo");
            String texto = JOptionPane.showInputDialog(null, "Inserir qualquer texto: ");
            
            FileWriter file = new FileWriter( "C:/Users/Shao-Khan/Documents/project/java/log_trab.txt", true);
            PrintWriter out = new PrintWriter(file);

            Thread.sleep(3000);
            
            out.println("======================================\n"+ texto +"\npeça de trabalho " + seletor + "\n======================================\ndata: " + data.toLocalDate() + "\n======================================\n\n");
            file.close();
            out.close();

            JOptionPane.showMessageDialog(null, "mensagem inserida no arquivo");

            switch (seletor){
                case "quadrado":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com quadrado");
                    break;
                case "retangulo":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com retangulo");
                    break;
                case "triangulo":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com triangulo");
                    break;
                case "lozango":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com lozango");
                    break;
                case "circulo":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com circulo");
                    break;
                case "trapezio":
                    JOptionPane.showMessageDialog(null, "Vamos trabalhar com trapezio");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "nenhuma das opções foi encontrada");
            }
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "erro encontrado durante a execução: " + erro);
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "erro de pasta " + erro);
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro de IO:" + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
            erro.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "fim");
        }
    }
}
