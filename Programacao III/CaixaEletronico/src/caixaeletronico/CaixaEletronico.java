package caixaeletronico;

import cliente.Fisica;

public class CaixaEletronico {

    public static void main(String[] args) {
        Fisica f = new Fisica();
        f.cadastra();
        System.out.println(f.getNomePessoa());
    }
    
}
