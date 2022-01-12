package ru.andersen.app.user_patterns.anton.fabric;

public class CryptocurrencyFactory implements Bank{
    @Override
    public Money giveMeMoney() {
        return new Сryptocurrency();
    }
}
