package ru.andersen.app.patterns.creational.factory_method;

public class TruckAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Truck();
    }
}
