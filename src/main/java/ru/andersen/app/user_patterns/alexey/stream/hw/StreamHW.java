package ru.andersen.app.user_patterns.alexey.stream.hw;
/* 
19.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.stream.hw 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamHW {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Igor", 10, "1", "Ivanov1"));
        humans.add(new Human("Alex", 20, "2", "Ivanov2"));
        humans.add(new Human("Egor", 17, "3", "Ivanov3"));
        humans.add(new Human("Max", 30, "4", "Ivanov4"));
        humans.add(new Human("Gleb", 50, "5", "Ivanov5"));


        //First variant
        Map<String, List<String>> mapWithArrayList = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(x -> x.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, x -> Arrays.asList(x.getName(), x.getSurname())));
        //printed "{2=[Alex, Ivanov2], 3=[Egor, Ivanov3], 4=[Max, Ivanov4], 5=[Gleb, Ivanov5]}"
        System.out.println(mapWithArrayList);

        //Second variant
        Map<String, String> mapWithConcatVals = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(x -> x.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, x -> x.getName().concat(", ").concat(x.getSurname())));
        //printed "{2=Alex, Ivanov2, 3=Egor, Ivanov3, 4=Max, Ivanov4, 5=Gleb, Ivanov5}"
        System.out.println(mapWithConcatVals);

    }
}
