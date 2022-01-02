package ru.andersen.listImpl;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayListImpl myArrayList = new MyArrayListImpl();
        myArrayList.add(new MyClass("a", 205150));
        myArrayList.add(new MyClass("b", 201));
        myArrayList.add(new MyClass("b", 202123));
        myArrayList.add(new MyClass("b", 200));
        myArrayList.add(new MyClass("test", 2022));
        myArrayList.add(new MyClass("test", 2052));
        myArrayList.add(new MyClass("test", 203242352));
        myArrayList.add(new MyClass("test", 20122));
        System.out.println(myArrayList);
        myArrayList.sort();
        System.out.println(myArrayList);


    }
}
