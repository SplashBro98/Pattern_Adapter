package Teams;

public class English_LeagueAdapter implements La_Liga {
    private English_League english_league;

    public English_LeagueAdapter(English_League english_league) {
        this.english_league = english_league;
    }

    @Override
    public void Primera() {
        english_league.Barclays_PL();
    }

    @Override
    public void King_Trophy() {
        english_league.Fa_Cup();
        english_league.Capital_One_Cup();
    }
}
