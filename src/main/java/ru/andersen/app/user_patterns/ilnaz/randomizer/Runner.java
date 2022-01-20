package ru.andersen.app.user_patterns.ilnaz.randomizer;

import java.util.Scanner;
import java.util.stream.Collectors;

import static ru.andersen.app.user_patterns.ilnaz.randomizer.ListOfStudents.students;

public class Runner {
    public static void main(String[] args) {
        RandomUserApp random = new RandomUserApp();
        Scanner scanner = new Scanner(System.in);


            System.out.println("Опрос завершен");
            System.out.println(students.stream()
                    .filter(x-> x.isAnswer()&& x.isQuestion())
                    .collect(Collectors.toList()));
        }
    }
