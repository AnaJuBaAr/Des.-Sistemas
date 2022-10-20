public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Amarelinho", 5);
        Carro carro =new Carro("Vermelinho", 2);
        Moto moto = new Moto("Azulzinha", 1);

        System.out.println(caminhao.calcularFrete());
        System.out.println(carro.calcularFrete());
        System.out.println(moto.calcularFrete());
    }
}
