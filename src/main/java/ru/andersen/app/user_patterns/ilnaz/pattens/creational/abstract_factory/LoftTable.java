package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class LoftTable implements Table {
    @Override
    public void create() {
        System.out.println("Создали стол в стиле лофт");
    }
}
