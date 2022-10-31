package ifestagio.model;

public class Curso {
    private long id;

    private String nome;
    private int cargaHorariaMinimaDeEstagio;

    
    public Curso(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
