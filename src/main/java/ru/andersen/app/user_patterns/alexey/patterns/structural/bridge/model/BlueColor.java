package ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model
*/

public class BlueColor implements Color{
    private final String myColor = "Blue";

    @Override
    public String getColor() {
        return myColor;
    }
}
