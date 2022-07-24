
package cliente;

import java.util.Scanner;

public class Fisica extends Pessoa{
    private String cpf;
    
    // Sobrescrita do método cadastra
    @Override
    public void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Pessoa Física ---");
        super.cadastra();
        System.out.println("Digite o CPF: ");
        cpf = tec.nextLine();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
}
