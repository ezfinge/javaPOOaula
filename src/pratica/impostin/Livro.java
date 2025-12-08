package pratica.impostin;

public class Livro implements Calculavel {

    private String titulo;
    private String descricao;
    private String autor;
    private int quantidade;
    private double desconto;
    private double precoBase;

    public Livro(double precoBase, double desconto) {
        this.precoBase = precoBase;
        this.desconto = desconto;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return precoBase;
    }

    public void setPreco(double preco) {
        this.precoBase = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * desconto / 100);
    }
}
