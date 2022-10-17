public class Dispositivo {
    private String nome;
    private double capacidadeDeArmazenamentoEmBytes;

    public Dispositivo(String nome, double capacidadeDeArmazenamentoEmBytes) {
        this.nome = nome;
        this.capacidadeDeArmazenamentoEmBytes = capacidadeDeArmazenamentoEmBytes;
    }

    public double getCapacidadeEmMegaBytes(){
        return capacidadeDeArmazenamentoEmBytes;
    }

    public String getNome(){
        return nome;
    }

}