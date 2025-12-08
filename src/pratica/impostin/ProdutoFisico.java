package pratica.impostin;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * taxaExtra / 100);
    }
    private double precoBase;
    private double taxaExtra; // em %

    public ProdutoFisico(double precoBase, double taxaExtra) {
        this.precoBase = precoBase;
        this.taxaExtra = taxaExtra;
    }

}
