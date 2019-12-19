public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int numbers[] = { 54, -32, -65 };
        int positive = 0;
        int negative = 0;
        // System.out.println(Numbers[0]);
        if (numbers[0] >= 0) {
            positive++;
            System.out.println(numbers[0]);
        } else {
            negative++;
        }
        if (numbers[1] >= 0) {
            positive++;
            System.out.println(numbers[1]);
        } else {
            negative++;
        }
        if (numbers[2] >= 0) {
            positive++;
            System.out.println(numbers[2]);
        } else {
            negative++;
        }
        System.out.println(positive);
        System.out.println(negative);
    }
}