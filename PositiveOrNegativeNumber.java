public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int Numbers[] = { 54, -32, -65 };
        int positive = 0;
        int negative = 0;
        // System.out.println(Numbers[0]);
        if (Numbers[0] > 0) {
            positive++;
            System.out.println(Numbers[0]);
        } else {
            negative++;
        }
        if (Numbers[1] > 0) {
            positive++;
            System.out.println(Numbers[1]);
        } else {
            negative++;
        }
        if (Numbers[2] > 0) {
            positive++;
            System.out.println(Numbers[2]);
        } else {
            negative++;
        }
        System.out.println(positive);
        System.out.println(negative);
    }
}