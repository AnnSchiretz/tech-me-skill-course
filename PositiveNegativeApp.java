public class PositiveNegativeApp {
    public static void main(String[] agrs) {
        int number1 = 40;

        if (number1 >= 0) {
            number1++;
        } else if (number1 < 0) {
            number1 = number1 - 2;
        } else {
            number1 = 10;
        }
        System.out.println(number1);

    }
}