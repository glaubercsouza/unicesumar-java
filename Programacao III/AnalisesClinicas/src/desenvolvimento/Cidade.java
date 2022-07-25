package desenvolvimento;

import java.util.Scanner;

public class Cidade {
    private String nome, ddd;
    private Uf uf = new uf();
    
    public String getDdd() {
        return this.ddd;
    }
    
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Uf getUf() {
        return this.uf;
    }
    
    public void setUf(Uf uf) {
        this.uf = uf;
    }
    
    public void cadastrar() {
        Scanner tec = new Scanner(System.in);
        System.out.print("Cidade: ");
        this.setNome(tec.nextLine());
        System.out.print("DDD: ");
        this.setDdd(tec.nextLine());
        uf.cadastra();
    }
    
    public void imprimirCidade() {
        System.out.println("Cidade: " + this.getNome());
        System.out.println("DDD: " + this.getDdd());
        uf.imprimir();
    }
}
