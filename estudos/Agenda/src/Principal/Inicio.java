package Principal;

import Dados.Pessoa;

public class Inicio {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        Pessoa pes2 = new Pessoa("João", "(11) 0980-0980", 13);
        pes.nome = "Fulano";
        pes.idade = 22;
        pes.telefone = "(00) 7654-3210";
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados());
    }
}
