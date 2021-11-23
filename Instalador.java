public class Instalador {

    private int endInicial, id, prioridade;
    private String nome, params;
    private double tamanho;

    public Instalador(int endInicial, int id, int prioridade, String nome, String params, double tamanho) {
        this.endInicial = endInicial;
        this.id = id;
        this.prioridade = prioridade;
        this.nome = nome;
        this.params = params;
        this.tamanho = tamanho;
    }

    
/*
    @Override
    public String toString() {
        return "Instalador [endInicial=" + endInicial + ", id=" + id + ", nome=" + nome + ", params=" + params
                + ", prioridade=" + prioridade + ", tamanho=" + tamanho + "]";
    }
*/


    public int getEndInicial() {
        return endInicial;
    }

    public void setEndInicial(int endInicial) {
        this.endInicial = endInicial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    

}
