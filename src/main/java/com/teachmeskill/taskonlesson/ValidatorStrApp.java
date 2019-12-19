package com.teachmeskill.taskonlesson;

public class ValidatorStrApp {
    public static void main(String[] args) {
        String myString = "waiting winter";
        validationString(myString);

    }
    public static void validationString (String string){
        char mySecondStr = string.charAt(13);
        System.out.println(mySecondStr);
        boolean myValidation = string.endsWith("!!!");
        System.out.println(myValidation);
        System.out.println(string.startsWith("waiting"));
        System.out.println(string.contains("winter"));
    }
}
