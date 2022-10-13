/*
    Já que um dos métodos dessa classe é abstráto, a classe também deve ser abstráta.
*/

public abstract class Produto {
    private String nome;
    private double custoDeProducao;

    public Produto (String nome, double custoDeProducao){
        this.nome = nome;
        this.custoDeProducao = custoDeProducao;
    }

    abstract double definirNovoCusto(double custo);
}
