import java.util.Scanner;

public class NextNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число : ");

        if (scan.hasNextInt()){
            System.out.println("Вы ввели число");
        } else {
            System.out.println("Введите число!!");
        }
    }
}