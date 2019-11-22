package com.teachmeskill.taskonlesson;

public class StrBufferApp {
    public static void main(String[] args) {
        StringBuffer myStr = new StringBuffer("wait for winter");
        System.out.println(myStr);
        System.out.println(myStr.reverse());
        reverse("wait for winter");

    }

    public static void reverse(String string) {
        string.trim();
        char[] charArray = string.toCharArray();
        System.out.println(charArray);
        String[] stringArray = new String[charArray.length];
        char j = 1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            stringArray[i] = String.valueOf(charArray[j]);
            System.out.print(charArray[i]);
        }
    }
}
