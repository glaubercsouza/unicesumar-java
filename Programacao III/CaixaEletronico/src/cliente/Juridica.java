
package cliente;

import java.util.Scanner;

public class Juridica extends Pessoa{
    private String cnpj;

    @Override
    public void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("--- Cadastro de Pessoa Jurídica ---");
        super.cadastra();
        System.out.println("Digite o CNPJ: ");
        cnpj = tec.nextLine();
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
    
}
