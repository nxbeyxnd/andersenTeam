package ru.andersen.app.user_patterns.ilnaz.pattens.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ComputerCable computerCable = new Thunderbolt(new Iphone());
        computerCable.connectionWithCable();
    }
}
