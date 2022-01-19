package ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model
*/

public class Watch implements Apparat{
    String image = "src/logoWatch.img";
    String message = "Watch ";

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
        return visitor.getWatch(this);
    }
}
