package com.teachmeskill.hometask7.Magazine;

public class Book implements Printer {

    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printBooks(Printer[] array) {
        for (Printer printout : array) {
            if (printout instanceof Book) {
                Book book = (Book) printout;
                System.out.println(book.name);
            }
        }
    }
}
