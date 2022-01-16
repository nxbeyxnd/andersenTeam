package ru.andersen.app.user_patterns.alexey.structural.composite;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite 
*/

import ru.andersen.app.user_patterns.alexey.structural.composite.model.*;

public class CompositeMain {
    public static void main(String[] args) {
        Director director = new Director(40, "Antonina");

        StandardPeople teacher = new Teacher(20, 10, "Tamara");

        StandardPeople people = new ClassMate(1,10, "test");
        StandardPeople people1 = new ClassMate(1,10, "test");
        StandardPeople people2 = new ClassMate(1,10, "test");
        StandardPeople people3 = new ClassMate(1,10, "test");
        StandardPeople people4 = new ClassMate(1,10, "test");

        teacher.addToClass(people);
        teacher.addToClass(people1);
        teacher.addToClass(people2);
        teacher.addToClass(people3);
        teacher.addToClass(people4);

        director.addPeople(teacher);

        System.out.println(director);
    }
}
