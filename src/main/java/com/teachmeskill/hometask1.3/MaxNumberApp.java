public class MaxNumberApp {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 154;
        System.out.println(Math.max(num1, num2));
        printNextMax();
    }

    public static void printNextMax() {
        double num1 = 23.67;
        double num2 = 23.68;

        double max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}