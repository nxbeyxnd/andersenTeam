package ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.visitor.model
*/

public class Phone implements Apparat{
    String image = "src/logo.img";
    String message = "Hello";

    public Phone(String image, String message) {
        this.image = image;
        this.message = message;
    }

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
        return visitor.getPhone(this);
    }
}
