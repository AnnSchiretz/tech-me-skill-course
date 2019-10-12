public class AdditionalTask {
    public static void main(String[] agrs) {

        String[] endingWord = { "программист", "программиста", "программистов" };
        int countProgrammer[] = { 1, 3, 6 };
        int options = 1;

        switch (options) {
        case 1:
            System.out.println(countProgrammer[0] + " " + endingWord[0]);
            break;
        case 2:
            System.out.println(countProgrammer[1] + " " + endingWord[1]);
            break;
        case 3:
            System.out.println(countProgrammer[2] + " " + endingWord[2]);
            break;
        }

        System.out.println("Применился" + " " + options + " " + "кейс");
    }

}
