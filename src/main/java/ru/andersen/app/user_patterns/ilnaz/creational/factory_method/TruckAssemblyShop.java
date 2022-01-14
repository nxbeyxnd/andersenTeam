package ru.andersen.app.user_patterns.ilnaz.creational.factory_method;

public class TruckAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Truck();
    }
}
