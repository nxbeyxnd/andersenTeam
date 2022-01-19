package ru.andersen.app.user_patterns.alexey.patterns.structural.adapter.model;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.adapter
*/

public class Car {
    public void driveBySomeone(){
        System.out.println("Driving...");
    };
    public void stopByBrake(){
        System.out.println("stopped...");
    };
    public void openDoorBySomeone(){
        System.out.println("door is opened");
    };
    public void closeDoorBySomeone(){
        System.out.println("door is closed");
    };
}
