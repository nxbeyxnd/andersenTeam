package ru.andersen.app.user_patterns.alexey.structural.decorator;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.decorator 
*/


import ru.andersen.app.user_patterns.alexey.structural.decorator.model.Car;
import ru.andersen.app.user_patterns.alexey.structural.decorator.model.DefaultCar;
import ru.andersen.app.user_patterns.alexey.structural.decorator.model.DoorFactory;
import ru.andersen.app.user_patterns.alexey.structural.decorator.model.WheelsFactory;

public class DecoratorCli {
    public static void main(String[] args) {
        Car car = new WheelsFactory(new DoorFactory(new DefaultCar()));
        System.out.println(car.add());
    }
}
