public class Integer {
    public static void main(String[] agrs) {
        int number = 40;
        if (number > 0) {
            number++;
            System.out.println(number);
        } else if (number < 0) {
            number -= 2;
            System.out.println(number);
        } else {
            number = 10;
            System.out.println(number);
        }
    }
}