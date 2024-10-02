package etapa02.test;

import etapa02.domain.Data;
import etapa02.domain.Endereco;
import etapa02.domain.Loja;
import etapa02.domain.Produto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Loja loja = null;
        Produto produto = null;

        do {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    System.out.print("Quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    System.out.print("Salário base dos funcionários: ");
                    double salarioBaseFuncionario = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Rua: ");
                    String nomeDaRua = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();
                    System.out.print("Dia de fundação: ");
                    int diaFundacao = scanner.nextInt();
                    System.out.print("Mês de fundação: ");
                    int mesFundacao = scanner.nextInt();
                    System.out.print("Ano de fundação: ");
                    int anoFundacao = scanner.nextInt();

                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
                    break;
                case 2:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Dia de validade: ");
                    int diaValidade = scanner.nextInt();
                    System.out.print("Mês de validade: ");
                    int mesValidade = scanner.nextInt();
                    System.out.print("Ano de validade: ");
                    int anoValidade = scanner.nextInt();

                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                    produto = new Produto(nomeProduto, precoProduto, dataValidade);

                    // Verifica se o produto está vencido
                    Data dataComparacao = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataComparacao)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (loja != null) {
                System.out.println("Informações da loja:");
                System.out.println("Nome: " + loja.getNome());
                System.out.println("Quantidade de funcionários: " + loja.getQuantidadeFuncionarios());
                System.out.println("Salário base dos funcionários: " + loja.getSalarioBaseFuncionario());
                System.out.println("Endereço: " + loja.getEndereco());
                System.out.println("Data de fundação: " + loja.getDataFundacao());
            }

        } while (opcao != 3);

        scanner.close();
    }
}