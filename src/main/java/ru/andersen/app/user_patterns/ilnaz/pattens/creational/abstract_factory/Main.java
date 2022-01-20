package ru.andersen.app.user_patterns.ilnaz.pattens.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        FabricOfFurniture fabricOfFurniture = new FabricOfLoftFurniture();
        Sofa sofa = fabricOfFurniture.createSofa();
        Armchair armchair = fabricOfFurniture.createArmchair();
        Table table = fabricOfFurniture.createTable();
        sofa.create();
        armchair.create();
        table.create();
    }
}
