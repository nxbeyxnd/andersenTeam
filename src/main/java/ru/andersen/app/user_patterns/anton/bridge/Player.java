package ru.andersen.app.user_patterns.anton.bridge;

public abstract class Player {
    protected Music music;

    protected Player(Music music){
        this.music = music;
    }

    public abstract void runPlayer();
}
