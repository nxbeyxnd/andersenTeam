package ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.command.model
*/

public class Server {
    private static boolean power = false;

    public void turnOn(){
        if (!power) {
            System.out.println("Turning on...");
            power = true;
        }
        System.out.println("Working");
    }

    public void turnOff(){
        if (power) {
            System.out.println("Turning off...");
            power = false;
        }
        System.out.println("Offline");
    }


    public String showStatus(){
        if(power) return "OK";
        return "ERROR";
    }
}
