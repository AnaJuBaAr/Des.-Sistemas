package javanetbeans;

import java.util.Scanner;

public class At1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe um número inteiro: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe mais um número inteiro: ");
        int num2 = teclado.nextInt();
        if(num1>num2){
            System.out.println("O número "+num1+" é maior que o número "+num1);
        }
        if(num2>num1){
            System.out.println("O número "+num2+" é maior que o número "+num1);
        }
        if(num1==num2){
            System.out.println("Os dois números são iguais");
        }
    }   
}