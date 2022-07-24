package Classes;

import Interfaces.ElementoDiagrama;

public class Retangulo implements ElementoDiagrama {

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Retângulo");
    }

    @Override
    public void redesenhar() {
        System.out.println("Redesenhando um Retângulo");
    }
    
}
