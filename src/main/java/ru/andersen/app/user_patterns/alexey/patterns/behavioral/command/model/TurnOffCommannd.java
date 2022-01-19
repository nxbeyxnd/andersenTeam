package ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model
*/

public class TurnOffCommannd implements Command{
    private Server server;

    public TurnOffCommannd(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        this.server.turnOff();
    }
}
