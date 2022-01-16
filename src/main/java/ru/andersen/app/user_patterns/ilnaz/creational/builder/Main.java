package ru.andersen.app.user_patterns.ilnaz.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();

        director.constructEliteHouse(builder);

        House house = builder.getResult();


    }
}
