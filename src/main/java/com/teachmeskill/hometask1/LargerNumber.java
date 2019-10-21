public class LargerNumber {
    public static void main(String[] args) {
        byte number1 = 67;
        byte number2 = 88;
        if (number1 > number2 ) {
            System.out.println("This number " + number1 + " more bigger");
        } else if (number2 > number1 ) {
            System.out.println("This number " + number2 + " more bigger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}