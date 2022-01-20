package ru.andersen.app.user_patterns.ilnaz.pattens.creational.singltone;

public class SingletonExample {
    private static SingletonExample instance;

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    private SingletonExample() {}
}
