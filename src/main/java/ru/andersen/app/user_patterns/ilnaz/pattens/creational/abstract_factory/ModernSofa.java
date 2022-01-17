package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class ModernSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Создали диван в стиле модерн");
    }
}
