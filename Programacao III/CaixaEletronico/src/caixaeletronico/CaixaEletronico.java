package caixaeletronico;

import cliente.Fisica;

public class CaixaEletronico {

    public static void main(String[] args) {
        Fisica f = new Fisica();
        Fisica f2 = new Fisica("Joaquim");
        System.out.println(f2.getNomePessoa());
    }
    
}
