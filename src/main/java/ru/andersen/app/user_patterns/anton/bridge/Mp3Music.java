package ru.andersen.app.user_patterns.anton.bridge;

public class Mp3Music implements Music{
    @Override
    public void play() {
        System.out.println("Play .mp3");
    }
}
