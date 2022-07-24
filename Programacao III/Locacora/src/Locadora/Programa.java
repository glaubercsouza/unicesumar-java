package Locadora;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int opcao;
        Dvd dvd = new Dvd();
        Cds cds = new Cds();
        
        while(true) {
            System.out.println();
            System.out.println("--------------------");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar DVD");
            System.out.println("2 - Emprestar DVD");
            System.out.println("3 - Devolver DVD");
            System.out.println("4 - Cadastrar CD");
            System.out.println("5 - Vender CD");
            System.out.println("6 - Imprimir CDs");
            System.out.println("Opç?o: ");
            
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();
            System.out.println("--------------------");
            if(opcao == 0) {
                System.exit(0);
            }
            switch(opcao) {
                case 1:
                    dvd.cadastrar();
                    break;
                case 2:
                    dvd.emprestar();
                    break;
                case 3:
                    dvd.devolver();
                    break;
                case 4:
                    cds.cadastrar();
                    break;
                case 5:
                    cds.vender();
                    break;
                case 6:
                    cds.imprimir();
                    break;
            }
        }
    }
}
