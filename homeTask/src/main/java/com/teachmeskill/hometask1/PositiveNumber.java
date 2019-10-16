public class PositiveNumber {
    public static void main(String[] agrs) {
        int numbers[] = { 67, 99, -5 };
        int positiveNum = 0;


        if (numbers[0] > 0) {
            positiveNum++;
        }
        if (numbers[1] > 0) {
            positiveNum++;
        }
        if (numbers[2] > 0) {
           positiveNum++;
        }
        System.out.println(positiveNum);
    }
}