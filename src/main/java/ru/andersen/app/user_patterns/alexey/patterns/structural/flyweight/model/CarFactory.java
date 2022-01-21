package ru.andersen.app.user_patterns.alexey.patterns.structural.flyweight.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.flyweight.model
*/

import java.util.HashMap;

public class CarFactory {
    public static final HashMap<String, Car> road = new HashMap<>();

    public Car getCarByBrand(String carBrand) {
        Car car = road.get(carBrand);

        if (car == null) {
            switch (carBrand) {
                case "Audi":
                    System.out.println("creating Audi");
                    car = new SportCar();
                    break;
                case "KAMAZ":
                    System.out.println("creating Kamaz");
                    car = new Truck();
                    break;
                case "BMW":
                    System.out.println("creating BMW");
                    car = new Hatchback();
                    break;
            }
            road.put(carBrand, car);
        }
        return car;
    }
}
