import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(11); // 0 até 10
        int tentativa;
        int contador = 5;

        System.out.println("Joguinho do número secreto. Você tem 5 tentativas!");

        while (contador > 0) {
            System.out.println("Digite um número de 0 até 10: ");
            tentativa = leitura.nextInt();

            if (tentativa >= 0 && tentativa <= 10) {
                if (tentativa == numeroSecreto) {
                    System.out.println("Você acertou o número secreto: " + numeroSecreto +
                            " em " + (6 - contador) + " tentativa(s). Parabéns!");
                    break;
                } else if (tentativa < numeroSecreto) {
                    System.out.println("O número secreto é maior...");
                } else {
                    System.out.println("O número secreto é menor...");
                }
                contador--;
                System.out.println("Você ainda tem " + contador + " tentativa(s).");
            } else {
                System.out.println("É de 0 até 10, caraio!");
            }

            if (contador == 0) {
                System.out.println("Tentativas esgotadas. O número secreto era: " + numeroSecreto);
            }
        }
    }
}