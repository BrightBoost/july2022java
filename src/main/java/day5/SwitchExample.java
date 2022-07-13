package day5;

public class SwitchExample {
    public static void main(String[] args) {
        LandCode lc = LandCode.CZ;
        if (lc == LandCode.BE) {
            System.out.println("BE");
        } else if (lc == LandCode.CZ) {
            System.out.println("CZ");
        } else if (lc == LandCode.DE) {
            System.out.println("DE");
        } else if (lc == LandCode.NL) {
            System.out.println("NL");
        } else if (lc == LandCode.FR) {
            System.out.println("FR");
        } else {
            System.out.println("Ander verhaal");
        }

        switch (lc) {
            case BE:
                System.out.println("BE");
                break;
            case CZ:
                System.out.println("CZ");
                break;
            case FR:
                System.out.println("FR");
                break;
            case DE:
                System.out.println("DE");
                break;
            case NL:
                System.out.println("NL");
                break;
            default:
                System.out.println("Ander verhaal");
                break;

        }

        LandCode newLc;
        String landCode = "NL";
        switch (landCode) {
            case "DE":
                newLc = LandCode.DE;
                break;
            case "NL":
                newLc = LandCode.NL;
                break;
            case "CZ":
                newLc = LandCode.CZ;
                break;
            default:
                newLc = LandCode.FR;
                break;
        }

        System.out.println(newLc);

        Grades grade = null;
        int cijfer = 6;
        switch (cijfer) {
            case 1:
            case 2:
            case 3:
            case 4:
                grade = Grades.F;
                System.out.println("slecht gedaan");
                break;
            case 5:
                grade = Grades.D;
                System.out.println("Ahh net niet");
                break;
            case 6:
                grade = Grades.C;
                System.out.println("Zo zo");
                break;
            case 7:
                grade = Grades.B;
                System.out.println("Netjes");
                break;
            case 8:
            case 9:
            case 10:
                grade = Grades.A;
                System.out.println("Fantastisch");
                break;
            default:
                System.out.println("Wat?");
//                grade = Grades.F;
        }

        System.out.println(grade);

    }
}
