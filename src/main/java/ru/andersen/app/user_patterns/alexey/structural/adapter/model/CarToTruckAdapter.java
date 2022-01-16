package ru.andersen.app.user_patterns.alexey.structural.adapter.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.adapter 
*/

public class CarToTruckAdapter extends Car implements Truck {
    @Override
    public void drive() {
        driveBySomeone();
    }

    @Override
    public void stop() {
        stopByBrake();
    }

    @Override
    public void openDoor() {
        openDoorBySomeone();
    }

    @Override
    public void closeDoor() {
        closeDoorBySomeone();
    }
}
