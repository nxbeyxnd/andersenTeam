package ru.andersen.app.user_patterns.alexey.structural.flyweight.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.flyweight.model 
*/

public class Truck implements Car{
    private String brandCar = "KAMAZ";
    private int speed = 100;

    public Truck() {
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
