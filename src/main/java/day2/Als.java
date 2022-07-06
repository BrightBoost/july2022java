package day2;

public class Als {
    public double bepaalPrijs(boolean museumkaart, int age, double standaardPrijs, boolean student){
        if(museumkaart || age < 4) {
            System.out.println("Toegang gratis");
            return 0;
        } else if(age >= 4 && age < 12) {
            System.out.println("Toegang " + 0.5 * standaardPrijs);
            return 0.5 * standaardPrijs;
        } else if(age >= 12 && age < 65) {
            System.out.println("Toegang " + standaardPrijs);
            return standaardPrijs;
        } else if(age >= 65 || student) {
            System.out.println("Toegang " + 0.7 * standaardPrijs);
            return 0.7 *standaardPrijs;
        }

        return 0;

    }
    public static void main(String[] args) {
        // ticket prijs bepalen
        int age = 54;
        boolean student = true;
        boolean museumkaart = true;
        double standaardPrijs = 10;

        if(museumkaart || age < 4) {
            System.out.println("Toegang gratis");
        } else if(age >= 4 && age < 12) {
            System.out.println("Toegang " + 0.5 * standaardPrijs);
        } else if(age >= 12 && age < 65) {
            System.out.println("Toegang " + standaardPrijs);
        } else if(age >= 65 || student) {
            System.out.println("Toegang " + 0.7 * standaardPrijs);
        }

        if(museumkaart || age < 4) {
            System.out.println("Toegang gratis");
        }
        if(!museumkaart && age >= 4 && age < 12) {
            System.out.println("Toegang " + 0.5 * standaardPrijs);
        }
        if(!museumkaart && age >= 12 && age < 65) {
            System.out.println("Toegang " + standaardPrijs);
        }
        if(!museumkaart && age >= 65 || student) {
            System.out.println("Toegang " + 0.7 * standaardPrijs);
        }


        // objecten vergelijken
    }
}
