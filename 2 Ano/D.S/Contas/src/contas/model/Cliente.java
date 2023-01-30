package contas.model;

public class Cliente {
    private long id;
    private String nome;
    private String cpg;

    public Cliente(long id, String nome, String cpg) {
        this.id = id;
        this.nome = nome;
        this.cpg = cpg;
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

    public String getCpg() {
        return cpg;
    }

    public void setCpg(String cpg) {
        this.cpg = cpg;
    }
}
