package ru.andersen.app.user_patterns.alexey.patterns.behavioral.observer.model;/*
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.observer.model
*/

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updatePosts();
}
