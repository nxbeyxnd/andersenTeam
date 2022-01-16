package ru.andersen.app.user_patterns.ilnaz.creational.prototype;

public class CopyFactory {
    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public CopyFactory(Car car) {
        this.car = car;
    }

    Car copyCar(){
        return (Car)car.copy();
    }
}
