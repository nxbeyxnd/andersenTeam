package ru.andersen.app.patterns.creational.builder;

public class HouseBuilder implements Builder {
    private HouseType type;
    private int floors;
    private double area;
    private Television television;

    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setTv(Television television) {
        this.television = television;
    }

    public House getResult() {
        return new House(type, floors, area);
    }
}
