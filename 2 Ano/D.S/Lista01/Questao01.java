package aula;
import java.util.Scanner;

public class Questao01 {
    public static void main (String args []) {
        Scanner input = new Scanner (System.in);
        int numero1, numero2, total;

        System.out.print("Informe um número: ");
        numero1 = input.nextInt();
        System.out.print("Informe um número: ");
        numero2 = input.nextInt();
        total = numero1 + numero2;
        System.out.println("A soma dos valores é igual a "+total);
        input.close();
    }
}
