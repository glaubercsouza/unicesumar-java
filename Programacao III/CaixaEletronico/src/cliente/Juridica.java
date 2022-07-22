
package cliente;

import java.util.Scanner;

public class Juridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void cadastra() {
        // Leitura via teclado
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nomePessoa = tec.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = tec.nextLine();
        System.out.println("Digite o CNPF: ");
        cnpj = tec.nextLine();
        endereco.cadastra();
    }
    
    
}
