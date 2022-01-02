package ru.andersen.listImpl;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        System.out.println(myArrayList.contains(1));
        System.out.println(myArrayList.contains(6));
    }
}
