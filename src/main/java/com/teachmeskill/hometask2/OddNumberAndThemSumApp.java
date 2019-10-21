public class OddNumberAndThemSumApp {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        do {
            sum += num++;
            if (num % 2 != 0) {
                System.out.println(num++);
                continue;
            }
        } while (num <= 99);
        System.out.println(sum);
    }
}