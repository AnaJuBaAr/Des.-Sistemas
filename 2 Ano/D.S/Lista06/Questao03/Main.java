package Questao01;

public class Main {
    public static void main(String[] args) {
        Jacare Dentinho = new Jacare("Dentinho");
        PetShop AuQMia = new PetShop();

        Dentinho.falar();
        AuQMia.darBanho(Dentinho);
    }
}
