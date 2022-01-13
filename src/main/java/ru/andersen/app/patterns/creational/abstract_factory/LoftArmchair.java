package ru.andersen.app.patterns.creational.abstract_factory;

public class LoftArmchair implements Armchair {
    @Override
    public void create() {
        System.out.println("Создали кресло в стиле лофт");
    }
}
