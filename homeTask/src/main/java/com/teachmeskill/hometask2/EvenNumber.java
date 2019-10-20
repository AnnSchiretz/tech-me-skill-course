public class EvenNumber {
    public static void main(String[] args) {
        int num = 1;
        do {
            num++;
            System.out.println(num);
            if (num++ % 2 == 0) {
                continue;
            }
        } while (num <= 100);

    }
}