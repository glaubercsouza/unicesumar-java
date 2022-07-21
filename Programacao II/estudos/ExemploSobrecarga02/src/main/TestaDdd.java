/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TestaDdd {
    public static void main(String[] args) {
        // criamos aqui duas variáveis para ddd uma int outra para string
        int ddd;
        String strDdd;
        // vamos ler aqui a variável ddd que é integer
        ddd = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite o ddd da sua cidade: "));
        // vamos ler aqui a variável ddd que é string
        strDdd = JOptionPane.showInputDialog("Digite o ddd de sua cidade: ");
        
        SegundoExemplo se = new SegundoExemplo();
        // vamos imprimir primeiro o ddd int com máscara
        JOptionPane.showMessageDialog(null, "DDD int com máscara: " + se.retornaDddMascara(ddd));
        // vamos imprimir agora o ddd string com máscara
        JOptionPane.showMessageDialog(null, "DDD string com máscara: " + se.retonaDDDMascara(strDdd));
    }
}
