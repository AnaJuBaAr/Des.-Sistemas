package Lista04.Questao01;

public class Atributos {
    private String tamanho;
    private String material;
    private boolean aberta;
    private boolean vazia;

    public Atributos(String tamanho, String material, boolean aberta, boolean vazia){
        this.tamanho = tamanho;
        this.material = material;
        this.aberta = aberta;
        this.vazia = vazia;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getTamanho(){
        return this.tamanho;
    }

    public void setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return this.material;
    }

    public void setAberto(boolean aberta){
        this.aberta = aberta;
    }
    public String getAberta(){
        if (this.aberta==true){
            return "aberta";
        }
        else{
            return "fechada";
        }
    }

    public void setVazia(boolean vazia){
        this.vazia = vazia;
    }
    public String getVazia(){
        if (this.vazia==true){
            return "vazia";
        }
        else{
            return "cheia";
        }
    }

    public void imprimirDetalhes(){
        System.out.println("-----------------------------");
        System.out.println("TAMANHO: "+this.getTamanho());
        System.out.println("MATERIAL: "+this.getMaterial());
        System.out.println("A caixa está "+this.getAberta());
        System.out.println("A caixa está "+this.getVazia());
        System.out.println("-----------------------------");
    }
}