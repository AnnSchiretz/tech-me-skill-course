import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        System.out.println("введите строку");
        String str1 = scan.nextLine();
        str1 = scan.nextLine();
        String sum1= str1;

        System.out.println("вы ввели строки " + sum1);
    }
}