import java.util.Scanner;

public class questao19 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o número de laranjas compradas:");
        int numlarj = teclado.nextInt();
        if (numlarj < 12){
            double valor1 = numlarj * 0.50;
            System.out.println("O valor total da compra é de R$"+valor1);
        }
        else{
            double valor2 = numlarj * 0.30;
            System.out.println("O valor total da compra é de R$"+valor2);
        }
    }
}
