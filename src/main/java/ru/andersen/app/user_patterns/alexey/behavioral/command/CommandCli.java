package ru.andersen.app.user_patterns.alexey.behavioral.command;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.command 
*/

import ru.andersen.app.user_patterns.alexey.behavioral.command.model.*;

public class CommandCli {
    public static void main(String[] args) {
        Server server = new Server();

        ServerRemove serverRemove = new ServerRemove(
                new TurnOnCommand(server),
                new TurnOffCommannd(server),
                new ShowStatusCommand(server)
        );

        serverRemove.turnOn();
        serverRemove.showStatus();
        serverRemove.turnOff();
        serverRemove.showStatus();
    }
}
