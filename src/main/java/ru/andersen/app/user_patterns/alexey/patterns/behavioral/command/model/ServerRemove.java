package ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model
*/

public class ServerRemove {
    Command turnOn;
    Command turnOff;
    Command showStatus;

    public ServerRemove(Command turnOn, Command turnOff, Command showStatus) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.showStatus = showStatus;
    }

    public void turnOn() {
        turnOn.execute();
    }

    public void turnOff() {
        turnOff.execute();
    }


    public void showStatus() {
        showStatus.execute();
    }
}
