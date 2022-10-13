package Questao01;

public class Tartaruga extends Animal {
    public Tartaruga(String nome) {
        super(nome);
    }

    @Override
    public void falar(){
        System.out.println("Eu sou uma tartaruga");
    }
}