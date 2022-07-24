package Locadora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    @Override
    public void cadastrar() {
        this.setCodigo(1);
        this.setTitulo("Senhor dos An�is");
        this.setSituacaoItem("L");
        System.out.println(
                "\nDVD Cadastrado: " + this.getTitulo() +
                "\nC�d: " + this.getCodigo() +
                "\nT�tulo: " + this.getTitulo() + 
                "\nSitua�?o: " + this.getSituacaoItem());
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.println(
                "\nDVD Emprestado: " + this.getTitulo() + 
                "\nSitua�?o: " + this.getSituacaoItem() + 
                "\nData Empr�stimo: " + this.getDataEmprestimo());
    }

    @Override
    public void devolver() {
        setSituacaoItem("L");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println(
                "\nDVD Devolvido: " + this.getTitulo() +
                "\nSitua�?o: " + this.getSituacaoItem() +
                "\nData Empr�stimo: " + this.getDataDevolucao());
    }
    
    public void imprimir() {
        System.out.println("Imprimir Lista de DVDs utilizando m�todo concreto da classe DVD");
    }
    
}
