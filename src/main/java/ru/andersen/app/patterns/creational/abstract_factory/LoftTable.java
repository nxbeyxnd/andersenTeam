package ru.andersen.app.patterns.creational.abstract_factory;

public class LoftTable implements Table {
    @Override
    public void create() {
        System.out.println("Создали стол в стиле лофт");
    }
}
