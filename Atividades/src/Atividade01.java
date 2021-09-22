
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Atividade01 {

    public static void main(String[] args) {
        ArrayList<Integer> minhaLista = new ArrayList();
        minhaLista.add(10);
        minhaLista.add(5);
        minhaLista.add(5);
        minhaLista.add(1);
        HashSet<Integer> meuConjunto = new HashSet(minhaLista);
        int valor1 = 0;
        for (int ind = 0; ind < minhaLista.size(); ind++) {
            valor1 += minhaLista.get(ind);
        }
        int valor2 = 0;
        Iterator<Integer> iterator = meuConjunto.iterator();
        while (iterator.hasNext()) {
            valor2 += iterator.next();
        }
        System.out.println(valor1 + "," + valor2);
    }
}
