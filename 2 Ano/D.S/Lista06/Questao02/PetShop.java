package Questao01;

public class PetShop {
    public void darBanho(Animal animal){
        animal.falar();
        System.out.println("Dando banho em " + animal.getNome());
    }
}
