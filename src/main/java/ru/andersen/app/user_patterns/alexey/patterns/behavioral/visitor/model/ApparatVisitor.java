package ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model
*/

public class ApparatVisitor implements Visitor {
    @Override
    public String getPhone(Phone phone) {
        return String.format("Phone image (%s), and message is (%s)", phone.image, phone.message);
    }

    @Override
    public String getTab(Tab tab) {
        return String.format("Tab image (%s), and message is (%s)", tab.image, tab.message);
    }

    @Override
    public String getWatch(Watch watch) {
        return String.format("Watch image (%s), and message is (%s)", watch.image, watch.message);
    }
}
