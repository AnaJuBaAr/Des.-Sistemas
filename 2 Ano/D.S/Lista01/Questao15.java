import java.util.Scanner;

public class questao15 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe sua altura:");
        double altura = teclado.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = teclado.nextDouble();
        double potencia = Math.pow(altura, 2);
        double imc = peso / potencia;
        if (imc < 18.5){
            System.out.println("Magreza");
        }
        if (imc > 18.5 && imc < 24.9){
            System.out.println("Saudável");
        }
        if (imc > 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        }
        if (imc > 30 && imc < 34.9){
            System.out.println("Obesidade grau I");
        }
        if (imc > 35 && imc < 39.9){
            System.out.println("Obesidade grau II (severa)");
        }
        if (imc > 40){
            System.out.println("Obesidade grau II (mórbida)");
        }
    }
}
