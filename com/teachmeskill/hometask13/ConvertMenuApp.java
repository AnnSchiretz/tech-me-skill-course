package com.teachmeskill.hometask13;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class ConvertMenuApp {
    public static void main(String[] args) throws FileNotFoundException {
        Gson g = new Gson();
        Menu[] m = g.fromJson(new FileReader("/Users/annschirets/IdeaProjects/teach-me-skill/src/main/java/com/teachmeskill/hometask13/menu.json"), Menu[].class);
        System.out.print(Arrays.toString(m));
    }
}