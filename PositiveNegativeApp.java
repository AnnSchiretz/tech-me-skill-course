public class PositiveNegativeApp {
    public static void main(String[] agrs) {
        int number1 = 40;
        int number2 = -32;
        int number3 = 0;

        if (number1 > 0) {
            number1++;
        }
        if (number2 < 0) {
            number2 = number2 - 2;
        }
        if (number3 == 0){
              number3 = 10;
        }
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}