package Pratica;

import java.util.Scanner;

public class sala {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe a medida do\n1° lado:");
        int lado1 = teclado.nextInt();
        System.out.println("2° lado:");
        int lado2 = teclado.nextInt();
        System.out.println("3° lado:");
        int lado3 = teclado.nextInt();
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Triângulo Equilátero.");
        }
        if (lado1 != lado2 || lado1 != lado3){
            System.out.println("Triângulo isósceles.");
        }
        if (lado1 != lado2 && lado1 != lado3){
            System.out.println("Triângulo escaleno.");
        }
    }
}