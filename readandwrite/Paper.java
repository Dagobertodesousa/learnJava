package readandwrite;

import java.lang.Exception;
import java.io.*;

public class Paper extends Impressora{
    private double dimensaoL, dimensaoA;
    private String tipo, formato;

    public Paper(){
        this.dimensaoA = 0.0;
        this.dimensaoL = 0.0;
        this.formato = null;
    }

    public Paper(String formato){
        this.dimensaoA = 0.0;
        this.dimensaoL = 0.0;
        this.formato = formato;
    }
    public Paper(String formato, double dimensaoL, double dimensaoA){
        this.dimensaoA = dimensaoA;
        this.dimensaoL = dimensaoL;
        this.formato = formato;
    }
    public Paper(String formato, String tipo, double dimensaoL, double dimensaoA){
        this.dimensaoA = dimensaoA;
        this.dimensaoL = dimensaoL;
        this.formato = formato;
        this.tipo = tipo;
    }

    public String gravarPaper(){
        String ret = "Sucessfully";
        try {
            FileOutputStream arquivo = new FileOutputStream("c:/Users/Shao-khan/Documents/project/java/readandwrite/arquivo"+this.getPagina(), true);
            ObjectOutputStream stream = new ObjectOutputStream(arquivo);
            stream.writeObject(this);
            stream.flush();
        } catch (Exception erro) {
            ret = "erro observado: " + erro.toString();
        } finally {
            System.out.print("tranquilo");
        }
        return ret;
    }
    public static Impressora ler(int page){
        try {
            FileInputStream arquivo = new FileInputStream("c:/Users/Shao-khan/Documents/project/java/readandwrite/arquivo"+page);
            ObjectInputStream stream = new ObjectInputStream(arquivo);
            return ((Impressora) stream.readObject());
        } catch (Exception erro) {
            System.out.println("Error: " + erro.toString());
            return null;
        }
    }
    public void carregarInfo(){
        System.out.println(
            "tipo de papel: " + this.tipo +
            "\nFormato: " + this.formato +
            "\n largura: " + this.dimensaoL +
            "mm - altura: " + this.dimensaoA + "mm");
    }
}