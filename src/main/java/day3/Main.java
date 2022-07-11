package day3;

public class Main {
    public static void main(String[] args) {
        Dier felix = new Kat();
        felix.eten("verantwoord eten");

        Konijn witje = new Konijn();
        witje.ontvangAai("Kriebel");

        TestVals testVals = new TestVals() {
            @Override
            public boolean testValsheid(Dier dier) {
                if(dier.getKleur().equals("rood")) {
                    return true;
                }
                return false;
            }
        };
    }
}
