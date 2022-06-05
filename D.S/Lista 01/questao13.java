import java.util.Scanner;

public class questao13 {
        public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe o tempo em minutos: ");
        int minutos = teclado.nextInt();
        int segundos = minutos * 60;
        int segundos2 = segundos * segundos;
        double at2 = segundos2 * 20,2;
        double altura = 0 * segundos + at2 / 2;
        System.out.println("A altura inicial do objeto é de "+altura+" metros.");
    }
}
