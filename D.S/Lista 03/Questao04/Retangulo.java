package Lista03.Questao04;

public class Retangulo {
    double larg, alt;

    void larguraR (double largu){
        this.larg = largu;
    }
    void alturaR (double altu){
        this.alt = altu;
    }

    double consultarAreaR(){
        return (larg*alt);
    }
}
