package cliente;

import java.util.Scanner;

public abstract class Pessoa {
    protected String nomePessoa;
    protected Endereco e = new Endereco();
    protected String telefone;
    public void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nomePessoa = tec.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = tec.nextLine();
        e.cadastra();
    }
    
    public String getNomePessoa() {
        return this.nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public Endereco getEndereco() {
        return this.e;
    }
    
    public void setEndereco(Endereco endereco) {
        this.e = endereco;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
