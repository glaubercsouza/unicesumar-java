package Locadora;

public class Cds extends Dvd{
    
    @Override
    public void cadastrar() {
        this.setCodigo(1);
        this.setTitulo("The Best of Joy Division");
        this.setSituacaoItem("L");
        System.out.println(
                "\nCD Cadastrado: " + 
                "\nCod: " + this.getCodigo() +
                "\nTítulo: " + this.getTitulo() + 
                "\nSituaç?o: " + this.getSituacaoItem());
    }
    
    @Override
    public void imprimir() {
        System.out.println("Imprimir Lista de CDs utilizando método concreto da classe DVD");
    }
    
    public void vender() {
        System.out.println("CD vendido utilizando método concreto da classe CDs");
    }
}
