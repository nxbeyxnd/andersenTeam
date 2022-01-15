package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

import java.util.ArrayList;
import java.util.List;

public class Director extends StandartPeople{
    private int aqe;
    private String name;
    List<People> teachers;

    public Director(int aqe, String name) {
        this.aqe = aqe;
        this.name = name;
        this.teachers = new ArrayList<>();
    }

    public void addPeople(People people){
        teachers.add(people);
    }

    public List<People> getPeople(){
        return teachers;
    }

    @Override
    public int getAge() {
        return aqe;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "aqe=" + aqe +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
