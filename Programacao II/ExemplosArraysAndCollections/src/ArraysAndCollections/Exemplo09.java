
package ArraysAndCollections;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exemplo09 {
    
    String saida = "";
    
    public Exemplo09() {
        Queue<Integer> queue = new LinkedList<Integer>();
        this.adicionarElemento(queue);
        saida += "\n";
        this.removerElemento(queue);
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, 
                "Trabalhando com Queues", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new Exemplo09();
    }

    private void adicionarElemento(Queue qe) {
        int elemento = 10;
        for (int i = elemento; i >= 0; i--) {
            saida += "Adicionando o elemento: " + i + " na fila\n";
            qe.add(i);
        }
    }

    private void removerElemento(Queue qe) {
        while (!qe.isEmpty()) {
            saida += "Removendo o elemento: " + qe.remove() + " da fila\n";
        }
    }
}
