package ru.andersen.app.user_patterns.ilnaz.pattens.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
        color.paint();
    }
}
