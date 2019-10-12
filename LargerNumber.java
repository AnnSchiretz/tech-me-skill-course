public class LargerNumber {
    public static void main(String[] args) {
        byte x = 67;
        byte u = 88;
        if (x > u) {
            System.out.println("This number" + " " + x + " " + "more bigger");
        } else if (u > x) {
            System.out.println("This number" + " " + u + " " + "more bigger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}