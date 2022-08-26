package Lista03.Questao04;

public class Losango {
    double larg, alt;

    void larguraL (double largu){
        this.larg = largu;
    }
    void alturaL (double altu){
        this.alt = altu;
    }

    double consultarAreaL(){
        return ((larg*alt)/2);
    }
}
