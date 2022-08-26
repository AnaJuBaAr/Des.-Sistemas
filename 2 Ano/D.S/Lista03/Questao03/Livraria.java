package Questao03;

public class Livraria {
    String nomeTitulo, nomeEditora, nomeAutor, endereco;
    int pag, anoPublicacao, ddnAutor, cnpjDE;

    String  titulo(String nomeDoLivro){
        this.nomeTitulo = nomeDoLivro;
        return nomeTitulo;
    }

    void paginas (int numeroDePaginas){
        this.pag = numeroDePaginas;
    }

    int publicacao (int anoDePublicacao){
        this.anoPublicacao = anoDePublicacao;
        return anoPublicacao;
    }
}
