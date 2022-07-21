package Principal;

import Dados.Pessoa;

public class Inicio {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        Pessoa pes2 = new Pessoa("João", "(11) 0980-0980", 13);
        pes.setNome("Fulano");
        pes.setIdade(22);
        pes.setTelefone("(00) 7654-3210");
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados());
        if (pes.getIdade() > pes2.getIdade()){
            System.out.println(pes.getNome());
        }else{
            System.out.println(pes2.getNome());
        }
    }
}
