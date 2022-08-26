package Lista04.Questao01;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o material da caixa: ");
        String material = input.nextLine();
        System.out.print("Informe o tamanho da caixa: ");
        String tamanho = input.nextLine();
        System.out.println("Informe com TRUE ou FALSE\nA caixa está aberta?");
        boolean aberta = input.nextBoolean();
        System.out.println("A caixa está vázia?");
        boolean vazia = input.nextBoolean();
        input.close();

        Atributos caixa = new Atributos(tamanho, material, aberta, vazia);

        caixa.imprimirDetalhes();
    }
}
