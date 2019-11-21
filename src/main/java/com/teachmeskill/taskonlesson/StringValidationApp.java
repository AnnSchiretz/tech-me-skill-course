package com.teachmeskill.taskonlesson;

import java.util.Scanner;

public class StringValidationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");
        String userStr = scan.nextLine();
        userStr = userStr.trim();
        int indexNumber = 0;
        if(userStr.isEmpty() || indexNumber != -1){
            indexNumber = userStr.indexOf("я");
            System.out.println(indexNumber);
        }



    }
}
