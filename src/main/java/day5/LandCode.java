package day5;

public enum LandCode {
    NL(1), BE(2), DE(3), CZ(4), FR(5);

    private int nr;

    public int getNr() {
        return nr;
    }

    private LandCode(int nr) {
        this.nr = nr;
    }
}
