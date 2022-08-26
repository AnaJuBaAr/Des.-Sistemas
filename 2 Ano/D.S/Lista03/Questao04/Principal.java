package Lista03.Questao04;

import java.util.Scanner;

public class Principal {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        Quadrado quadradinho = new Quadrado();
        Circulo circuluzinho = new Circulo();
        Losango losangozinho = new Losango();
        Retangulo retanguluzinho = new Retangulo();
        Triangulo trianguluzinho = new Triangulo();
        double cir, larL, altL, largQ, altQ, altT, largT, largR, altR;

        System.out.print("Informe o raio do circulo: ");
        cir = input.nextDouble();
        circuluzinho.raio(cir);
        System.out.println("A área do circulo é "+circuluzinho.consultarAreaC());

        System.out.print("LOSANGO\nInforme a largura: ");
        larL = input.nextDouble();
        losangozinho.larguraL(larL);
        System.out.print("Informe a altura: ");
        altL = input.nextDouble();
        losangozinho.alturaL(altL);
        System.out.println("A área do losango é "+losangozinho.consultarAreaL());

        System.out.print("QUADRADO\nInforme a largura: ");
        largQ = input.nextDouble();
        quadradinho.larguraQ(largQ);
        System.out.print("Informe a altura: ");
        altQ = input.nextDouble();
        quadradinho.alturaQ(altQ);
        System.out.println("A área do quadrado é "+quadradinho.consultarAreaQ());

        System.out.print("TRIÂNGULO\nInforme a altura: ");
        altT = input.nextDouble();
        trianguluzinho.alturaT(altT);
        System.out.print("Informe a largura: ");
        largT = input.nextDouble();
        trianguluzinho.larguraT(largT);
        System.out.println("A área do triângulo é "+trianguluzinho.consultarAreaT());

        System.out.print("RETÂNGULO\nInforme a largura: ");
        largR = input.nextDouble();
        retanguluzinho.larguraR(largR);
        System.out.print("Informe a altura: ");
        altR = input.nextDouble();
        retanguluzinho.alturaR(altR);
        System.out.println("A área do retângulo é "+retanguluzinho.consultarAreaR());
    }
}
