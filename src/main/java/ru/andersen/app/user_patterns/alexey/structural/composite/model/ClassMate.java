package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

public class ClassMate extends StandardPeople {
    private int aqe;
    private int classNubmer;
    private String name;


    public ClassMate(int aqe, int classNubmer, String name) {
        this.aqe = aqe;
        this.classNubmer = classNubmer;
        this.name = name;
    }

    @Override
    public int getAge() {
        return aqe;
    }

    @Override
    public int getClassNumber() {
        return classNubmer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ClassMate{" +
                "aqe=" + aqe +
                ", classNubmer=" + classNubmer +
                ", name='" + name + '\'' +
                '}';
    }
}
