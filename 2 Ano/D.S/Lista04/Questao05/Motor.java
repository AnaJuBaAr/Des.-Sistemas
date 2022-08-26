package Lista04.Questao05;

public class Motor {
    private int quantidadeDeCilindros;
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
        System.out.println("O carro foi ligado");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("O carro foi desligado");
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }
}
