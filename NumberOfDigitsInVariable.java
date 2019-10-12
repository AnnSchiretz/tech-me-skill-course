public class NumberOfDigitsInVariable {
    public static void main(String[] args) {
        byte myNum = -122;
        if (myNum < -1) {
            System.out.println("My number negative");
        } else if (myNum >= 0) {
            System.out.println("My number positive or my number 0");
        } else {
            System.out.println("BUGS IN MY CODE!");
        }
        byte numeral = 2;
        numeralInMyNumber(numeral, myNum);

    }

    public static void numeralInMyNumber(byte numeral, byte myNum) {
        if (numeral >= 1) {
            System.out.println("This is my number :" + myNum);
        } else {
            System.out.println("This is not my number!");
        }
    }

}