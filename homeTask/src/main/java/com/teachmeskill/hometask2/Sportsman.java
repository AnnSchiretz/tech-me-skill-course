public class Sportsman {
    public static void main(String[] args) {
        double distance = 10.0;
        double increase = 0.1;
        for (int day = 0; day < 7; day++) {
            distance = Math.round(distance * 100d) / 100d;
            System.out.println(distance);
            distance += distance * increase;
        }
    }
}