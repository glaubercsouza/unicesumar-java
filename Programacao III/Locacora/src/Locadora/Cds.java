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
                "\nT�tulo: " + this.getTitulo() + 
                "\nSitua�?o: " + this.getSituacaoItem());
    }
    
    @Override
    public void imprimir() {
        System.out.println("Imprimir Lista de CDs utilizando m�todo concreto da classe DVD");
    }
    
    public void vender() {
        System.out.println("CD vendido utilizando m�todo concreto da classe CDs");
    }
}
