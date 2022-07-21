
package locadora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // construtor padrão
    public Dvd() {

    }

    @Override
    public void cadastrar() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        setCodigo(1);
        setTitulo("Senhor dos Anéis");
        setSituacaoItem("L");
        System.out.println("DVD Cadastrato: " + " - Cód: " + getCodigo()
                + " - Título: " + getTitulo() + " - Situação: "
                + getSituacaoItem());
        System.out.println("DVD Cadastrado utilizando método abstrato " + 
                "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void emprestar() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        setSituacaoItem("E");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println("DVD Emprestado: " + " - Situação: " + getSituacaoItem()
                + " - Data Empréstimo: " + this.getDataEmprestimo());
        System.out.println("DVD Emprestado utilizando método abstrato " + 
                "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void devolver() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        setSituacaoItem("E");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println("Dvd Devolvido: " + " - Situação: " + 
                getSituacaoItem() + " - Data Devolução: " + this.getDataDevolucao());
        System.out.println("DVD Devolvido utilizando método abstrato "
                + "herdado da classe abstrata ItemAbstrato");
    }
    
    public void imprimir() {
        System.out.println("Imprimir lista de DVDs utilizando método " +
                "concreto da classe DVD");
    }
    
    public static Dvd getInstance() {
        return new Dvd();
    }

}
