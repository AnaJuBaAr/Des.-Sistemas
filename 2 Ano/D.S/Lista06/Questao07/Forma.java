abstract class Forma {
    public double altura;
    public double largura;

    public Forma(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    abstract double getArea();
}
