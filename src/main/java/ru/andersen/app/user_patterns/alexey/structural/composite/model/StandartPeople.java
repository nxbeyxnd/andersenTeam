package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

import java.util.ArrayList;
import java.util.List;

public abstract class StandartPeople implements People {
    private int aqe;
    private int classNumber;
    private String name;
    private List<People> myClass = new ArrayList<>();

    public int getAqe() {
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

    public List<People> getMyClass() {
        return myClass;
    }

    public void addToClass(People people){
        myClass.add(people);
    }

}
