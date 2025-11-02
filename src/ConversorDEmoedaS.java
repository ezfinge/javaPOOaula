/**Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
 * Considere que o valor de 1 dólar é equivalente a 4.94 reais.
 * Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 * saida no main:
 *      System.out.printf("Valor em Reais: R$ %.2f%n", reais);
 */

public class ConversorDEmoedaS {

    public double dolarPARAreais(double real, double dolar){
        return real / dolar;
    }

    public double reaisPARAdolar(double cotacao, double dolar){
        return dolar * cotacao;
    }
}
