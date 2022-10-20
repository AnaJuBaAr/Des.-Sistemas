public class Carro extends Veiculos{
    private double peso;
    public Carro(String nome, double peso){
        super(nome, peso);
    }

    public double calcularFrete(){
        return super.getPeso()*0.3;
    }
}
