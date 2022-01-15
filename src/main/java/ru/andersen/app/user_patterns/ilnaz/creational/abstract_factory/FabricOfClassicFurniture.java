package ru.andersen.app.user_patterns.ilnaz.creational.abstract_factory;

public class FabricOfClassicFurniture implements FabricOfFurniture{
    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public Armchair createArmchair() {
        return new ClassicArmchair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
