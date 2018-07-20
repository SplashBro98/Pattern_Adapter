package training.patterns.adapter.main;

import training.patterns.adapter.transformer.La_LigaAdapter;
import training.patterns.adapter.club.Barcelona;
import training.patterns.adapter.club.Chelsea;
import training.patterns.adapter.club.Liverpool;
import training.patterns.adapter.league.English_League;

public class Main {

    public static void main(String[] args) {
        Chelsea Fabregas = new Chelsea("Fabregas",4);
        Liverpool Lallana = new Liverpool("Lallana",5);
        Barcelona Iniesta = new Barcelona("Iniesta", 7);

        System.out.println("Cesc Fabregas satys: ");
        Fabregas.Barclays_PL();
        Fabregas.Fa_Cup();
        Fabregas.Capital_One_Cup();

        System.out.println("Adam Lallana says:");
        Lallana.Barclays_PL();
        Lallana.Fa_Cup();
        Lallana.Capital_One_Cup();

        System.out.println("Andreas Iniesta says:");
        Iniesta.Primera();
        Iniesta.King_Trophy();

        Barcelona Ibra = new Barcelona("Ibra", 3);
        English_League Ibragimovich = new La_LigaAdapter(Ibra);
        System.out.println("Zlatan Ibragimoch (Whore) says:");
        Ibragimovich.Barclays_PL();
        Ibragimovich.Fa_Cup();
        Ibragimovich.Capital_One_Cup();

    }

}
