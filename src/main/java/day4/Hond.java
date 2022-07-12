package day4;

public class Hond {
    private String geluid;
    private String naam;
    private String kleur;
    private double gehoorzaamheidsPercentage;
    private double gewicht;
    public static double gemiddeldHondenGewicht = 12;

    public void blaffen(int aantal) {
        for(int i = 0; i < aantal; i++) {
            System.out.println(this.geluid);
        }
    }

    public void eten(String voedsel) {
        System.out.println(this.naam + " eet " + voedsel);
    }

    public void zitten() {
        if(Math.random() < gehoorzaamheidsPercentage) {
            System.out.println(naam + " zit");
        } else {
            System.out.println(naam + " zit niet");
        }
    }

    public static void wijsZoneAan() {
        System.out.println("mensen vergaderen....");
        System.out.println(gemiddeldHondenGewicht);
    }

    public String getGeluid() {
        return geluid;
    }

    public void setGeluid(String geluid) {
        this.geluid = geluid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public double getGehoorzaamheidsPercentage() {
        return gehoorzaamheidsPercentage;
    }

    public void setGehoorzaamheidsPercentage(double gehoorzaamheidsPercentage) {
        this.gehoorzaamheidsPercentage = gehoorzaamheidsPercentage;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public static double getGemiddeldHondenGewicht() {
        return gemiddeldHondenGewicht;
    }

    public static void setGemiddeldHondenGewicht(double gemiddeldHondenGewicht) {
        Hond.gemiddeldHondenGewicht = gemiddeldHondenGewicht;
    }
}
