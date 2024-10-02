Projeto Acadêmico: Gerenciador de Lojas de um Shopping Center

Este projeto foi desenvolvido como parte do curso de Laboratório I no semestre 2023/1. O objetivo é implementar um sistema para gerenciar lojas de diferentes 
segmentos em um shopping center. A aplicação permite cadastrar lojas, produtos e gerenciar suas operações, como inserção, remoção de produtos e cálculo de salários dos 
funcionários.

Estrutura do Projeto

O sistema foi desenvolvido em etapas, de acordo com os requisitos estabelecidos no enunciado do desafio acadêmico.

1. Classes Principais
Loja

A classe Loja representa uma loja no shopping e inclui informações como o nome, quantidade de funcionários, salário base, endereço e data de fundação. 
Além disso, armazena um estoque de produtos.

Atributos:
nome: Nome da loja.
quantidadeFuncionarios: Número de funcionários.
salarioBaseFuncionario: Salário base dos funcionários (pode ser -1 caso não informado).
endereco: Endereço da loja (objeto Endereco).
dataFundacao: Data de fundação (objeto Data).
estoqueProdutos: Array de produtos da loja.
Métodos:
Construtores para inicialização dos atributos.
Métodos de acesso (getters e setters).
gastosComSalario(): Calcula o gasto total com salários.
tamanhoDaLoja(): Retorna o tamanho da loja com base no número de funcionários ('P', 'M', 'G').
insereProduto(Produto): Insere um produto no estoque.
removeProduto(String): Remove um produto do estoque pelo nome.
imprimeProdutos(): Exibe todos os produtos da loja.
Produto

A classe Produto armazena informações sobre os produtos da loja, incluindo nome, preço e data de validade.

Atributos:
nome: Nome do produto.
preco: Preço do produto.
dataValidade: Data de validade (objeto Data).
Métodos:
Construtor para inicialização dos atributos.
Métodos de acesso (getters e setters).
estaVencido(Data): Verifica se o produto está vencido em relação a uma data.
Endereco

A classe Endereco define o endereço de uma loja, incluindo detalhes como rua, cidade, estado e país.

Atributos:
nomeDaRua, cidade, estado, pais, cep, numero, complemento: Detalhes do endereço.
Data

A classe Data representa datas no formato dia/mês/ano e permite verificar se uma data é válida e se um ano é bissexto.

Atributos:
dia, mes, ano: Definem uma data.
Métodos:
Validação de datas.
Comparação entre datas.
Verificação de ano bissexto.

2. Classes Especializadas de Loja
As subclasses especializadas herdam da classe Loja e possuem atributos e comportamentos específicos:

Cosmético: Possui uma taxa de comercialização.
Vestuário: Indica se vende produtos importados.
Bijuteria: Define uma meta de vendas mensais.
Alimentação: Armazena a data do alvará de funcionamento.
Informática: Inclui o valor do seguro de eletrônicos.
3. Classe Shopping
A classe Shopping gerencia o conjunto de lojas e suas operações.

Atributos:
nome: Nome do shopping.
endereco: Endereço do shopping.
lojas: Array de lojas presentes no shopping.
Métodos:
insereLoja(Loja): Adiciona uma loja ao shopping.
removeLoja(String): Remove uma loja pelo nome.
quantidadeLojasPorTipo(String): Retorna a quantidade de lojas de um determinado tipo.
lojaSeguroMaisCaro(): Retorna a loja de informática com o seguro mais caro.
Estrutura de Arquivos

O projeto é organizado da seguinte maneira:
/src
  └── /etapa04
      └── /domain
          ├── Loja.java
          ├── Produto.java
          ├── Endereco.java
          ├── Data.java
          ├── Cosmetico.java
          ├── Vestuario.java
          ├── Bijuteria.java
          ├── Alimentacao.java
          ├── Informatica.java
          └── Shopping.java

Funcionalidades Implementadas

Gerenciamento de Lojas: Cadastra e remove lojas, além de listar lojas por tipo.
Estoque de Produtos: Insere e remove produtos do estoque da loja.
Relatórios: Relatório de lojas e produtos armazenados, além da loja de informática com maior valor de seguro.
Como Executar

Clone o repositório do projeto.
Compile e execute o código principal (Principal.java), que contém o menu interativo para criar lojas e produtos.
Siga as instruções para adicionar e manipular dados no sistema.
