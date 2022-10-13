package Questao01;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void falar(){
        System.out.println("Au au");
    }
}