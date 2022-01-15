package ru.andersen.app.user_patterns.anton.decorator;

public abstract class CarDecorator implements Car{

    protected Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }
    public abstract void operation();

}
