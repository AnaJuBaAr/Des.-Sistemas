import java.util.Scanner;

public class questao14 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o primeiro número:");
        int numero1 = teclado.nextInt();
        System.out.println("Informe o segundo número:");
        int numero2 = teclado.nextInt();
        if (numero1 > numero2){
            System.out.println("O primeiro número é maior que o segundo.");

        }
        else{
            System.out.println("O segundo número é maior que o primeiro.");
        }

    }
}
