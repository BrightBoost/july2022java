public class ElectricalScooter extends Vehicle {
    private boolean dangerous = true;

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    @Override
    public void sayVroom() {
        System.out.println("zjoef zjoef");
    }
}
