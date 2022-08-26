import java.util.Scanner;

public class at9 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("INFORME UM NÚMERO INTEIRO: ");
        int num = teclado.nextInt();
        teclado.close();
        int loop = num;
        while (num > 1){
            loop = loop * (num - 1);
            num = num - 1;
        }
        System.out.println("O valor da fatoração do número apresentado é "+loop);
    }
}
