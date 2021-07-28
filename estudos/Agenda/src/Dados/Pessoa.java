/*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
*/
package Dados;


public class Pessoa {
    String  nome;
    String  telefone;
    int     idade;
    
        public Pessoa(){
        idade = 0;
        nome = "";
        telefone = "";
    }
        
        public Pessoa(String nom, String tel, int id)
        {
            nome = nom;
            telefone = tel;
            idade = id;
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
}