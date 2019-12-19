public class SumDistanceSportmanApp {
    public static void main(String[] args) {
        double distance = 10.0;
        double increase = 0.1;
        double totalAmount = getTotalDistance(distance, increase);
        System.out.println(totalAmount);
    }
    public static double getTotalDistance (double distance, double increase) {
        double sum = 0;
        for (int day = 0; day < 7; day++) {
            sum += distance;
            sum = Math.round(sum * 100d)/ 100d;
            distance = Math.round(distance * 100d) / 100d;
            distance += (distance * increase);
        }
        return sum;
    }
}