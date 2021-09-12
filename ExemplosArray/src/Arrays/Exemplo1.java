
package Arrays;

import javax.swing.*;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] array; // declara referência para um array
        array = new int[10]; // cria um array com 10 elementos
        String saida = "Índice\tValor\n";
        
        // adicionando o valor de cada elemento do Array na variável saída 
        for (int i = 0; i < array.length; i++) {
            saida += i + "\t" + array[i] + "\n";
        }
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, 
                "Criando um Array de Inteiros", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
