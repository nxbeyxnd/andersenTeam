package ru.andersen.app.user_patterns.alexey.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.visitor.model 
*/

public class Tab implements Apparat{
    String image = "src/logoTab.img";
    String message = "Tab";

    @Override
    public void showImage() {
        System.out.println(image);
    }

    @Override
    public void sendMessage() {
        System.out.println(message);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.getTab(this);
    }
}
