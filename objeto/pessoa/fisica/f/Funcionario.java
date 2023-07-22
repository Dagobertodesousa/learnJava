package objeto.pessoa.fisica.f;

import objeto.pessoa.fisica.PessoaFisica;

public class Funcionario extends PessoaFisica{
    private String cartao;

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public String getCartao() {
        return this.cartao;
    }
}