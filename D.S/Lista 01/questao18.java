import java.util.Scanner;

public class questao18 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a senha: ");
        int senha = teclado.nextInt();
        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }
}
