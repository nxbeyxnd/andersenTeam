package ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model
*/

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void imagine();
}
