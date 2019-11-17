package com.teachmeskill.hometask7.Magazine;

import java.util.Arrays;

public class Book implements Printout {

    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printBooks(Printout[] array) {
        for (Printout printout : array) {
            if (printout instanceof Book) {
                Book book = (Book) printout;
                System.out.println(book.name);
            }
        }
    }
}
