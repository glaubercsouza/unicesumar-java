package animal;

public class Cavalo extends Animal{

    Cavalo(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    @Override
    public void seLocomove() {
        System.out.println("Cavalo: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Cavalga, Marcha, Trota");
    }

    @Override
    public void emiteSom() {
        System.out.println("Nhiiiiiiii ri ri rin!!");
    }
    
}
