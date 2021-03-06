package training.patterns.adapter.club;

import training.patterns.adapter.league.English_League;

public class Liverpool implements English_League {
    private String name;
    private int trophies;

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getName() {
        return name;
    }

    public Liverpool(String name, int trophies) {
        this.name = name;
        this.trophies = trophies;
    }

    @Override
    public void Fa_Cup() {
        System.out.println("I took part in a Fa_Cup");
    }

    @Override
    public void Capital_One_Cup() {
        System.out.println("I took part in a Capital_One_Cup");
    }

    @Override
    public void Barclays_PL() {
        System.out.println("I took part in a Barclays_PL");
    }
}
