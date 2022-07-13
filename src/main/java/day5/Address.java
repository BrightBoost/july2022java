package day5;

public class Address {
    private String straat;
    private String plaats;
    private String nummer;
    private LandCode landCode;

    public Address(String straat, String plaats, String nummer, LandCode landCode) {
        this.straat = straat;
        this.plaats = plaats;
        this.nummer = nummer;
        this.landCode = landCode;
    }

    public Address() {
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public LandCode getLandCode() {
        return landCode;
    }

    public void setLandCode(LandCode landCode) {
        this.landCode = landCode;
    }
}
