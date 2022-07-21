
package locadora;

public class Cds extends Dvd {
    
    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("The Besto of Joy Divison");
        setSituacaoItem("L");
        System.out.println("CD Cadastrado: " + " - Cód: " + getCodigo() +
                " - Título: " + getTitulo() + " - Situação: " + getSituacaoItem());
        System.out.println("Cd cadastrado utilizando método herdado da classe"
                + " da classe abstrata ItemAbstrato");
    }
    
    @Override
    public void imprimir() {
        System.out.println("Impressão da Lista de CDs método herdado da classe"
                + " Dvds");
    }
    
    public void vender() {
        System.out.println("CD vendido utilizando método concreto da classe "
                + "CDs");
    }
    
    public static Cds getInstance() {
        return new Cds();
    }
}
