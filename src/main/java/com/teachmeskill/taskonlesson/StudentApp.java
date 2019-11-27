package com.teachmeskill.taskonlesson;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
        Student firstStudent = new Student(1, "Иван", "технологический", 19);
        Student secondStudent = new Student(2, "Алеся", "экономический", 44);
        Student thirdStudent = new Student (3,"Алексей","юридический",21);

        List<Student> university = new ArrayList<>();
        university.add(firstStudent);
        university.add(secondStudent);
        university.add(thirdStudent);

//        for(Student array : university){
//            System.out.println(array);
//        }

        //university.forEach(System.out::println);
        AgeStudentComporator ageStudentComporator = new AgeStudentComporator();
        university.sort(ageStudentComporator);
        university.forEach(System.out::println);

    }
}
