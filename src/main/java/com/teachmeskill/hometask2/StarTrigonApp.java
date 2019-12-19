public class StarTrigonApp {
    public static void main(String[] args) {
        for (int i = 7; i >= 0; i--) {
            for (int c = 0; c <= i; c++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}