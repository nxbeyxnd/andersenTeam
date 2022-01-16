package ru.andersen.app.user_patterns.ilnaz.creational.abstract_factory;

public interface FabricOfFurniture {
    Sofa createSofa();
    Armchair createArmchair();
    Table createTable();
}
