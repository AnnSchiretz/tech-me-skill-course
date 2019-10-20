public class NumberMin {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 76;
        System.out.println(Math.min(num1, num2));
        printNextMin();
    }

    public static void printNextMin() {
        double num1 = 67.00;
        double num2 = 56.99;
        double result = num1 > num2 ? num1 : num2;
        System.out.println(result);
    }
}