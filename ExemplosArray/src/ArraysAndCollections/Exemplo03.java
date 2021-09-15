
package ArraysAndCollections;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;


public class Exemplo03 extends JApplet{
    JTextArea saidaArea;
    
    @Override
    public void init() {
        super.init();
        
        saidaArea = new JTextArea();
        Container container = getContentPane();
        container.add(saidaArea);
        
        int[][] array1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] array2 = { {1, 2}, {3}, {4, 5, 6} };
        
        saidaArea.setText("Os valores do array1 são\n");
        buildSaida(array1);
        
        saidaArea.setText("Os valores do array2 são\n");
        buildSaida(array2);
    }

    private void buildSaida(int[][] array) {
        // percorre as linhas do array com um for
        for (int linha = 0; linha <array.length; linha++) {
            //percorre as colunas da linha corrente com outro for
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                saidaArea.append(array[linha][coluna] + " ");
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
}
