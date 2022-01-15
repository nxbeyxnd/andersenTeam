package ru.andersen.app.user_patterns.anton.facade;

public class Chef {
    private boolean cooking;

    public boolean Cooking(){
        return cooking;
    }

    public void needCooking() {
        System.out.println("Just do it!");
        cooking = true;
    }

    public void noNeedCooking(){
        System.out.println("I don't need to cook");
        cooking = false;
    }
}
