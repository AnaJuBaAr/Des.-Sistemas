import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = teclado.nextInt();
        int divisao = numero1/numero2;
        int resto = numero1%numero2;
        System.out.println("O resultado da divisao dos numeros eh igual a "+divisao);
        System.out.println("O resto dessa divisao eh "+resto);
    }  
}
