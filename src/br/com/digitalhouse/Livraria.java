package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> livrosEstoque = new ArrayList<>();


    public void cadastrarLivro(Livro livro) {
        this.livrosEstoque.add(livro);
    }


    public void consultarLivroPorCodigo(int codigo) {
        Livro livroSolicitado = null;
        for (Livro livro : livrosEstoque) {
            if (livro.getCodigo() == codigo) {
                livroSolicitado = livro;

            }
        }


        if (livroSolicitado != null) {
            System.out.println(livroSolicitado);
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void efetuarVenda(int codigo) {
        Livro livroEncontrado = null;
        for (Livro livro : livrosEstoque) {
            if (livro.getCodigo() == codigo) {
                livroEncontrado = livro;
            }
        }

        if (livroEncontrado != null) {
            if (livroEncontrado.getQuantidadeEstoque() > 0) {
                System.out.println("Saldo de livros em estoque: " + livroEncontrado.getQuantidadeEstoque());
                livroEncontrado.setQuantidadeEstoque(livroEncontrado.getQuantidadeEstoque() - 1);
                System.out.println(livroEncontrado);
            } else {
                System.out.println("Estoque esgotado");
            }
        }
    }


}
