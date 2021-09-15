
package ArraysAndCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Exemplo07 {
    String saida = "";
    private String[] cores = {"vermelho", "branco", "azul", "verde", "cinza", 
        "laranja", "bronzeado", "branco", "ciano", "pêssego", "cinza", 
        "laranja"};
    
    public static void main(String[] args) {
        new Exemplo07();
    }
    
    public Exemplo07() {
        TreeSet tree = new TreeSet(Arrays.asList(cores));
        
        saida += "\nSet de elementos não duplicados e ordenados: \n";
        this.mostrarSet(tree);
        
        saida += "\nSubconjunto de TreeSet menor que 'laranja': ";
        this.mostrarSet(tree.headSet("laranja"));
        
        saida += "\n\nSubconjunto de TreeSet maior que ou igual a 'laranja': ";
        this.mostrarSet(tree.tailSet("laranja"));
        
        saida += "\n\nPrimeiro elemento de set: "
                + tree.first();
        saida += "\nÚltimo elemento de set: "
                + tree.last();
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, "Trabalhando com Sets", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }

    private void mostrarSet(SortedSet ss) {
        Iterator iterator = ss.iterator();
        
        while(iterator.hasNext()) {
            saida += iterator.next() + " ";
        }
        
    }
}
