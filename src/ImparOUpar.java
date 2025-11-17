import java.util.Scanner;

public class ImparOUpar {
    public static void main(String[] args) {
        /// verifique se o numero é impar ou par
        Scanner leitura = new Scanner(System.in);
        System.out.println("impar ou par. digite um valo inteiro. ex:1");
        System.out.println("pressione a tecla Enter para confirmar");
        int valor1 = leitura.nextInt();
        /**

        public static boolean eValeStringInteiroPuro(String   input;
        input) {
            if (input == null || input.trim().isEmpty()) {
                return false;
            }

            // 1. Tenta parsear como Double para garantir que a string representa um número.
            // Isso elimina inputs como "abc" ou "12.3.4".
            try {
                Double.parseDouble(input);
            } catch (NumberFormatException e) {
                return false; // Não é um número válido.
            }

            // 2. Se a String é um número válido, verifica se o formato corresponde
            // EXATAMENTE a um inteiro: um ou mais dígitos, com um sinal opcional.
            // Padrão: [+-]? (Sinal opcional) seguido por \d+ (Um ou mais dígitos)
            // Este Regex é a chave para excluir "42.0" e "1e2", que são Doubles válidos.
            return input.matches("[+-]?\\d+");
        }
         **/



        if (valor1 % 2 == 0)
        {
            System.out.println("o numero digitado é par");
        } else {
            System.out.println("o numero é impar");
        }
        
    }
}
