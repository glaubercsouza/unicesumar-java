/*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
*/
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
        this.setIdade(0);
        this.setNome("");
        this.setTelefone("");
    }
        
    public Pessoa(String nom, String tel, int id)
    {
        this.setIdade(id);
        this.setTelefone(tel);
        this.setNome(nom);
    }    
        
    public boolean testeIdade(int idade)
    {
        if(idade >= 0)
            return true;
        else
        return false;
    }
        
    public String mostrarDados(){
        String retorno = "Nome: " + nome + " Idade: " + idade + " Telefone: "+ telefone;
        return retorno;
    }
        
    public Pessoa(Pessoa nova)
    {
        this.nome = nova.nome;
        this.idade = nova.idade;
        this.telefone = nova.telefone;
    }
}