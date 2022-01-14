package ru.andersen.app.user_patterns.ilnaz.creational.factory_method;

public class CarAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Car();
    }
}
