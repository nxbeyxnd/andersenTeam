package com.company;

public class Main {

    public static void main(String[] args) {
        RealisationArrayList list = new RealisationArrayList();

        list.add("Steve");
        list.add("Joe");
        list.add("George");
        list.add("Alex");
        list.add("Peter");
        System.out.println(list.toString());
        System.out.println(list.size());

        list.add(1,"Ilnaz");
        System.out.println(list.toString());
        System.out.println(list.size());

        list.set(2, "Homer");
        System.out.println(list.toString());
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list.toString());
        System.out.println(list.size());

        list.remove("Ilnaz");

        System.out.println(list.toString());
        System.out.println(list.size());

        System.out.println(list.get(2));
        System.out.println(list.contains("Peter"));
    }
}
