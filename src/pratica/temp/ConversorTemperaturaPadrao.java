///Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
///  Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

package pratica.temp;

import java.util.Locale;

public class ConversorTemperaturaPadrao implements ConversorTemp {

    private double celsiusTemperatura ;
    private double farenheitTemperatura;

    public double getCelsiusTemperatura() {
        return celsiusTemperatura;
    }

    public void setCelsiusTemperatura(double celsiusTemperatura) {
        this.celsiusTemperatura = celsiusTemperatura;
    }

    public double getFarenheitTemperatura() {
        return farenheitTemperatura;
    }

    public void setFarenheitTemperatura(double farenheitTemperatura) {
        this.farenheitTemperatura = farenheitTemperatura;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return this.farenheitTemperatura=(getCelsiusTemperatura() * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return this.celsiusTemperatura = (getFarenheitTemperatura() - 32) / 1.8;
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        temperatura.setCelsiusTemperatura(50.9);
            System.out.printf(
                    String.format(Locale.US,

                            "Celsius: %.2f \nConvertendo para Fahrenheit ficaria: %.2fF\n",
                            temperatura.getCelsiusTemperatura(),temperatura.celsiusParaFahrenheit()
                    )
            );
        System.out.println("-------------------------------------------------------------------");

        temperatura.setFarenheitTemperatura(33.5);
        System.out.printf(
                String.format(Locale.US,

                        "Fahrenheit: %.2f \nConvertendo para Celsius ficaria: %.2fC",
                        temperatura.getFarenheitTemperatura(),
                        temperatura.fahrenheitParaCelsius()
                )
        );


    }



}
