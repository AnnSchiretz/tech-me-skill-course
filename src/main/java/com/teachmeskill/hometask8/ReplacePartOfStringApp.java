package com.teachmeskill.hometask8;

public class ReplacePartOfStringApp {
    public static void main(String[] args) {
        String myStr = "Polymorphism is the ability of an object to take on many forms. " +
                "The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. " +
                "Any Java object that can pass more than one IS-A test is considered to be polymorphic.";
        String regex = "object";
        String replasment = "obj";
        String myResult = replaseStr(myStr, regex, replasment);
        System.out.println("Результат : " + myResult);
    }

    public static String replaseStr(String string, String regex, String replasment) {
        System.out.println("Начальная строка : " + string);
        String newResult = string.replaceAll(regex, replasment);
        return newResult;
    }
}
