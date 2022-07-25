package desenvolvimento;

import java.util.Scanner;

public class Convenio {
    private int codigo;
    private String nome;
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastrar() {
        Scanner cad = new Scanner(System.in);
        System.out.print("Convênio: ");
        this.setNome(cad.nextLine());
    }
    
    public void imprimirConvenio() {
        System.out.println("Convênio: " + this.getNome());
    }
}
