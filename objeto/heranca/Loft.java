package objeto.heranca;

public class Loft extends Imovel{

    public Loft(String endereco, double area){
        super(endereco, area);
    }

    public void venda(){
        super.venda();
    }
    
    public void compra(){
        super.compra();
    }
}
