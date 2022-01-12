package ru.andersen.app.user_patterns.anton.fabric;

public class CardFactory implements Bank{
    @Override
    public Money giveMeMoney() {
        return new Card();
    }
}
