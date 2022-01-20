package ru.andersen.app.user_patterns.ilnaz.randomizer;

import java.util.Scanner;
import static ru.andersen.app.user_patterns.ilnaz.randomizer.ListOfStudents.students;

public class Runner {
    public static void main(String[] args) {
        Random random = new Random();

           random.coupleRandomStudent();



        System.out.println("Опрос завершен");
        System.out.println(students);
    }
}
