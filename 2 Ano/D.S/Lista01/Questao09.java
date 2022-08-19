import java.util.Scanner;

public class questao9 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cotação do dólar: ");
        double dolar = teclado.nextDouble();
        System.out.println("Valor em real: ");
        double real =  teclado.nextDouble();
        System.out.println("Após a converção, o valor será de U$"+real/dolar);
    }
}
