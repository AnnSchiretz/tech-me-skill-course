public class RoundingTheNumber {
    public static void main(String[] args) {
        double num = 87.859;
        rouding(num);
    }

    public static void rouding(double num) {

        System.out.println((double) Math.round(num * 100d) / 100d);
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
    }
}