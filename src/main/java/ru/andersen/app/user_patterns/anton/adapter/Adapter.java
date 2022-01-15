package ru.andersen.app.user_patterns.anton.adapter;

public class Adapter extends Cryprocurrency implements Money{
    @Override
    public void tranzit() {
        System.out.println("ConvertCrypto");
    }
}
