package ru.andersen.app.user_patterns.ilnaz.pattens.creational.builder;

public class Director {
    public void constructEliteHouse(Builder builder) {
        builder.setHouseType(HouseType.ELITE);
        builder.setArea(200);
        builder.setFloors(2);
        builder.setTv(new Television("Samsung", 50));
    }

    public void constructLoftHouse(Builder builder) {
        builder.setHouseType(HouseType.LOFT);
        builder.setArea(88);
        builder.setFloors(1);
        builder.setTv(new Television("Sony", 44));
    }

    public void constructEconomyHouse(Builder builder) {
        builder.setHouseType(HouseType.ECONOMY);
        builder.setArea(40);
        builder.setFloors(1);
        builder.setTv(new Television("Xiaomi", 34));
    }
}

