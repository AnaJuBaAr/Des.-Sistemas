package Questao01;

public class Jacare extends Animal{
    public Jacare(String nome){
        super(nome);
    }
    @Override
    void falar() {
        System.out.println("Hmmm perninha");
    }
}
