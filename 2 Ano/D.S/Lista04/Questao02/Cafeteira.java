package Lista04.Questao02;

public class Cafeteira {
    private boolean agua;
    private boolean cafe;

    public void adicionarCafe(){
        this.cafe = true;
    }

    public void adicionarAgua(){
        this.agua = true;
    }

    public void limpar(){
        this.agua = false;
        this.cafe = false;
    }

    public void ligar(){
        this.agua = false;
        this.cafe = false;
        this.limpar();
    }
}
