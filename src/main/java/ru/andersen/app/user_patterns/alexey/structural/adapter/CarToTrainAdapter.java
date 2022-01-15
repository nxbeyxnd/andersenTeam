package ru.andersen.app.user_patterns.alexey.structural.adapter;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.adapter 
*/

public class CarToTrainAdapter extends Car implements Train{
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
