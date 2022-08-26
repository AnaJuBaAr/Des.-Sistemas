package Lista04.Questao03;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligar();
        carro.acelerar(220);
        carro.puxarFreioDeMao();
        carro.girarVolante("ESQUERDA");
        carro.soltarFreioDeMao();
        carro.acelerar(50);
        carro.frear(50);
        carro.desligar();
    }
}
