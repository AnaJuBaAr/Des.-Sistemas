package Lista03.Questao04;

public class Quadrado {
    double larg, alt;

    void larguraQ (double largu){
        this.larg = largu;
    }
    void alturaQ (double altu){
        this.alt = altu;
    }

    double consultarAreaQ(){
        return (larg*alt);
    }
}
