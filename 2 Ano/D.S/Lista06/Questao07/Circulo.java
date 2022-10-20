public class Circulo extends Forma{
    public Circulo(double largura, double altura){
        super(largura, altura);
    }

    public double getArea(){
        return 3.14*((super.largura/2)*(super.largura/2));
    }
}
