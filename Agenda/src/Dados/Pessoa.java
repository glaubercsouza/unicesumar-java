package Dados;

public class Pessoa {
    private String  nome;
    private String  telefone;
    private int     idade;

    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        if(testeIdade(idade))
            this.idade = idade;
        else
            this.idade = 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
        
    public Pessoa(){
        this("","",0);
    }
        
    public Pessoa(String nom, String tel, int id)
    {
        this.setIdade(id);
        this.setTelefone(tel);
        this.setNome(nom);
    }    
    
    public Pessoa(Pessoa nova)
    {
        this(nova.getNome(), nova.getTelefone(), nova.getIdade());
    }
        
    public boolean testeIdade(int idade)
    {
        if(idade >= 0)
            return true;
        else
        return false;
    }
        
    public String mostrarDados()
    {
        String retorno = "Nome: " + this.getNome() + " Idade: " + this.getIdade() + " Telefone: "+ this.getTelefone();
        return retorno;
    }
        
}