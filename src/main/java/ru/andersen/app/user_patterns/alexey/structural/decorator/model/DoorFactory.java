package ru.andersen.app.user_patterns.alexey.structural.decorator.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.decorator.model 
*/

public class DoorFactory extends CarDecorator{
    public DoorFactory(Car car) {
        super(car);
    }

    public String addDoor(){
        return "Add doors\n";
    }

    @Override
    public String add() {
        return super.add() + addDoor();
    }
}
