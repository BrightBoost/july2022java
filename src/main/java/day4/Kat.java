package day4;

public class Kat extends Dier {
    private int aantalSnorharen;

    public Kat(int aantalSnorharen, String naam) {
        // blabla
        super(naam);
        this.aantalSnorharen = aantalSnorharen;
    }

    public int getAantalSnorharen() {
        return aantalSnorharen;
    }

    public void setAantalSnorharen(int aantalSnorharen) {
        this.aantalSnorharen = aantalSnorharen;
    }
}
