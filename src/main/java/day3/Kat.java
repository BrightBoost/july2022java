package day3;

public class Kat extends Dier implements Aaibaar {
    @Override
    public void eten(String voedsel) {
        System.out.println("Kat eet " + voedsel);
    }

    @Override
    public void aai() {
        System.out.println("Miauw aai");
    }

    @Override
    public void ontvangAai(String s) {
        System.out.println("Kat ontvangt aai");
    }
}
