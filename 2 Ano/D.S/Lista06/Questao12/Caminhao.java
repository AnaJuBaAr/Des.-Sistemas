public class Caminhao extends Veiculos{
    private double peso;
    public Caminhao(String nome, double peso){
        super(nome, peso);
    }

    public double calcularFrete(){
        return super.getPeso()*0.5;
    }
}
