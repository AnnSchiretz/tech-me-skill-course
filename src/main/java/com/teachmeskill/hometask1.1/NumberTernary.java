public class NumberTernary {
    public static void main(String[] args) {
        int x = 10;
        String message = x % 2 == 0 ? "Четное число" : "Нечетное число";
        System.out.println(message);

        int y = 55;
        String message1 = y % 2 != 0 ? "Нечетное число" : "Четное число";
        System.out.println(message1);
    }
}