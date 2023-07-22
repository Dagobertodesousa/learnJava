package objeto.heranca;

public abstract class Imovel {
    private String endereco;
    private double area;

    public Imovel(String endereco, double area){
        this.endereco = endereco;
        this.area = area;
    }

    public void venda(){
        System.out.println("venda de imovel de area: " + area + "m²\nno endereço: " + endereco);
    }
    public void compra(){
        System.out.println("compra de imovel de area: " + area + "m²\nno endereço: " + endereco);
    }
    public void aluguel(){
        System.out.println("aluguel de imovel de area: " + area + "m²\nno endereço: " + endereco);
    }
}