package ru.andersen.app.user_patterns.anton.singleton;

/**
 * fast
 * Demand Holde
 */
public class SecondSingleton {
    private  SecondSingleton(){
    }

    public static SecondSingleton getInstance() {
        return Holder.instance;
    }


    public static final class Holder {
        private static final SecondSingleton instance = new SecondSingleton();

    }
}
