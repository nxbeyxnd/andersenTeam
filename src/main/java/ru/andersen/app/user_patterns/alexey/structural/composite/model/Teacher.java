package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

import java.util.ArrayList;
import java.util.List;

public class Teacher extends StandartPeople{
    private int aqe;
    private int classNumber;
    private String name;
    private List<People> myClass;

    public Teacher(int aqe, int classNumber, String name) {
        this.aqe = aqe;
        this.classNumber = classNumber;
        this.name = name;
        this.myClass = new ArrayList<>();
    }

    public List<People> getMyClass() {
        return myClass;
    }

    public void addToClass(People people){
        myClass.add(people);
    }

    @Override
    public int getAge() {
        return aqe;
    }

    @Override
    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "aqe=" + aqe +
                ", classNumber=" + classNumber +
                ", name='" + name + '\'' +
                ", myClass=" + myClass +
                '}';
    }
}
