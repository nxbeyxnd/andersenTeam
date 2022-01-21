package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class ModernArmchair implements Armchair {
    @Override
    public void create() {
        System.out.println("Создали кресло в стиле модерн");
    }
}
