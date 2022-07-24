
package cliente;

import java.util.Scanner;

public class Fisica extends Pessoa{
    private String cpf;
    
    public Fisica() {
        System.out.println("Pessoa Física");
    }
    
    public Fisica(String nome) {
        nomePessoa = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void cadastra() {
        // Leitura via teclado
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nomePessoa = tec.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = tec.nextLine();
        System.out.println("Digite o CPF: ");
        cpf = tec.nextLine();
        endereco.cadastra();
    }
        
    
}
