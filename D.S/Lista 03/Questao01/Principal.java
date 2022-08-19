package Lista03.Questao01;

import java.util.Scanner;

public class Principal {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Aluno anaJulia = new Aluno();
        double P1, P2, P3, T;

        System.out.println("Informe a nota:");
        System.out.print("\nda 1° prova: ");
        P1 = input.nextInt();
        System.out.print("\nda 2° prova: ");
        P2 = input.nextInt();
        System.out.print("\nda 3° prova: ");
        P3 = input.nextInt();
        System.out.print("\ndo trabalho: ");
        T = input.nextInt();

        anaJulia.nota1(P1);
        anaJulia.nota2(P2);
        anaJulia.nota3(P3);
        anaJulia.nota4(T);
        System.out.println("Media final: "+anaJulia.consultarNotaFinal());
    }
}
