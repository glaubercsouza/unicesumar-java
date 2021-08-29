package br.com.mapa;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Produtos {

    private String nome;
    private double precoUnitario;
    private String unidadeMedida;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome, int posicaoAtual, Produtos produtosLista[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < posicaoAtual; i++){
            while(nome.equalsIgnoreCase(produtosLista[i].getNome())){
                System.out.print("PRODUTO JÁ CADASTRADO!\n\nInforme o nome do produto: ");
                String novoNome = scanner.nextLine();
                nome = novoNome;
            }
        }
        this.nome = nome;
    }
    
    public void setNomeAlterar(String nome){
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        Scanner scanner = new Scanner(System.in);
            while (precoUnitario <= 0) {
                System.out.print("INFORME UM VALOR MAIOR DO QUE ZERO!\n\n"
                        + "Informe o preço unitário do produto: ");
                double preco = scanner.nextDouble();
                precoUnitario = preco;
            }
        this.precoUnitario = precoUnitario;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        Scanner scanner = new Scanner(System.in);
            while (quantidadeEstoque < 0) {
                System.out.print("INFORME UM VALOR MAIOR OU IGUAL A ZERO!\n\n"
                        + "Informe a quantidade:  ");
                int qtd = scanner.nextInt();
                quantidadeEstoque = qtd;
            }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        Locale ptBr = new Locale("pt", "BR");
        String precoUnitarioReal = NumberFormat.getCurrencyInstance(ptBr).format(precoUnitario);
        return "\nNOME: " + nome + "\n"
                + "PREÇO UNITÁRIO: " + precoUnitarioReal + "\n"
                + "UNIDADE DE MEDIDA: " + unidadeMedida + "\n"
                + "QUANTIDADE EM ESTOQUE: " + quantidadeEstoque;
    }
    
    public void setAdicionarEstoque(int quantidadeEntrada) {
        this.quantidadeEstoque += quantidadeEntrada;
    }
    
    public void setRetirarEstoque(int quantidadeSaida) {
        this.quantidadeEstoque -= quantidadeSaida;
    }

    public void setReajustarProduto(double percentualReajuste){
        this.precoUnitario *= percentualReajuste;
    }
}
