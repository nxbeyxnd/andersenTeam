package ru.andersen.app.user_patterns.ilnaz.pattens.creational.factory_method;

public class TruckAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Truck();
    }
}
