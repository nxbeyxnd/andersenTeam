package ru.andersen.app.user_patterns.anton.facade;

public class Rest {
    Kitchen kitchen = new Kitchen();

    public void receivedOrder(Kitchen kitchen){
        kitchen.cook();
    }

}
