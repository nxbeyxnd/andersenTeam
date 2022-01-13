package ru.andersen.app.patterns.creational.abstract_factory;

public class ClassicSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Создали диван в классическом стиле");
    }
}
