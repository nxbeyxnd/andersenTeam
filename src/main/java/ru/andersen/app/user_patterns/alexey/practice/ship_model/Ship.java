package ru.andersen.app.user_patterns.alexey.practice.ship_model;
/* 
22.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.ship_model
*/

public class Ship {
    private String name;
    private BoatMotor boatMotor;

    public Ship(String name) {
        System.out.println("Ship constructor");
        this.name = name;
    }

    public static class BoatMotor{
        static int power = 0;

        public BoatMotor(int power) {
            System.out.println("Boat motor");
            this.power = power;
        }

        public static int getPower() {
            return power;
        }
    }
}
