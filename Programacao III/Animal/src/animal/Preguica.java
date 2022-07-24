package animal;

public class Preguica extends Animal{

    Preguica(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        System.out.println("Bicho Pregui�a: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Subindo na �rvore");
    }

    @Override
    public void emiteSom() {
        System.out.println("GRRRRRRRRrrrrrrrr");
    }
    
}
