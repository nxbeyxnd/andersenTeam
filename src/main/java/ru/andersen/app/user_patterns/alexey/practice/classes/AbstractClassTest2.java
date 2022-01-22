package ru.andersen.app.user_patterns.alexey.practice.classes;
/* 
21.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.classes
*/

import java.util.Random;

public abstract class AbstractClassTest2 {
    Random random = new Random();

    public int createNewValue() {
        return random.nextInt(1000);
    }
}
