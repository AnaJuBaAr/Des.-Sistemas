package Questao01;

public class Coelho extends Animal {
    public Coelho(String nome) {
        super(nome);
    }

    @Override
    public void falar(){
        System.out.println("O que que há velhinho?");
    }
}