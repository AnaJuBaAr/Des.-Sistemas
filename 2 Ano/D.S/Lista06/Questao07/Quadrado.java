public class Quadrado extends Forma{
    public Quadrado(double largura, double altura){
        super(largura, altura);
    }

    public double getArea(){
        return super.altura*super.largura;
    }
}
