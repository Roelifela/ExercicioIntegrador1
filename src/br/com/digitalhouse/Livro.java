package br.com.digitalhouse;

public class Livro {

    public int codigo;
    public String titulo;
    public String autor;
    public String anoLançamento;
    public String codigoISBN;
    public int quantidadeEstoque;
    public double preco;

    public Livro(int codigo, String titulo, String autor, String anoLançamento, String codigoISBN, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLançamento = anoLançamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "'\n'Livro{" +
                "codigo=" + codigo + '\n' +
                ", titulo='" + titulo + '\n' +
                ", autor='" + autor + '\n' +
                ", anoLançamento='" + anoLançamento + '\n' +
                ", codigoISBN='" + codigoISBN + '\n' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(String anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
