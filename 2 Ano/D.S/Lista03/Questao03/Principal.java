ackage Questao03;

import java.util.Scanner;

public class Principal {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        Livraria novo = new Livraria();
        Autor zezinho = new Autor();
        Editora livros = new Editora();
        String tit, nomE, endE, nome, ddn, cnpjE;
        int pags, adp;

        System.out.print("Informe: \no nome do autor: ");
        nome = input.nextLine();
        System.out.print("Data de nascimento do autor: ");
        ddn = input.nextLine();
        System.out.print("o nome da editora: ");
        nomE = input.nextLine();
        System.out.print("o endereço da editora: ");
        endE = input.nextLine();
        System.out.print("CNPJ da empresa: ");
        cnpjE = input.nextLine();
        System.out.print("o título do livro: ");
        tit = input.nextLine();
        System.out.print("o número de páginas: ");
        pags = input.nextInt();
        System.out.print("o ano de publicação: ");
        adp = input.nextInt();

        livros.cnpjEmpresa(cnpjE);
        livros.enderecoEditora(endE);
        novo.paginas(pags);
        zezinho.dataDeNascimento(ddn);

        System.out.println("Livro:");
        System.out.println("Título: "+novo.titulo(tit));
        System.out.println("Publicação: "+novo.publicacao(adp));
        System.out.println("Autor: "+zezinho.nomeAutor(nome));
        System.out.println("Editora: "+livros.nomeEditora(nomE));
    }
}
