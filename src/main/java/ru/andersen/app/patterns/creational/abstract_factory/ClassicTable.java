package ru.andersen.app.patterns.creational.abstract_factory;

public class ClassicTable implements Table {
    @Override
    public void create() {
        System.out.println("Создали стол в классическом стиле");
    }
}
