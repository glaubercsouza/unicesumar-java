package Programa;

import Classes.Circulo;
import Classes.Retangulo;

public class Principal {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Circulo cir = new Circulo();
        
        ret.desenhar();
        ret.redesenhar();
        cir.desenhar();
        cir.redesenhar();
    }
}
