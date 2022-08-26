import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        loop: while (true){
            System.out.println("SELECIONE UMA OPÇÃO - \n1:SOMAR\n2:SUBTRAIR\n3:MULTIPLICAR\n4:DIVIDIR\n5:SAIR");
            int opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Informe um número inteiro: ");
                    int num1S = teclado.nextInt();
                    System.out.print("Informe mais um número: ");
                    int num2S = teclado.nextInt();
                    int soma = num1S + num2S;
                    System.out.println(soma);
                    break;
                case 2:
                    System.out.print("Informe um número inteiro: ");
                    int num1Su = teclado.nextInt();
                    System.out.print("Informe mais um número: ");
                    int num2Su = teclado.nextInt();
                    int sub = num1Su - num2Su;
                    System.out.println(sub);
                    break;
                case 3:
                    System.out.print("Informe um número inteiro: ");
                    int num1M = teclado.nextInt();
                    System.out.print("Informe mais um número: ");
                    int num2M = teclado.nextInt();
                    int mult = num1M * num2M;
                    System.out.println(mult);
                    break;
                case 4:
                    System.out.print("Informe um número inteiro: ");
                    int num1D = teclado.nextInt();
                    System.out.print("Informe mais um número: ");
                    int num2D = teclado.nextInt();
                    double div = (double) num1D / num2D;
                    System.out.println(div);
                    break;
                case 5:
                    break loop;
            }
        }
        teclado.close();
    }
} 
