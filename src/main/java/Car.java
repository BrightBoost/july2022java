public class Car extends Vehicle {
    private String numberplate;
    private Engine engine;

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean autoPark(){
        System.out.println("beep beep");
        return true;
    }

    public String getCurrentLocation() {
        return "Ik ben hier!";
    }

    public void changeStation(double station) {
        System.out.println("Changing to " + station + "FM");
    }
}
