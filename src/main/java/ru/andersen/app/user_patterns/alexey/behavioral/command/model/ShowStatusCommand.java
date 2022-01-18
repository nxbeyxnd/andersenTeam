package ru.andersen.app.user_patterns.alexey.behavioral.command.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.command.model 
*/

public class ShowStatusCommand implements Command{
    private Server server;

    public ShowStatusCommand(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        System.out.println(server.showStatus());
    }
}
