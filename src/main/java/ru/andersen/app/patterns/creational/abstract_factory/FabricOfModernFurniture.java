package ru.andersen.app.patterns.creational.abstract_factory;

public class FabricOfModernFurniture implements FabricOfFurniture{
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Armchair createArmchair() {
        return new ModernArmchair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
