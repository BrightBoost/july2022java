package day4;

public class Dier {
    public Dier(String naam) {
        // blabla
        this.naam = naam;
    }

    public Dier() {
        this("max");
    }

    private String naam;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
