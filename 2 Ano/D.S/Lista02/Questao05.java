import java.util.Scanner;

public class at5 {
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe o valor da pizza: ");
        double pizza = teclado.nextInt();
        System.out.print("Informe seu código: ");
        int cod = teclado.nextInt();
        switch (cod){
            case 1:
                System.out.println("O valor a ser pago é de R$"+pizza);
                break;
            case 2:
                double descvip = pizza / 100 * 95;
                System.out.println("O valor a ser pago é de R$"+descvip);
                break;
            case 3:
                double descfunc = pizza / 10 * 9;
                System.out.println("O valor a ser pago é de R$"+descfunc);
                break;
            default:
                System.out.println("Cupom inválido");
                break;
        }
    }    
}
