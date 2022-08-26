import java.util.Scanner;

public class at8 {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe um número inteiro: ");
        int num = teclado.nextInt();
        teclado.close();
        int loop = 1;
        int loop2 = 1;
        while (loop <= 10){
            System.out.println("TABELA DE DIVISÃO:");
            double div = (double) num / loop;
            System.out.println(div);
            loop = loop + 1;
        }
        while (loop2 <=10){
            System.out.println("TABELA DE MULTIPLICAÇÃO:");
            int mult = num * loop2;
            System.out.println(mult);
            loop2 = loop2 + 1;
        }
    }
}
