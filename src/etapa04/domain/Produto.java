package etapa04.domain;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    //Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        return dataValidade.compareTo(dataAtual) < 0;
    }

    //toString
    @Override
    public String toString() {
        return "Produto(" +
                "Nome do produto: " + nome +
                ", Preço do produto: " + preco +
                ", Data de validade: " + dataValidade +
                ")";
    }
}