package ru.andersen.app.user_patterns.ilnaz.pattens.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda",2.3, 4);
        System.out.println(car);

        CopyFactory copy = new CopyFactory(car);
        Car car1 = copy.copyCar();
        System.out.println(car1);

        car1.setEngineVolume(30);

        System.out.println(car);
        System.out.println(car1);
    }
}
