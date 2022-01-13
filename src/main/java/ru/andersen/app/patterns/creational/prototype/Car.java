package ru.andersen.app.patterns.creational.prototype;

public class Car implements Copyable {
    private String name;

    public Car(String name, double engineVolume, int sets) {
        this.name = name;
        this.engineVolume = engineVolume;
        this.sets = sets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    private double engineVolume;
    private int sets;


    @Override
    public Object copy() {
        Car car = new Car(name, engineVolume, sets);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engineVolume=" + engineVolume +
                ", sets=" + sets +
                '}';
    }
}
