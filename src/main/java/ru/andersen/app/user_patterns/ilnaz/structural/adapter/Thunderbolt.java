package ru.andersen.app.user_patterns.ilnaz.structural.adapter;

public class Thunderbolt implements ComputerCable {
    Iphone iphone;

    public Thunderbolt(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void connectionWithCable() {
        iphone.connectToComputer();
        iphone.copyFiles();
    }
}
