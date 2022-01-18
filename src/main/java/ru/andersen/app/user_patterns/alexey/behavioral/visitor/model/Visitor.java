package ru.andersen.app.user_patterns.alexey.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.visitor.model 
*/

public interface Visitor {
    String getPhone(Phone phone);
    String getTab(Tab tab);
    String getWatch(Watch watch);
}
