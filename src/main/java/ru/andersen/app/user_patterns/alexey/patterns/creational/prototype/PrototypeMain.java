package ru.andersen.app.user_patterns.alexey.patterns.creational.prototype;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.prototype
*/

public class PrototypeMain {
    public static void main(String[] args) {
        Robot robot = new Robot(1, "IT's ME MARIO!");
        Robot robot2 = new Robot(robot);

        System.out.println(robot.getPhrase()); // IT's ME MARIO!
        System.out.println(robot2.getPhrase()); // IT's ME MARIO!

        robot2.setPhrase("IT'S ME UR'S SINGLE VIEWER");
        System.out.println(robot.getPhrase()); // IT's ME MARIO!
        System.out.println(robot2.getPhrase()); // IT'S ME UR'S SINGLE VIEWER
    }
}
