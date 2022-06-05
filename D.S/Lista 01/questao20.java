import java.util.Scanner;

public class questao20 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe\no 1° número:");
        int numero1 = teclado.nextInt();
        System.out.print("o 2° número:");
        int numero2 = teclado.nextInt();
        System.out.print("o 3° número:");
        int numero3 = teclado.nextInt();
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é o primeiro.");
        }
        if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é o segundo.");
        }
        if (numero3 > numero1 && numero3 > numero2){
            System.out.println("O maior número é o teceiro.");
        }

    }
}
