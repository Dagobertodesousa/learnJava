package objeto.pessoa.juridica.j;

import objeto.pessoa.juridica.PessoaJuridica;

public class Empresa extends PessoaJuridica{
    public String razaoSocial;
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
}
