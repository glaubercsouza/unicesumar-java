/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class SegundoExemplo {
    // criamos aqui uma string que será o ddd formatado
    String dddComMascara;
    // criamos aqui um método que retorna o ddd formatado recebendo um ddd do 
    // tipo int
    String retornaDddMascara(int ddd) {
        dddComMascara = "(" + ddd + ")";
        return dddComMascara;
    }
    
    // criamos aqui um método que retorna o ddd formatado recebendo um ddd do
    // tipo string
    String retonaDDDMascara(String ddd) {
        dddComMascara = "(" + ddd + ")";
        return dddComMascara;
    }
}
