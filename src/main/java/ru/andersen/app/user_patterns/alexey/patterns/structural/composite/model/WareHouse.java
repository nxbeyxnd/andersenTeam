package ru.andersen.app.user_patterns.alexey.patterns.structural.composite.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.composite.model
*/

import java.util.ArrayList;
import java.util.List;

public class WareHouse{
    private int weight = 0;
    private List<Item> items;

    public WareHouse() {
        items = new ArrayList<>();
    }

    public void getWeight() {
        System.out.println(weight);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.weight += item.getWeight();
        this.items.add(item);
    }
}
