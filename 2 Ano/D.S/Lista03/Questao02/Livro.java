package Questao02;

public class Livro {
    String nomeTitulo, nomeEditora, nomeAutor;
    int pag, anoPublicacao;

    String  titulo(String nomeDoLivro){
        this.nomeTitulo = nomeDoLivro;
        return nomeTitulo;
    }

    String editora (String nomeDaEditora){
        this.nomeEditora = nomeDaEditora;
        return nomeEditora;
    }

    String autor (String nomeDoAutor){
        this.nomeAutor = nomeDoAutor;
        return nomeAutor;
    }

    int paginas (int numeroDePaginas){
        this.pag = numeroDePaginas;
        return numeroDePaginas;
    }

    int publicacao (int anoDePublicacao){
        this.anoPublicacao = anoDePublicacao;
        return anoPublicacao;
    }
}
