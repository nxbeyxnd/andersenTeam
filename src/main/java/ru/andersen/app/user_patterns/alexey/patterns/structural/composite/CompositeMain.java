package ru.andersen.app.user_patterns.alexey.patterns.structural.composite;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.composite
*/


import ru.andersen.app.user_patterns.alexey.patterns.structural.composite.model.Box;
import ru.andersen.app.user_patterns.alexey.patterns.structural.composite.model.Container;
import ru.andersen.app.user_patterns.alexey.patterns.structural.composite.model.WareHouse;

public class CompositeMain {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Container container = new Container("test", 0);

        container.addItem(new Box("testBox", 1000));
        container.addItem(new Box("testBox1", 1000));
        container.addItem(new Box("testBox2", 1000));
        container.addItem(new Box("testBox3", 1000));

        wareHouse.addItem(container);
        wareHouse.addItem(new Box("testBox", 100));
        
        wareHouse.getWeight();
    }
}
