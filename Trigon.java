public class Trigon {

    public static void main(String[] args) {
        int sideA = 25;
        int sideB = 45;
        int sideC = 67;
        int totalAB = sideA + sideB;
        int totalBC = sideB + sideC;
        int totalCA = sideC + sideA;

        if (sideA < totalAB || sideB < totalBC || sideC < totalCA) {
            System.out.println("It`s trigon!");
        } else {
            System.out.println("Something went wrong!");
        }
    }

}