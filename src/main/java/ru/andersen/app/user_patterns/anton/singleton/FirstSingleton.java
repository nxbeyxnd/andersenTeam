package ru.andersen.app.user_patterns.anton.singleton;

/**
 * Lazy
 */
public class FirstSingleton {
    private static FirstSingleton instance;

    private FirstSingleton() {
    }

    public static FirstSingleton getInstance() {

        if (instance == null) {
            instance = new FirstSingleton();
        }
        return instance;
    }
}
