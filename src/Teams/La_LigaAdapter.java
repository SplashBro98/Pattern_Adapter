package Teams;

public class La_LigaAdapter implements English_League {
    private La_Liga la_liga;

    public La_LigaAdapter(La_Liga la_liga) {
        this.la_liga = la_liga;
    }

    @Override
    public void Fa_Cup() {
        la_liga.King_Trophy();
    }

    @Override
    public void Capital_One_Cup() {
        la_liga.King_Trophy();
    }

    @Override
    public void Barclays_PL() {
        la_liga.Primera();
    }
}
