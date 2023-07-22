package objeto.pessoa.fisica;

public class PessoaFisica extends Pessoa{
    private String CPF;
    
    public PessoaFisica(){
        super();
    }
    public PessoaFisica(String nome){
        super(nome);
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF() {
        return this.CPF;
    }
}
