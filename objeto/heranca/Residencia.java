package objeto.heranca;

public class Residencia extends Imovel{

    public Residencia(String endereco, double area){
        super(endereco, area);
    }

    public void venda(){
        super.venda();
    }
    
    public void aluguel(){
        super.compra();
    }

    public void compra(){
        super.compra();
    }
}
