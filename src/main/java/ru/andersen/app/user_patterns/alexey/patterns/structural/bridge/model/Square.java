package ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model
*/

public class Square extends Shape{
    private final String mySquare = "Square";

    public Square(Color color) {
        super(color);
    }

    @Override
    public void imagine() {
        System.out.println(mySquare + " is " + color.getColor());
    }
}
