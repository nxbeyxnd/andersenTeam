package ru.andersen.app.user_patterns.ilnaz.pattens.structural.bridge;

public class RedColor implements Color{
    @Override
    public void paint() {
        System.out.println("Мы покрасили в красный цвет");
    }
}
