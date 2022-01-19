package ru.andersen.app.user_patterns.alexey.patterns.structural.adapter;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.adapter
*/

import ru.andersen.app.user_patterns.alexey.patterns.structural.adapter.model.CarToTruckAdapter;
import ru.andersen.app.user_patterns.alexey.patterns.structural.adapter.model.Truck;

public class AdapterMain {
    public static void main(String[] args) {
        Truck truck = new CarToTruckAdapter();

        truck.closeDoor();
        truck.openDoor();
        truck.drive();
        truck.stop();
    }
}
