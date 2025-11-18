public class Condicional
{
    public static void main(String[] args)
    {
        int anoDElancamento = 2022;
        boolean incluidoNOplano = false;
        double notaDOfilme = 8.1;
        String tipoPlano = "plus";


        if(anoDElancamento >= 2022)
        {
            System.out.println("lançamento que os clientes estão curtindo!");
        }else
        {
            System.out.println("filme retro que vale a pena assistir!");
        }

        if(incluidoNOplano == true && tipoPlano.equals("plus")) {
            System.out.println("filme liberado.");
        }else{
            System.out.println("pague.");
        }

    }
}

