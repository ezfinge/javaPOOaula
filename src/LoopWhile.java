import java.util.Scanner;

public class LoopWhile
{
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int contador = 0;

        while(nota != -1){

            System.out.println("Digite o valor da nota ou -1 para encerrar. (confirme no enter): ");
            nota = leitura.nextDouble();

            if(nota != -1)
            {
                mediaAvaliacao += nota;

                contador++;
            }
        }

        System.out.println("media avaliacao: " + mediaAvaliacao/contador);

    }
}
