package pratica.moeda;

/**Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
 * Considere que o valor de 1 dólar é equivalente a 4.94 reais.
 * Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 * saida no main:
 *      System.out.printf("Valor em Reais: R$ %.2f%n", reais);
 */





public class ConversorMoeda implements ConversaoFinanceira {

    // Converte reais para dólares
    public double reaisPARAdolar(double reais) {
        double cotacao = 5.00; // 1 dólar = 5 reais
        return reais / cotacao;
    }

    // Converte dólares para reais
    @Override
    public double converterDolarParaReal(double dolar) {
        double cotacao = 5.00;
        return dolar * cotacao;
    }
}
