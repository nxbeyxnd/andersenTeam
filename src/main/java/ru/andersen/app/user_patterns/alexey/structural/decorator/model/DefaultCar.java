package ru.andersen.app.user_patterns.alexey.structural.decorator.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.decorator.model 
*/

public class DefaultCar implements Car{
    @Override
    public String add() {
        return "created car without doors and wheels\n";
    }
}
