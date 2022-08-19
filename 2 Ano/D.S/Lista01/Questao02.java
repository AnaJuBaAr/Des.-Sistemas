import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número decimal: ");
        double numero1 = teclado.nextDouble();
        System.out.println("Informe o segundo número decimal: ");
        double numero2 = teclado.nextDouble();
        double soma = numero1 + numero2;
        System.out.println("A soma dos valores é igual a "+soma);
    }
}
