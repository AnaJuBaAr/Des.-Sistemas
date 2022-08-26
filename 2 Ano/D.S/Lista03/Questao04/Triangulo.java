package Lista03.Questao04;

public class Triangulo {
    double larg, alt;

    void larguraT (double largu){
        this.larg = largu;
    }
    void alturaT (double altu){
        this.alt = altu;
    }

    double consultarAreaT(){
        return ((larg*alt)/2);
    }
}
