public class DayWeek {
    
    public static void main(String[] args) {
        int daysWeek[] = {1, 2, 3, 4, 5, 6, 7};
        int day = 3;

        switch (day) {
            case 1:
                System.out.println(daysWeek[0] + " day - it`s monday");
                break;
            case 2:
                System.out.println(daysWeek[1] + " day - it`s tuesday");
                break;
            case 3:
                System.out.println(daysWeek[2] + " day it`s wednesday");
                break;
            case 4:
                System.out.println(daysWeek[3] + " day it`s tuesday");
                break;
            case 5:
                System.out.println(daysWeek[4] + " day it`s friday");
                break;
            case 6:
                System.out.println(daysWeek[5] + " day it`s saturday");
                break;
            case 7:
                System.out.println(daysWeek[6] + " day it`s sunday");
                break;
            default:
                System.out.println("You have entered the wrong day of the week!");
                break;
        }

    }
}