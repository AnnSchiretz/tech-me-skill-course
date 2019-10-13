import java.io.*;

public class NumberOfDigitsInVariable {
    public static void main(String[] args) {
        int myNum = 12;

        if (myNum < -1) {
            System.out.println("My number negative");
        } else if (myNum >= 0) {
            System.out.println("My number positive or my number 0");
        } else {
            System.out.println("BUGS IN MY CODE!");
        }
        String myDigit = Integer.toString(myNum);
        System.out.println(myDigit.length());
        if (myDigit.length() <= 2) {
            System.out.println("My number two digit or simple ");
        } else if (myDigit.length() >= 3) {
            System.out.println("My number three digit or more");
        }
        System.out.println("My number: " + myNum);

    }
}