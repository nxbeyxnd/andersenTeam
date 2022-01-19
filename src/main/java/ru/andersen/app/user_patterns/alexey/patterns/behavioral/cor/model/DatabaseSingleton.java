package ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model
*/


import java.util.HashMap;
import java.util.Map;

public class DatabaseSingleton {
    private final static DatabaseSingleton database = new DatabaseSingleton();
    public static Map<String, String> userDatabase = new HashMap<>();

    private DatabaseSingleton() {
    }

    public static DatabaseSingleton getInstance() {
        return database;
    }

    public static boolean save(String email, String password) {
        userDatabase.put(email, password);
        return true;
    }

    public static boolean findByEmail(String email) {
        return userDatabase.containsKey(email);
    }
}
