package ru.andersen.app.user_patterns.ilnaz.creational.abstract_factory;

public class ClassicArmchair implements Armchair {
    @Override
    public void create() {
        System.out.println("Создали кресло в классическом стиле");
    }
}
