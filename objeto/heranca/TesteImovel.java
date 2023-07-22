package objeto.heranca;

public class TesteImovel {
    
    public static void main(String[] args) {
        Imovel residencia = new Residencia("rua das filos", 156.82);
        Kitnet kitnet = new Kitnet("rua domingos campos", 42.18, 2);
        Apartamento apartamento = new Apartamento("avenida movimentada", 72.25, 2, true);
        Imovel loft = new Loft("Travessa palmeirais", 830);

        try {
            kitnet.venda();
            kitnet.aluguel();
            kitnet.ceder();

            Thread.sleep(1000);
            
            apartamento.aluguel();
            apartamento.venda();
            apartamento.compra();
            apartamento.expor();

            Thread.sleep(1000);

            residencia.aluguel();
            residencia.venda();
            
            Thread.sleep(1000);

            loft.aluguel();
            loft.compra();
            loft.venda();

        } catch (InterruptedException erro){
            System.out.println("erro: " + erro);
        } catch (Exception erro){
            System.out.println("erro: " + erro);
        } finally {
            System.out.println("fim");
        }
    }
}
