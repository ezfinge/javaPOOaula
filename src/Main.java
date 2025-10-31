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
        

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("media: " + media%2);
        String sinopse =
                        """filme de sessao da tarde, pastelao""" + anoDElancamento;
        System.out.printf(sinopse);

    }
}