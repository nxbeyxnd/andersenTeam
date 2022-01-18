package ru.andersen.app.user_patterns.alexey.behavioral.observer.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.observer.model 
*/

import java.util.List;

public interface Observer {
    void handleEvent(List<String> posts);
}
