import java.util.Scanner;

public class questao8 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o seu\nNome: ");
        String nome = teclado.next();
        System.out.println("Sobrenome: ");
        String sobrenome = teclado.next();
        System.out.println("Rua: ");
        String rua = teclado.next();
        System.out.println("Número: ");
        int numero = teclado.nextInt();
        System.out.println("Cidade: ");
        String cidade = teclado.next();
        System.out.println("Estado: ");
        String estado = teclado.next();
        System.out.println("Nome: "+nome+" "+sobrenome);
        System.out.println("Endereço: Rua "+rua+", n°"+numero+" -- "+cidade+" - "+estado);
    }
}
