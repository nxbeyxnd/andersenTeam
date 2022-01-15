package ru.andersen.app.user_patterns.alexey.creational.prototype;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.prototype 
*/

public class Robot {
    private int id;
    private String phrase = "HELLO I'M A ROBOT!";
    private String[] buttons = {"exit", "start", "run"};

    public Robot(int id, String phrase) {
        this.id = id;
        this.phrase = phrase;
    }

    public Robot(Robot robot){
        this.id = robot.getId();
        this.phrase = robot.phrase;
        this.buttons = robot.buttons.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
