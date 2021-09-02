/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecliente;

/**
 *
 * @author User
 */
public class Cliente {
    // criamos aqui um construtor vazio para a classe
    public Cliente(){
    }
    // criamos aqui atributos normais de uma classe cliente
    int     codigo;
    String  nome;
    String  cpf;
    String  endereco;
    // criamos aqui outro construtor passando valores de entrada para
    // inicializar os atributos
    public Cliente(int codigo, String nome, String cpf, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}
