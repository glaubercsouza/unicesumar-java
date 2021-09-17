
package ArraysAndCollections;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exemplo08 {
    private static String[] nomes = {"João", "José", "Pedro", "Carlos", 
        "Jaqueline", "Matheus", "Marcelo"};
    
    public Exemplo08() {
        HashMap map = new HashMap();
        Integer i;
        
        for (int j = 0; j < nomes.length; j++) {
            i = (Integer) map.get(new Character(nomes[j].charAt(0)));
            
            if(i == null) {
                map.put(new Character(nomes[j].charAt(0)), new Integer(1));
            } else {
                map.put(new Character(nomes[j].charAt(0)), new Integer(i.intValue() + 1));
            }
        }
        
        this.geraSaidaMap(map);
    }

    private void geraSaidaMap(Map mapRef) {
        String saida = "";
        saida += "Número de palavras iniciadas com a letra: ";
        saida += "\n" + mapRef.toString();
        saida += "\nQuantidade de valores do Map: " + mapRef.size();
        saida += "\né vazio?: " + mapRef.isEmpty();
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, "Trabalhando com Maps", 
                JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new Exemplo08();
    }
}
