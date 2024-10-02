package etapa04.domain;

import java.text.Normalizer;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // toString atualizado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", endereco=").append(endereco);
        sb.append(", lojas=[");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja.toString()).append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    // Método insereLoja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; // Não há espaço para mais lojas
    }

    // Método removeLoja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada
    }

    // Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        //Normaliza string de entrada para remoção de acentos
        String tipoLojaNormalizado = Normalizer.normalize(tipoLoja, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

            switch (tipoLojaNormalizado) {
                case "Cosmetico":
                    for (int i = 0; i < lojas.length; i++) {
                        if (lojas[i] instanceof Cosmetico) {
                            quantidade++;
                        }
                    }
                    break;

                case "Bijuteria":
                    for (int i = 0; i < lojas.length; i++) {
                        if (lojas[i] instanceof Bijuteria) {
                            quantidade++;
                        }
                    }
                    break;

                case "Alimentacao":
                    for (int i = 0; i < lojas.length; i++) {
                        if (lojas[i] instanceof Alimentacao) {
                            quantidade++;
                        }
                    }
                    break;

                case "Vestuario":
                    for (int i = 0; i < lojas.length; i++) {
                        if (lojas[i] instanceof Vestuario) {
                            quantidade++;
                        }
                    }
                    break;

                case "Informatica":
                    for (int i = 0; i < lojas.length; i++) {
                        if (lojas[i] instanceof Informatica) {
                            quantidade++;
                        }
                    }
                    break;

                default:
                    quantidade = -1;
                    break;
            }

            return quantidade;
        }


    // Método lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0.0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }
}
