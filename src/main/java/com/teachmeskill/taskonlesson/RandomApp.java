public class RandomApp {
    public static void main(String[] args) {

        int num = (int) (6 + (Math.random() * 18));
        System.out.println(num);

        int num2 = (int) (-100 + (Math.random()* (100 + 100)));
        System.out.println(num2);
    }

}