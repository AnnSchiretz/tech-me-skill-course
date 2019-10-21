public class MultiplicationApp {
    public static void main(String[] args) {
        int a = 16;
        int b = 55;
        int total = multiplication(a, b);
        System.out.println(total);
    }

    public static int multiplication(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}