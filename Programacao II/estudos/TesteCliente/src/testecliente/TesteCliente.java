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
import javax.swing.JOptionPane;

public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // criamos aqui os atributos a serem lidos referente ao cliente 1 e 
        // cliente 2
        int codigo;
        String nome;
        String cpf;
        String endereco;
        // aqui lemos os valores dos atributos pelo usuário referente ao
        // primeiro cliente
        codigo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do primeiro cliente: "));
        nome = JOptionPane.showInputDialog("Digite o nome do primeiro cliente: ");
        cpf = JOptionPane.showInputDialog("Digite o CPF do primeiro cliente: ");
        endereco = JOptionPane.showInputDialog("Digite o endereço do primeiro cliente: ");
        // criamos um objeto do tipo cliente e usamos um construtor vazio, 
        // passamos os valores para os atributos depois dele instanciado
        Cliente cl = new Cliente();
        cl.codigo = codigo;
        cl.nome = nome;
        cl.cpf = cpf;
        cl.endereco = endereco;
        // aqui lemos os valores dos atributos pelo usuario referente ao segundo
        // cliente
        codigo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do segundo cliente: "));
        nome = JOptionPane.showInputDialog("Digite o nome do segundo cliente: ");
        cpf = JOptionPane.showInputDialog("Digite o CPF do segundo cliente: ");
        endereco = JOptionPane.showInputDialog("Digite o endereço do segundo cliente: ");
        // aqui então instanciamos o objeto passando para o construtor os valores
        // dos atributos já neste momento
        Cliente c2 = new Cliente();

    }

}
