public class Moto extends Veiculos{
    private double peso;
    public Moto(String nome, double peso){
        super(nome, peso);
    }

    public double calcularFrete(){
        return super.getPeso()*0.1;
    }
}
