package Lista04.Questao03;

public class Carro {
    private String modelo;
    private boolean ligado;
    private double velocidade;
    private boolean freioDeMaoPuxado;
    private boolean volante;

    public void desligar(){
        this.soltarFreioDeMao();
        this.ligado = false;
    }
    public void ligar(){
        this.soltarFreioDeMao();
        this.ligado = true;
    }
    public void acelerar(double acelerando){
        this.velocidade = velocidade + acelerando;
    }
    public void frear(double freando){
        this.velocidade = velocidade - freando;
    }
    public void puxarFreioDeMao(){
        this.freioDeMaoPuxado = true;
    }
    public void soltarFreioDeMao(){
        this.freioDeMaoPuxado = false;
    }
    public void girarVolante(String direcao){
        if (direcao == "ESQUERDA"){
            this.volante = false;
        }
        if (direcao == "DIREITA"){
            this.volante = true;
        }
    }
}
