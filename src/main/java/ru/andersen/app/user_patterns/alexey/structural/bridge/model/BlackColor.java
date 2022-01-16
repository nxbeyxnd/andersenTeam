package ru.andersen.app.user_patterns.alexey.structural.bridge.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.bridge.model 
*/

public class BlackColor implements Color{
    private final String myColor = "Black";

    @Override
    public String getColor() {
        return myColor;
    }
}
