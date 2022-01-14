package ru.andersen.app.user_patterns.alexey.creational.builder;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.builder 
*/

import ru.andersen.app.user_patterns.alexey.creational.builder.model.Computer;
import ru.andersen.app.user_patterns.alexey.creational.builder.model.Processor;

public class BuilderMain {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder(Processor.AMD, "GTX").motherboard("test").ram(64).build();

        System.out.println(computer);
    }
}
