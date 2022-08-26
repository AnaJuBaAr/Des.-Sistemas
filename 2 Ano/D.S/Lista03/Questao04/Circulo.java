package Lista03.Questao04;

public class Circulo {
    double diam, r;

    void diametro (double diame){
        this.diam = diame;
    }
    void raio (double ra){
        this.r = ra;
    }

    double consultarAreaC(){
        return (3.14*(r*r));
    }
}
