
package ArraysAndCollections;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exemplo04 {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<String>();
        String s = "uva";
        listaFrutas.add("melancia");
        listaFrutas.add(s);
        listaFrutas.add("caju");
        
        String saida = "";
        saida += "Frutas da Lista: " + listaFrutas.toString();
        saida += "\nTotal de Frutas na lista: "+ listaFrutas.size();
        saida += "\nA lista possui pera? " + listaFrutas.contains("pera");
        saida += "\nA lista possui caju? " + listaFrutas.contains("caju");
        
        listaFrutas.remove("uva");
        
        saida += "\nTotal de Frutas nas lista após remover uva: " 
                + listaFrutas.size();
        saida += "\nFrutas da Lista após remover uva: "
                + listaFrutas.toString();
        saida += "\nÍndice da Fruta caju na lista: "
                + listaFrutas.indexOf("caju");
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, "Trabalhando com "
                + "ArrayList", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }
}
