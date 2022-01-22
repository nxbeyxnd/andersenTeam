package ru.andersen.app.user_patterns.alexey.practice.car_model;
/* 
22.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.car_model
*/

public abstract class Engine implements EngineInterface {
    public int power;

    public Engine(int power) {
        this.power = power;
    }

    public void setPower(int power){
        this.power = power;
    }
}
