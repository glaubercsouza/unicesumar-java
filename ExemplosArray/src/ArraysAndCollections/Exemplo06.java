
package ArraysAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exemplo06 {
    String saida = "";
    private String[] cores = {"vermelho", "branco", "azul", "verde", "cinza", 
    "laranja", "bronzeado", "branco", "ciano", "pêssego", "cinza", "larania"};
    
    public static void main(String[] args) {
        new Exemplo06();
    }
    
    public Exemplo06() {
        List lista;
        
        lista = new ArrayList(Arrays.asList(cores));
        saida += "Lista com elementos duplicados: ";
        saida += "\n" + lista;
        
        this.gerarListaNaoDuplicada(lista);
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, "Trabalhando com Sets", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void gerarListaNaoDuplicada(Collection collection) {
        Set set = new HashSet(collection);
        Iterator iterator = set.iterator();
        
        saida += "\nLista com elementos não duplicados\n";
        
        while(iterator.hasNext()) {
            saida += iterator.next() + " ";
        }
    }
}
