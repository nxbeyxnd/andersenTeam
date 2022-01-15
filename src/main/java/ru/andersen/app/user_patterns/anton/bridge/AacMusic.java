package ru.andersen.app.user_patterns.anton.bridge;

public class AacMusic implements Music{
    @Override
    public void play() {
        System.out.println("Play .aac");
    }
}
