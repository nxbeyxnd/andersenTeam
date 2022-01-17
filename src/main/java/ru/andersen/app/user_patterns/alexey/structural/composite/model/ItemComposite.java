package ru.andersen.app.user_patterns.alexey.structural.composite.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.composite.model 
*/

import java.util.List;

public abstract class ItemComposite implements Item {
    private String title;
    private int weight;

    public ItemComposite(String title, int weight) {
        this.title = title;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void getTitle() {
        System.out.println(title);
    }
}
