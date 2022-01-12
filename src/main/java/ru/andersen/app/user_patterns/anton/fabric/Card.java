package ru.andersen.app.user_patterns.anton.fabric;

public class Card implements Money{

    @Override
    public void pay() {
        System.out.println("Pay in card");
    }
}
