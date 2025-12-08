package pratica.moeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.println("50 reais em dólares: " + conversor.reaisPARAdolar(50));
        System.out.println("10 dólares em reais: " + conversor.converterDolarParaReal(10));
    }
}
