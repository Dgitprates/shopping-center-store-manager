package etapa01.domain;

public class Produto {
    private String nome;
    private double preco;

    //Construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //toString
    @Override
    public String toString() {
        return "Produto(" + "Nome do produto: " + nome + ", Preço do produto: " + preco + ")";
    }
}