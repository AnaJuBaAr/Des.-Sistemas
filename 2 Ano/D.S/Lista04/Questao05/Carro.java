package Lista04.Questao05;

public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private int numeroDePortas;
    private Motor motor = new Motor();

    public void ligar(){
        motor.ligar();
    }

    public void desligar(){
        motor.desligar();
    }

    public void acelerar(){
        motor.acelerar();
    }
}
