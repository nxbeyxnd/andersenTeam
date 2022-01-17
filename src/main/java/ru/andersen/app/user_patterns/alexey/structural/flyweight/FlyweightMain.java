package ru.andersen.app.user_patterns.alexey.structural.flyweight;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.flyweight 
*/

import ru.andersen.app.user_patterns.alexey.structural.flyweight.model.Car;
import ru.andersen.app.user_patterns.alexey.structural.flyweight.model.CarFactory;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> listOfCar = new ArrayList<>();
        listOfCar.add(carFactory.getCarByBrand("Audi"));
        listOfCar.add(carFactory.getCarByBrand("Audi"));
        listOfCar.add(carFactory.getCarByBrand("Audi"));
        listOfCar.add(carFactory.getCarByBrand("Audi"));
        listOfCar.add(carFactory.getCarByBrand("BMW"));
        listOfCar.add(carFactory.getCarByBrand("BMW"));
        listOfCar.add(carFactory.getCarByBrand("BMW"));
        listOfCar.add(carFactory.getCarByBrand("BMW"));
        listOfCar.add(carFactory.getCarByBrand("KAMAZ"));
        listOfCar.add(carFactory.getCarByBrand("KAMAZ"));
        listOfCar.add(carFactory.getCarByBrand("KAMAZ"));
        listOfCar.add(carFactory.getCarByBrand("KAMAZ"));
        System.out.println(listOfCar);
    }
}
