package Locadora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    @Override
    public void cadastrar() {
        this.setCodigo(1);
        this.setTitulo("Senhor dos Anéis");
        this.setSituacaoItem("L");
        System.out.println(
                "\nDVD Cadastrado: " + this.getTitulo() +
                "\nCód: " + this.getCodigo() +
                "\nTítulo: " + this.getTitulo() + 
                "\nSituaç?o: " + this.getSituacaoItem());
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.println(
                "\nDVD Emprestado: " + this.getTitulo() + 
                "\nSituaç?o: " + this.getSituacaoItem() + 
                "\nData Empréstimo: " + this.getDataEmprestimo());
    }

    @Override
    public void devolver() {
        setSituacaoItem("L");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println(
                "\nDVD Devolvido: " + this.getTitulo() +
                "\nSituaç?o: " + this.getSituacaoItem() +
                "\nData Empréstimo: " + this.getDataDevolucao());
    }
    
    public void imprimir() {
        System.out.println("Imprimir Lista de DVDs utilizando método concreto da classe DVD");
    }
    
}
