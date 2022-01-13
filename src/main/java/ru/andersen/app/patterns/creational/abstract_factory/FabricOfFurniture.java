package ru.andersen.app.patterns.creational.abstract_factory;

public interface FabricOfFurniture {
    Sofa createSofa();
    Armchair createArmchair();
    Table createTable();
}
