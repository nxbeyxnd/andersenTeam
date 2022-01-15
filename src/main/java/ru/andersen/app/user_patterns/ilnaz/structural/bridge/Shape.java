package ru.andersen.app.user_patterns.ilnaz.structural.bridge;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    void draw(){};
}
