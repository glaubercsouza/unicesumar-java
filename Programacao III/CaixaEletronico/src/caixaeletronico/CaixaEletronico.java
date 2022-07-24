package caixaeletronico;

import cliente.Fisica;
import cliente.Juridica;
import cliente.Pessoa;

import java.util.Scanner;

public class CaixaEletronico {

    static Pessoa p[] = new Pessoa[10];
    public static int ultimo = 0;
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 4) {
            System.out.println("Digite: ");
            System.out.println("1 - Cadastrar Pessoa F�sica");
            System.out.println("2 - Cadastrar Pessoa Jur�dica");
            System.out.println("3 - Imprimir Clientes");
            System.out.println("4 - Sair");
            opcao = tec.nextInt();
            tec.nextLine();
            switch (opcao) {
                case 1:
                    p[ultimo] = new Fisica();
                    break;
                case 2:
                    p[ultimo] = new Juridica();
                    break;
                case 3:
                    imprimeP();
                    break;
                case 4:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Valor Inv�lido");
                    break;
            }
            if(opcao == 1 || opcao == 2) {
                p[ultimo].cadastra();
                ultimo++;
            }
        }
    }

    private static void imprimeP() {
        for(int i = 0; i < ultimo; i++) {
            p[i].imprime();
        }
    }
    
}
