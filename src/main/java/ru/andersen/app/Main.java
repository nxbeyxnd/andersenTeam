package ru.andersen.app;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/


import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyLinkedListImpl list = new MyLinkedListImpl();
        MyClass one = new MyClass("One", 1);
        MyClass second = new MyClass("Two",2);
        MyClass third = new MyClass("Three",3);
        MyClass four = new MyClass("Four",4);

        list.add(one);
        list.add(second);
        list.add(third);
        list.add(four);
        System.out.println(list.toString());
        list.remove(one);
        list.remove(four);
        System.out.println(list.toString());
    }
}


