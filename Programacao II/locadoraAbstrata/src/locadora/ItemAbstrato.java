/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author User
 */
public abstract class ItemAbstrato {

    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String situacaoItem; // L LIVRE ; E EMPRESTADO
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    
    public void setSituacaoItem(String situacaoItem) {
        this.situacaoItem = situacaoItem;
    }
    
    public String getSituacaoItem() {
       return situacaoItem;
    }
    
    public abstract void cadastrar();
    public abstract void emprestar();
    public abstract void devolver();
}
