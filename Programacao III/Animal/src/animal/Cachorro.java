package animal;

public class Cachorro extends Animal {

    Cachorro(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }

    @Override
    public void seLocomove() {
        System.out.println("Cachorro: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Cachorro correndo, com suas 4 patas");
    }

    @Override
    public void emiteSom() {
        System.out.println("Au Au!!");
    }
}
