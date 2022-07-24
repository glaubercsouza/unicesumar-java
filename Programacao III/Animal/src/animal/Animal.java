package animal;

abstract public class Animal {
    private String nome;
    private int idade;
    
    abstract public void seLocomove();
    abstract public void emiteSom();
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
