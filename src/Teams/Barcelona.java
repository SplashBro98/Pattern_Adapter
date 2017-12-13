package Teams;

public class Barcelona implements La_Liga {
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

    public Barcelona(String name, int trophies) {
        this.name = name;
        this.trophies = trophies;
    }

    @Override
    public void Primera() {
        System.out.println("I took part in a Primera_League");
    }

    @Override
    public void King_Trophy() {
        System.out.println("I took part in a King_Trophy");
    }
}
