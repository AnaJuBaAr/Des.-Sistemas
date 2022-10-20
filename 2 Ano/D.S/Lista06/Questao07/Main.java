public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(30, 15);
        Circulo circulo = new Circulo(50, 50);

        System.out.println(circulo.getArea());
        System.out.println(quadrado.getArea());
    }
}
