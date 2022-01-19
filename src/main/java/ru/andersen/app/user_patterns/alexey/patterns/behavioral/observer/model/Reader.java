package ru.andersen.app.user_patterns.alexey.patterns.behavioral.observer.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.observer.model
*/

import java.util.List;

public class Reader implements Observer {
    String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> posts) {
        System.out.println("updating " + name + " page..." + posts);
    }
}
