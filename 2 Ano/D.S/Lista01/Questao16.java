import java.util.Scanner;

public class questao16 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe um valor:");
        int numero = teclado.nextInt();
        if (numero%2 == 1){
            System.out.println("O número é impar");
        }
        else{
            System.out.println("O número é par");
        }
    }
}
