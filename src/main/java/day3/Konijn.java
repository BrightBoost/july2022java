package day3;

public class Konijn extends Dier implements Prooidier, Aaibaar {
    @Override
    public void eten(String voedsel) {
        System.out.println("Konijn eet " + voedsel);
    }

    @Override
    public void hide() {
        System.out.println("Snel het konijnenhol in");
    }

    @Override
    public void aai() {
        System.out.println("Aai konijn");
    }
}
