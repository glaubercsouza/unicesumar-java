package animal;

import java.util.Scanner;

public class AnimalPrincipal {
    Animal vetAni[] = new Animal[30];
    static int tam = 0;
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        AnimalPrincipal ap = new AnimalPrincipal();
        
        while(opcao != 3) {
            System.out.println("Digite a op�?o desejada: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Sair");
            
            opcao = scan.nextInt();
            scan.nextLine();
            switch(opcao) {
                case 1:
                    ap.cadastrarAnimal();
                    break;
                case 2:
                    ap.imprimeAnimais();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Op�?o Inv�lida");
                    break;
            }
        }
    }

    private void cadastrarAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de animal: ");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Cavalo");
        System.out.println("3 - Pregui�a");
        int i = scan.nextInt();
        scan.nextLine();
        if(i == 1 || i == 3 || i == 2) {
            System.out.println("Digite o nome do animal");
            String n = scan.nextLine();
            System.out.println("Digite a idade do animal");
            int id = scan.nextInt();
            scan.nextLine();
            if(i == 1) {
                vetAni[tam] = new Cachorro(n, id);
            } else if(i == 2) {
                vetAni[tam] = new Cavalo(n, id);
            } else if(i == 3) {
                vetAni[tam] = new Preguica(n, id);
            }
        }
    }

    private void imprimeAnimais() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            System.out.println("C�digo do Animal: " + i);
            vetAni[i].seLocomove();
        }
        System.out.println("Digite o c�digo do animal que deseja ver");
        int cod = scan.nextInt();
        scan.nextLine();
        vetAni[cod].seLocomove();
        vetAni[cod].emiteSom();
    }
}
