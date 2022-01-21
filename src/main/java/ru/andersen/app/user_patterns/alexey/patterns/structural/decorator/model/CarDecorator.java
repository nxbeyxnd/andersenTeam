package ru.andersen.app.user_patterns.alexey.patterns.structural.decorator.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.decorator.model
*/

public abstract class CarDecorator implements Car{
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String add() {
        return car.add();
    }
}
