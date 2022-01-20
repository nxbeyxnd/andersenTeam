package ru.andersen.app.user_patterns.ilnaz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ilnaz", "Fatykhov", 31, "1"));
        humans.add(new Human("Philip", "Kircorov", 12, "2"));
        humans.add(new Human("Bob", "Bobby", 17, "3"));
        humans.add(new Human("Satoshi", "Nakamoto", 60, "4"));

        //System.out.println(humans.get(1).getNameAndSurname());

        Map<String, String> map = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(x -> x.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, Human::getNameAndSurname));
        System.out.println(map);
    }
}
