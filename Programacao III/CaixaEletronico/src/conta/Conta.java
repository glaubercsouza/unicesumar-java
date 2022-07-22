package conta;

import cliente.Pessoa;

public class Conta {
    private float saldo;
    private int numConta;
    private Pessoa titular;
    private int tipoConta;
    
    private final static float LIMITETRANSFERENCIA = 3000;
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float saldo) {
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
    
}
