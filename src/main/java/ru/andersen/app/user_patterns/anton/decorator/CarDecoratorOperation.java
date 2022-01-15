package ru.andersen.app.user_patterns.anton.decorator;

public class CarDecoratorOperation extends CarDecorator{
    public CarDecoratorOperation(Car car) {
        super(car);
    }
    @Override
    public void operation() {
        car.operation();
        System.out.println("Upgraded");
    }
}
