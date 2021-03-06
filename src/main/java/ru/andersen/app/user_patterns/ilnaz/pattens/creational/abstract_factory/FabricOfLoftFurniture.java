package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class FabricOfLoftFurniture implements FabricOfFurniture{
    @Override
    public Sofa createSofa() {
        return new LoftSofa();
    }

    @Override
    public Armchair createArmchair() {
        return new LoftArmchair();
    }

    @Override
    public Table createTable() {
        return new LoftTable();
    }
}
