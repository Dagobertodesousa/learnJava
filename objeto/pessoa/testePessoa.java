package objeto.pessoa;

import objeto.pessoa.fisica.f.Funcionario;
import objeto.pessoa.juridica.j.Empresa;

public class testePessoa {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        Empresa e = new Empresa();
        try{
            f.setCPF("000.223.188-56");
            f.setCartao("5657-8");

            e.setCNPJ("3529.0009/000.1");
            e.setRazaoSocial("Empresa de Fachada S.A.");

            System.out.println(f.getCPF()+"\n"+f.getCartao());
            System.out.println(e.getCNPJ()+"\n"+e.getRazaoSocial());
        } catch (Exception erro){
            System.out.println("erro: " + erro);
        } finally {
            System.out.println("fim");
        }
    }
}
