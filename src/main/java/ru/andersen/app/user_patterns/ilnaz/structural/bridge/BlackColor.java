package ru.andersen.app.user_patterns.ilnaz.structural.bridge;

public class BlackColor implements Color{
    @Override
    public void paint() {
        System.out.println("Мы покрасили в черный цвет");
    }
}
