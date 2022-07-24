package conta;

import cliente.Pessoa;
import java.util.Scanner;

public class Conta {
    private double saldo;
    private int numConta;
    private Pessoa titular = new Pessoa() {};
    private int tipoConta;
    
    public Conta() {
        this.setSaldo(0.0);
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public Pessoa getTitular() {
        return this.titular;
    }
    
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    public int getTipoConta() {
        return this.tipoConta;
    }
    
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public void cadastra() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o n�mero da conta");
        numConta = Integer.parseInt(tec.nextLine());
        System.out.println("Tipo da conta: [1 - Conta Corrente][2 - Conta Poupan�a]");
        tipoConta = Integer.parseInt(tec.nextLine());
        System.out.println("Dados da Pessoa");
        titular.cadastra();
    }
    
    public void imprimeC() {
        System.out.println("N�mero da Conta: " + getNumConta());
        if(getTipoConta() == 1 ) {
            System.out.println("Tipo de Conta: Conta Corrente");
        } else if(getTipoConta() == 2) {
            System.out.println("Tipo de Conta: Conta Poupan�a");
        }
        titular.imprime();
    }
    
}
