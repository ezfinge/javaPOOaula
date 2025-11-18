import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for(int i = 0; i<3; i++ ){
            System.out.println("Digite o valor da nota: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }

        System.out.println("media avaliacao: " + mediaAvaliacao/3);
    }
}
