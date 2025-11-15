import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite alguma coisa ai");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("qual o ano dessa bodega?");
        int anoDElancamento = leitura.nextInt();
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDElancamento);
        System.out.println(avaliacao);
        

    }
}
