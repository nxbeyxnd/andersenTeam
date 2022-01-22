package ru.andersen.app.user_patterns.alexey.practice.car_model;
/* 
22.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.classes
*/

public class Car {
    private int speed;
    private Engine engine;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(int power) {
        this.engine = createMotor(power);
    }

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engine=" + engine +
                '}';
    }

    public Engine createMotor(int power) {
        class Motor extends Engine {
            public Motor(int power) {
                super(power);
            }

            @Override
            public String toString() {
                return "Motor{" +
                        "power=" + power +
                        '}';
            }
        }
        return new Motor(power);
    }
}
