package ru.andersen.app.patterns.creational.factory_method;

public class CarAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Car();
    }
}
