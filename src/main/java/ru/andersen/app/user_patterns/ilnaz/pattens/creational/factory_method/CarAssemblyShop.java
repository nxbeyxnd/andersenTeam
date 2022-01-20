package ru.andersen.app.user_patterns.ilnaz.pattens.creational.factory_method;

public class CarAssemblyShop implements AssemblyShop{
    @Override
    public Factory createCar() {
        return new Car();
    }
}
