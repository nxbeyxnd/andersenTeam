package ru.andersen.app.user_patterns.alexey.patterns.structural.decorator.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.decorator.model
*/

public class WheelsFactory extends CarDecorator{
    public WheelsFactory(Car car) {
        super(car);
    }

    public String addWheels(){
        return "Added wheels\n";
    }

    @Override
    public String add() {
        return super.add() + addWheels();
    }
}
