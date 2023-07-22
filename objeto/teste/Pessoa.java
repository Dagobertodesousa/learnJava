package objeto.teste;

abstract class Pessoa{
    private String nome;
    private int rg;
/*------------------------------------------------------------------------------
------------------------------ Construtor da classe ----------------------------
  ------------------------------------------------------------------------------*/
    public Pessoa(){
        this.nome = null;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, int rg){
        this.nome = nome;
        this.rg = rg;
    }
// ------------------------------------------------------------------------------
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
// ------------------------------------------------------------------------------
    public void setRg(int rg){
        this.rg = rg;
    }
    public int getRg(){
        return rg;
    }
}

class Fisica extends Pessoa{
    private String CPF;
/*------------------------------------------------------------------------------
 ----------------------------- Construtor da classe ----------------------------
  ------------------------------------------------------------------------------*/
    public Fisica(){
        super();
    }
    public Fisica(String nome){
        super(nome);
    }
    public Fisica(String nome, int inscricao){
        super(nome, inscricao);
    }
// ------------------------------------------------------------------------------
    public String getCPF(){
        return CPF;
    }
}

class Juridica extends Pessoa{
    private String CNPJ;

/*------------------------------------------------------------------------------
 ----------------------------- Construtor da classe ----------------------------
  ------------------------------------------------------------------------------*/
    public Juridica(){
        super();
    }
    public Juridica(String nome){
        super(nome);
    }
    public Juridica(String nome, int matricula){
        super(nome, matricula);
    }
// ------------------------------------------------------------------------------
    public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
// ------------------------------------------------------------------------------
    public String getCNPJ(){
        return CNPJ;
    }
}

class mainly{
    public static void main(String[] args) {
        Pessoa rodrigo = new Fisica("Rodrigo");
        Pessoa sabrina = new Fisica("sabrina", 78859839);
        Pessoa cmaya = new Juridica("Construtora Maya");
        Juridica jupi = new Juridica("jupi farinha", 8889);

        System.out.println(rodrigo.getClass());
        rodrigo.setRg(78304);
        System.out.println(rodrigo.getRg());
        System.out.println(cmaya.getClass());
        sabrina.setNome("Sabrina Camila");
        System.out.println(sabrina.getNome());
        jupi.setCNPJ("740394/000.1");
        System.out.println(jupi.getCNPJ());
    }
}