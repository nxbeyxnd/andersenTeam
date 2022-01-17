package ru.andersen.app.user_patterns.ilnaz.creational.builder;

public class House {
    private final HouseType houseType;
    private String wallMaterial;
    private int windows;
    private Television tv;
    private int floors;
    private double area;

    public House(HouseType houseType, String wallMaterial, int windows, Television tv, int floors, double area) {
        this.houseType = houseType;
        this.wallMaterial = wallMaterial;
        this.windows = windows;
        this.tv = tv;
        this.floors = floors;
        this.area = area;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public House(HouseType houseType, int floors, double area, Television television) {
        this.houseType = houseType;
        this.floors = floors;
        this.area = area;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }


}
