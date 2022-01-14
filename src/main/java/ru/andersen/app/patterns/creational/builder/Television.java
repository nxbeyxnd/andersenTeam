package ru.andersen.app.patterns.creational.builder;

public class Television {
    private String name;
    private int diagonal;

    public Television(String name, int diagonal) {
        this.name = name;
        this.diagonal = diagonal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
