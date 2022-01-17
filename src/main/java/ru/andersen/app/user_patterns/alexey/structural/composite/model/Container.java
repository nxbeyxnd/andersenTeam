package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

import java.util.ArrayList;
import java.util.List;

public class Container extends ItemComposite{
    private String title;
    private int weight;
    private List<Item> items = new ArrayList<>();

    public Container(String title, int weight) {
        super(title, weight);
    }

    @Override
    public void getTitle() {
        System.out.println(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.weight += item.getWeight();
        this.items.add(item);
    }
}
