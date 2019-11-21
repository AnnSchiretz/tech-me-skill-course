package com.teachmeskill.taskonlesson;

public class StrBufferApp {
    public static void main(String[] args) {
        StringBuffer myStr = new StringBuffer("wait for winter");
        System.out.println(myStr);
        System.out.println(myStr.reverse());
        reverse("wait for winter");

    }
    public static void reverse (String string){
        string.trim();
        char[] myChar = string.toCharArray();
        System.out.println(myChar);
        String[] sArray = new String[myChar.length];
        char j = 1;
        for (int  i = myChar.length - 1; i >= 0; i --){
            sArray[i] = String.valueOf(myChar[j]);
            System.out.print(myChar[i]);
        }
    }
}
