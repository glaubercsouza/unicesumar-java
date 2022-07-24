
package cliente;

import java.util.Scanner;

public class Juridica extends Pessoa{
    private String cnpj;

    @Override
    public void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Pessoa Jur�dica ---");
        super.cadastra();
        System.out.println("Digite o CNPJ: ");
        cnpj = tec.nextLine();
    }
    
    @Override
    public void imprime() {
        System.out.println("Pessoa Jur�dica!");
        super.imprime();
        System.out.println("Nome: " + getCnpj());
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
    
}
