package aprendendo;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        long resultadoFatorial = 1;
        Scanner leitura = new Scanner(System.in);
        System.out.println("impar ou par. digite um valo inteiro. ex:1");
        System.out.println("pressione a tecla Enter para confirmar");
        int valor1 = leitura.nextInt();



        for (int cont = 1; cont <= valor1; cont++){
            resultadoFatorial = resultadoFatorial * cont;
        }

        System.out.println("o fatorial de "+valor1+" é "+resultadoFatorial);

    }
}
