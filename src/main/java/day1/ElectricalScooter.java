package day1;

public class ElectricalScooter extends Vehicle {
    private boolean dangerous = true;

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public void sayVroom() {
        System.out.println("zjoef zoef");
    }

    public void sayVroom(String s, int i) {
        System.out.println("zjoef zjoef");
    }

    public void sayVroom(int hoi, String s) {
        System.out.println("zjoef zjoef");
    }
}
