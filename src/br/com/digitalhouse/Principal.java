package br.com.digitalhouse;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Livro lobo1 = new Livro(1, "LOBO MAL - PARTE I", "WILLIAM SHEAKSPEARE", "2007", "1234", 10, 20.50);
        Livro lobo2 = new Livro(2, "LOBO MAL - PARTE II", "WILLIAM SHEAKSPEARE", "2012", "12345", 10, 21.50);
        Livro lobo3 = new Livro(3, "LOBO MAL - PARTE III", "WILLIAM SHEAKSPEARE", "2019", "1234", 10, 23.50);

        List<Livro> livrosHarry = new ArrayList<>();
        livrosHarry.add(lobo1);
        livrosHarry.add(lobo2);
        livrosHarry.add(lobo3);

        livraria.cadastrarLivro(lobo1);
        livraria.cadastrarLivro(lobo2);
        livraria.cadastrarLivro(lobo3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("  --  DIGITE UMA DAS OPÇÕES  --  ");
        System.out.println("-  CADASTRO DE LIVROS -> 1");
        System.out.println("-  CONSULTA DE LIVROS -> 2");
        System.out.println("-  VENDA DE LIVROS    -> 3");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("DIGITE O CODIGO DO LIVRO...:");
            int codigo = scanner.nextInt();
            System.out.println("DIGITE O TITULO DO LIVRO...:");
            String titulo = scanner.next();
            System.out.println("DIGITE O AUTOR DO LIVRO....:");
            String autor = scanner.next();
            System.out.println("DIGITE O ANO DE LANCAMENTO.:");
            String anoLancamento = scanner.next();
            System.out.println("DIGITE O CODIGO ISBN LIVRO.:");
            String codigoISBN = scanner.next();
            System.out.println("DIGITE O QTDE DO LIVRO.....:");
            int quantidadeEstoque = scanner.nextInt();
            System.out.println("DIGITE O PREÇO DO LIVRO....:");
            double preco = scanner.nextDouble();

            Livro novoLivro = new Livro(codigo, titulo, autor, anoLancamento, codigoISBN, quantidadeEstoque, preco);
            List<Livro> novoCadastro = new ArrayList<>();
            livraria.cadastrarLivro(novoLivro);


// TENTEI NO BLOCO ABAIXO VOLTAR AS OPÇÕES PARA CHECAR SE REALMENTE FOI CADASTRADO
// MAS NÃO ROLOU :(

            System.out.println("NOVO LIVRO CADASTRADO COM SUCESSO!!!");
            System.out.println("DIGITE UMA OPÇÃO...:");

            opcao = scanner.nextInt();

        }

        if (opcao == 2) {
            System.out.println("CODIGO A SER CONSULTADO..:");
            int codigo = scanner.nextInt();
            livraria.consultarLivroPorCodigo(codigo);


// TENTEI NO BLOCO ABAIXO VOLTAR AS OPÇÕES PARA CHECAR SE REALMENTE FOI CADASTRADO
// MAS NÃO ROLOU :(

            System.out.println("DIGITE UMA OPÇÃO...:");
            opcao = scanner.nextInt();
        }

        if (opcao == 3){
            System.out.println("INFORME O CODIGO DO LIVRO.:");
            int codigo = scanner.nextInt();
            livraria.efetuarVenda(codigo);
            System.out.println(livrosHarry);


// TENTEI NO BLOCO ABAIXO VOLTAR AS OPÇÕES PARA CHECAR SE REALMENTE FOI CADASTRADO
// MAS NÃO ROLOU :(

            System.out.println("DIGITE UMA OPÇÃO...:");
            opcao = scanner.nextInt();

        }

    }

}
