package BluRayInterface;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Bluray objBluray = new Bluray();
        ItemBluRay objItem;
        while(true) {
            objItem = new ItemBluRay();
            System.out.println("1 - Cadastrar BluRay");
            System.out.println("2 - Imprimir lista de BluRay");
            System.out.println("3 - Cadastrar BluRay com Desconto");
            System.out.println("4 - Fim");
            System.out.println("Entre com a opç?o desejada: ");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            if(opcao == 4) {
                break;
            }
            switch(opcao) {
                case 1:
                    objBluray.cadastrarBluRay(objItem);
                    objBluray.adicionarLista(objItem);
                    break;
                case 2:
                    objBluray.imprimirLista();
                    break;
                case 3:
                    objBluray.cadastrarBluRay(objItem);
                    System.out.println("Valor do BluRay com promoç?o de: " + InterfaceBluRay.PROMOCAO);
                    double valorDesconto = objItem.getPreco() - (objItem.getPreco() * InterfaceBluRay.PROMOCAO) / 100;
                    objItem.setPreco(valorDesconto);
                    objBluray.adicionarLista(objItem);
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("Opç?o Inválida");
                    break;
            }
        }
    }
}
