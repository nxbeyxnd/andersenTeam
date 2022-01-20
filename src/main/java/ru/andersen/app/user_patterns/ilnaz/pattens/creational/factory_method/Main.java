package ru.andersen.app.user_patterns.ilnaz.pattens.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        AssemblyShop creator = new CarAssemblyShop();
        Factory car = creator.createCar();

        creator = new TruckAssemblyShop();

        Factory truck = creator.createCar();

        car.create();
        truck.create();
    }
}
