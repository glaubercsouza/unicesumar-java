
package ArraysAndCollections;

import javax.swing.*;


public class Exemplo02 {
    public static void main(String[] args) {
        // cria um array com 6 elementos
        int[] array = {10, 15, 25, 3, 8, 7};
        int total = 0;
        String saida = "Índice\tValor\n";
        
        // adicionando o valor de cada elemento do Array na variável saída
        for(int i = 0; i < array.length; i++) {
            total += array[i];
            saida += i + "\t" + array[i] + "\n";
        }
        saida += "\n\nA soma dos elementos do array é: " + total;
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, 
                "Criando um Array de Inteiros", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
}
