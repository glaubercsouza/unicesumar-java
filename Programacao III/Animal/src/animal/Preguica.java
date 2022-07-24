package animal;

public class Preguica extends Animal{

    Preguica(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        System.out.println("Bicho Preguiça: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Subindo na Árvore");
    }

    @Override
    public void emiteSom() {
        System.out.println("GRRRRRRRRrrrrrrrr");
    }
    
}
