package cliente;

public abstract class Pessoa {
    protected String nomePessoa;
    protected Endereco endereco = new Endereco();
    protected String telefone;
    public abstract void cadastra();
    
    public Pessoa() {
     super();
        System.out.println("Executando o construtor de Pessoa");
    }    
    
    public String getNomePessoa() {
        return this.nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
