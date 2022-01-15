package ru.andersen.app.user_patterns.alexey.structural.adapter;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.adapter 
*/

public class AdapterMain {
    public static void main(String[] args) {
        Train train = new CarToTrainAdapter();

        train.closeDoor();
        train.openDoor();
        train.drive();
        train.stop();
    }
}
