public class WeekendOrWorkDayApp {
    public static void main(String[] args) {
        int daysWeek[] = { 1, 2, 3, 4, 5, 6, 7 };

        switch (daysWeek[8]) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("It`s work day!");
            break;
        case 6:
        case 7:
            System.out.println("It`s day off!");
            break;
        default:
            System.out.println("You have entered the wrong day of the week!");
        }
    }
}