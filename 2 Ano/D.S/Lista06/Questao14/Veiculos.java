abstract class Veiculos {
    private String nome;
    private double peso;

    public Veiculos(String nome, double peso){
        this.peso = peso;
        this.nome = nome;
    }

    public double getPeso(){
        return peso;
    }

    abstract double calcularFrete();
}
