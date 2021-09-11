
package blurayInterface;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Bluray objBluray = new Bluray();
        ItemBluRay objItem;
        while(true){
            objItem = new ItemBluRay();
            System.out.println("1 - Cadastrar Blu-Ray");
            System.out.println("2 - Imprimir lista de Blu-Ray");
            System.out.println("3 - Cadastrar Blu-Ray com desconto");
            System.out.println("4 - Fim");
            System.out.println("Entre com a opção desejada: ");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            if (opcao == 4) {
                break;
            }
            switch (opcao) {
                case 1:
                    objBluray.cadastrarBluRay(objItem);
                    objBluray.adicionarLista(objItem);
                    break;
                case 2:
                    objBluray.imprimirLista();
                    break;
                case 3:
                    objBluray.cadastrarBluRay(objItem);
                    System.out.println("Valor do Blu-Ray com promoção de: ");
                    double valorDesconto = 
                            objItem.getPreco() - (objItem.getPreco() * 
                            InterfaceBluRay.PROMOCAO)/ 100;
                    objItem.setPreco(valorDesconto);
                    objBluray.adicionarLista(objItem);
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
