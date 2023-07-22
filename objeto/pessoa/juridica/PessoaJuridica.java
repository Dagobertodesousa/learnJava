package objeto.pessoa.juridica;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    
    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String nome){
        super(nome);
    }
    
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public String getCNPJ() {
        return this.CNPJ;
    }
}