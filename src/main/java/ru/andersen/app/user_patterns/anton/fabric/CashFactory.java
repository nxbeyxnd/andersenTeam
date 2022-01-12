package ru.andersen.app.user_patterns.anton.fabric;

public class CashFactory implements Bank{
    @Override
    public Money giveMeMoney() {
        return new Cash();
    }
}
