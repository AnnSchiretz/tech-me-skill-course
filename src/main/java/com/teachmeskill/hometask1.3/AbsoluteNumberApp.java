public class AbsoluteNumberApp {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = -1;
        int num3 = -19;
        int num4 = 20;

        printModule(num1, num2, num3, num4);
    }

    public static void printModule(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Math.abs(numbers[i]));
        }
    }
}