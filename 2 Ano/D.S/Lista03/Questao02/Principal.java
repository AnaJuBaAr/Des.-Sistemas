package Questao02;

import java.util.Scanner;

public class Principal {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        Livro novo = new Livro();
        String tit, nom, ed;
        int pub, pags;

        System.out.println("Informe\no título do livro: ");
        tit = input.nextLine();
        System.out.print("o nome do autor: ");
        nom = input.nextLine();
        System.out.print("o nome da editora: ");
        ed = input.nextLine();
        System.out.print("a quantidade de páginas: ");
        pags = input.nextInt();
        System.out.print("o ano de publicação: ");
        pub = input.nextInt();

        novo.paginas(pags);

        System.out.println("Livro:");
        System.out.println("Título: "+novo.titulo(tit));
        System.out.println("Publicação: "+novo.publicacao(pub));
        System.out.println("Autor: "+novo.autor(nom));
        System.out.println("Editora: "+novo.editora(ed));
    }
}
