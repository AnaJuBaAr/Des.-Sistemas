import java.util.Scanner;

public class questao10 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a quantidade de minutos: ");
        int minuto = teclado.nextInt();
        double convercao = minuto/60;
        System.out.println("Equivale a aproximadamente "+convercao+" horas");
    }
}
