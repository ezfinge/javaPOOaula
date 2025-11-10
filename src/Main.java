//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("filme qualquer");
        
        int anoDElancamento = 2022;
        System.out.println("ano qualquer: " + anoDElancamento);
        boolean incluidoNOplano = true;
        double notaDOfilme = 8.1;
        
    /**
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("media: " + media%2);
        String sinopse = """filme de sessao da tarde, pastelao""" + anoDElancamento;
        System.out.printf(sinopse);

        int classificacao = (int) (media /2);
        System.out.println("classificacao: " + classificacao);

    **/

        /**
             * % seguido de uma letra que indica o tipo de
             * dado que será inserido no placeholder.
             * Por exemplo, %s indica que uma String será
             * inserida no placeholder, %d indica um valor inteiro
             * e %f indica um valor de ponto flutuante.
             * Vamos ver um exemplo:

                 String nome = "Maria";
                 int idade = 30;
                 double valor = 55.9999;
                 System.out.println(String.format(
                    "Meu nome é %s, eu tenho %d anos e
                    hoje gastei %.2f reais", nome, idade, valor));

         */

        /**
         * String.format também pode ser usado com Text Block
         *
         *
         *String nome = "João";
         *int aulas = 4;
         *
         * String mensagem = """
         *                   Olá, %s!
         *                   Boas vindas ao curso de Java.
         *                   Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
         *                   """.formatted(nome, aulas);
         *
         * System.out.println(mensagem);
         *
         */

    }
}