class DiscoOtico extends Dispositivo {

    public DiscoOtico(String nome, double capacidadeDeArmazenamentoEmBytes) {
        super(nome, capacidadeDeArmazenamentoEmBytes);
    }

    @Override
    public String toString() {
        return "Disco Ótico: " + super.getNome() + " - " + getCapacidadeEmMegaBytes() + " MB";
    }
}