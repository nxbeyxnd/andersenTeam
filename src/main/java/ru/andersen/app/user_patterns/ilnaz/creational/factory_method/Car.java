package ru.andersen.app.user_patterns.ilnaz.creational.factory_method;

public class Car implements Factory{
    @Override
    public void create() {
        System.out.println("We create a new car");
    }
}
