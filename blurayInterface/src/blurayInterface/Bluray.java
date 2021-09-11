
package blurayInterface;

import java.util.Scanner;
import java.util.Vector;


public class Bluray implements InterfaceBluRay {
    
    private Vector<ItemBluRay>listaBluray = new Vector<ItemBluRay>();

    @Override
    public void adicionarLista(ItemBluRay obj) {
        this.listaBluray.add(obj);
    }

    @Override
    public void imprimirLista() {
        System.out.println("Lista de Blu-Rays");
        for(int i = 0; i <this.listaBluray.size(); i++) {
            System.out.println();
            System.out.println("Nome do Cliente: ");
            System.out.println(this.listaBluray.get(i).getNomeCliente());
            System.out.println("Preço do Blu-Ray: ");
            System.out.println(this.listaBluray.get(i).getPreco());
        }
        System.out.println("...............");
        System.out.println();
    }
    
    public void cadastrarBluRay(ItemBluRay obj) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        obj.setNomeCliente(scan.nextLine());
        System.out.println("Valor do Blu-Ray: ");
        obj.setPreco(scan.nextDouble());
    }
    
}
