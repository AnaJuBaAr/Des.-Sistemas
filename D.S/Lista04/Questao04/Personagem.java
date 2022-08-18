package Lista04.Questao04;

public class Personagem {
    private String nome;
    private double vida;
    private double defesa;
    private double forca;
    private double x, y;

    public Personagem(String nome, double vida, double defesa, double forca){
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.forca = forca;
    }

    public void detalhesDoPersonagem(){
        System.out.println("---------------------------------------------");
        System.out.print("Nickname: "+this.getNome());
        System.out.print("Life: "+this.getVida());
        System.out.print("Defense: "+this.getDefesa());
        System.out.print("Strength: "+this.forca);
        System.out.println("---------------------------------------------");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setVida(double vida){
        this.vida = vida;
    }
    public double getVida(){
        return this.vida;
    }

    public void setDefesa(double defesa){
        this.defesa = defesa;
    }
    public double getDefesa(){
        return this.defesa;
    }

    public void setForca(double forca){
        this.forca = forca;
    }
    public double getForca(){
        return this.forca;
    }

    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }

    public void andar(Direcao direcao){
        if(this.getVida()>0){
            switch(direcao){
                case CIMA:
                    this.y += 1;
                    break;
                case BAIXO:
                    this.y -= 1;
                    break;
                case ESQUERDA:
                    this.x -= 1;
                    break;
                case DIREITA:
                    this.x += 1;
                    break;
            }
        }
    }

    public void atacar (Personagem alvo){
        if(this.getVida()>0 && alvo.getVida()>0){
            alvo.setVida(alvo.getVida() + alvo.getDefesa() - this.getForca());
        }
    }
}