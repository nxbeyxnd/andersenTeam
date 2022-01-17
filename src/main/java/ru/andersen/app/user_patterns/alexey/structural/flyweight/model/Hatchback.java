package ru.andersen.app.user_patterns.alexey.structural.flyweight.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.flyweight.model 
*/

public class Hatchback implements Car{
    private String brandCar = "BMW";
    private int speed = 300;

    public Hatchback() {
    }

    @Override
    public String getCarBrand() {
        return brandCar;
    }

    @Override
    public void carRiding() {
        System.out.println(brandCar + " riding with speed " + speed);
    }
}
