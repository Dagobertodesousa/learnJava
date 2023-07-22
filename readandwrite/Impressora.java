package readandwrite;

import java.io.Serializable;

public class Impressora implements Serializable{
    private boolean paper = false;
    private int pagina;
    private String marca, modelo, tipo, info = "";

    public Impressora(){
        this.marca = null;
        this.tipo = null;
        this.pagina = 0;
    }
    public Impressora(String marca,String tipo, String info){
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = null;
        this.info = info;
    }
    public Impressora(String marca, String modelo, String tipo, int pagina){
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.pagina = pagina;
    }

    public void setPagina(int pagina){
        this.pagina = pagina;
    }
    public int getPagina(){
        return pagina;
    }
    public void scannear(Object doc){
        System.out.print(doc);
    }
    public void copiar(String doc){
        System.out.print(doc);
    }
    public void imprimir(String doc){
        System.out.print(doc);
    }
    public boolean AmbosLados(){
        return true;
    }
    public String detectarPapel(boolean paper){
        
        return "Papel: "+ paper;
    }
    public void settingsInfo(String folha){
        this.info = info + "marca: " + this.marca + "\nmodelo: " + this.modelo + "\ntipo: " + this.tipo + "\nsuporta folha tipo: " + folha;
    }
    public String gettingsInfo(){
        return "marca: " + this.marca + "\nmodelo: " + this.modelo + "\ntipo: " + this.tipo;
    }
    public boolean pushPaper(){
        this.paper = true;
        return this.paper;
    }
    public boolean putPaper(){
        this.paper = false;
        return this.paper;
    }
}