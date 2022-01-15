package ru.andersen.app.user_patterns.ilnaz.creational.builder;

public interface Builder {
    void setHouseType(HouseType type);
    void setArea(double area);
    void setFloors(int floors);
    void setTv(Television television);

}
