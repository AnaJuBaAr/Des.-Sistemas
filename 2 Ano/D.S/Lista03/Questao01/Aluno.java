package Questao01;
public class Aluno {
    String aluno;
    int matricula;
    double prova1, prova2, prova3, trabalho;
    double notaFinal;

    void nota1 (double nota1Prova){
        this.prova1 = nota1Prova * 2;
    }
    void nota2 (double nota2Prova){
        this.prova2 = nota2Prova * 2;
    }
    void nota3 (double nota3Prova){
        this.prova3 = nota3Prova * 2;
    }
    void nota4 (double nota4Trabalho){
        this.trabalho = nota4Trabalho * 1.5;
    }

    double consultarNotaFinal(){
        this.notaFinal = (prova1+prova2+prova3+trabalho)/(2+2+2+1.5);
        return notaFinal;
    }
}
