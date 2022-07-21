package conversoesimplicitas;

import javax.swing.JOptionPane;

public class TestaConversaoImplicita {

    
    public static void main(String[] args) {
       ConversaoImplicita c1 = new ConversaoImplicita();
           JOptionPane.showMessageDialog(null, "Quadrado de 3 = " + c1.retornaQuadradoNumero(3));
           JOptionPane.showMessageDialog(null, "Quadrado de 3 = " + c1.retornaQuadradoNumero('3'));
    }
    
}
