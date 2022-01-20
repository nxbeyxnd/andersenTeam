package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Создали стол в стиле модерн");
    }
}
