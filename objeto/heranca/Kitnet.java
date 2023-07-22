package objeto.heranca;

public class Kitnet extends Imovel{
    private int comodo;
    private static String tipo = "kitnet";

    public Kitnet(String endereco, double area, int comodo){
        super(endereco, area);
        this.comodo = comodo;
    }
    
    public void venda(){
        super.venda();
        System.out.print(" " + comodo + " comodos: ");
    }
    
    public void aluguel(){
        super.aluguel();
        System.out.print(" " + comodo + " comodos: ");
    }
    
    public void ceder(){
        System.out.println(tipo + " que possue " + this.comodo + " comodos sendo cedida");
    }
}
