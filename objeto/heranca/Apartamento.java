package objeto.heranca;

public class Apartamento extends Residencia{
    private String endereco;
    private double area;
    private int piso;
    private boolean sacada;

    public Apartamento(String endereco, double area, int piso, boolean sacada){
        super(endereco, area);
        this.piso = piso;
        this.sacada = sacada;
    }
    
    public void venda(){
        super.venda();
    }

    public void aluguel(){
        super.aluguel();
    }

    public void compra(){
        super.compra();
    }

    public void expor(){
        System.out.print("Piso: " + piso + "\nSacada: " + sacada + "\nendereço: " + endereco + "\narea: " + area);
    }
}
