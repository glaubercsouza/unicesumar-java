package Classes;

import Interfaces.ElementoDiagrama;

public class Circulo implements ElementoDiagrama {

    @Override
    public void desenhar() {
        System.out.println("Desenhando um C�rculo");
    }

    @Override
    public void redesenhar() {
        System.out.println("Redesenhando um C�rculo");
    }
    
}
