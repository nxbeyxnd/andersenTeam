package ru.andersen.app.patterns.creational.abstract_factory;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Создали стол в стиле модерн");
    }
}
