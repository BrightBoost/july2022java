public class Car {
    private String numberplate;
    private String color;
    private String brand;
    private int aantalWielen;
    private Engine engine;

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
