package ru.andersen.app.user_patterns.ilnaz.creational.prototype;

public class Car implements Copyable {
    private String name;
    private double engineVolume;
    private int sets;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public Car(String name, double engineVolume, int sets) {
        this.name = name;
        this.engineVolume = engineVolume;
        this.sets = sets;
    }

    @Override
    public Object copy() {
        return new Car(name, engineVolume, sets);
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
