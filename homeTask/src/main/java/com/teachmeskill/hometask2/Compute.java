public class Compute {
    public static void main(String[] args) {
        int sum = getSum(256);
        int nextSum = getSum(512);
        System.out.println(sum);
        System.out.println(nextSum);
    }

    private static int getSum(int limit) {
        int num = 1;
        int sum = 0;
        while (num <= limit) {
            sum += num;
            num *= 2;
        }
        return sum;
    }
}