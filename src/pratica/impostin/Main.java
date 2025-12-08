package pratica.impostin;

//Crie uma interface Calculavel com um método double calcularPrecoFinal().
// Implemente essa interface nas classes Livro e ProdutoFisico,
// cada uma retornando o preço final considerando descontos ou taxas adicionais.

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(100.0, 10.0); // 10% de desconto
        ProdutoFisico produto = new ProdutoFisico(200.0, 5.0); // 5% de taxa extra

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
}