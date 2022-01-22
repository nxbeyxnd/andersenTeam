package ru.andersen.app.user_patterns.alexey.practice.stream;
/* 
22.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.stream 
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Clown> clowns = new ArrayList<>();
        clowns.add(new Clown(1, "a", false));
        clowns.add(new Clown(1, "a", false));
        clowns.add(new Clown(1, "a", false));
        clowns.add(new Clown(2, "ab", true));
        clowns.add(new Clown(3, "ac", false));
        clowns.add(new Clown(4, "ad", true));
        clowns.add(new Clown(5, "ae", true));
        clowns.add(new Clown(6, "af", false));
        clowns.add(new Clown(6, "af", false));
        clowns.add(new Clown(6, "af", false));
        clowns.add(new Clown(7, "ag", false));

        List<Clown> clown2 = new ArrayList<>();
        clowns.add(new Clown(10, "ga", false));
        clowns.add(new Clown(11, "gab", true));
        clowns.add(new Clown(12, "gac", false));
        clowns.add(new Clown(14, "gad", true));
        clowns.add(new Clown(15, "gae", true));
        clowns.add(new Clown(16, "gaf", false));
        clowns.add(new Clown(17, "gag", false));

        List<Clown> clown3 = new ArrayList<>();
        clowns.add(new Clown(40, "ega", false));
        clowns.add(new Clown(41, "egab", true));
        clowns.add(new Clown(42, "egac", false));
        clowns.add(new Clown(44, "egad", true));
        clowns.add(new Clown(45, "egae", true));
        clowns.add(new Clown(46, "egaf", false));
        clowns.add(new Clown(47, "egag", false));

        List<String > strList = new ArrayList<>();
        strList.add("b");
        strList.add("a");
        strList.add("a");
        strList.add("a");
        strList.add("c");
        strList.add("af");
        strList.add("aa");
        strList.add("sa");
        


    }
}
