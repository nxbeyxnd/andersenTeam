package ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral
*/

public interface Apparat {
    void showImage();
    void sendMessage();
    String accept (Visitor visitor);
}
