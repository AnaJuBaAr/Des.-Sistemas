import java.util.Scanner;

public class at3 {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int numero = 1;
        int pares = 0;
        while (numero != 0){
            System.out.print("PARA PARAR O PROGRAMA DIGITE 0\nInforme um número: ");
            numero = teclado.nextInt();
            if(numero%2==0 && numero != 0){
                pares = pares + 1;
            }
            System.out.println("A quantidade de números pares é igual a "+pares);
        }
    }
}