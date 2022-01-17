package ru.andersen.app.user_patterns.alexey.structural.bridge.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.bridge.model 
*/

public class Circle extends Shape {
    private final String myCircle = "Circle";

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void imagine() {
        System.out.println(myCircle + " is " + color.getColor());
    }
}
