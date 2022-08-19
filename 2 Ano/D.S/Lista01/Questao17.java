import java.util.Scanner;

public class questao17 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe seu ano de nascimento:");
        int ano = teclado.nextInt();
        int resposta = 2022 - ano;
        if (resposta >= 16){
            System.out.println("Você pode votar esse ano.");
        }
        else{
            System.out.println("Você ainda não pode votar esse ano.");
        }
    }
}
