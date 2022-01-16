package ru.andersen.app;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/


import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyClass> list = new MyLinkedListImpl<>();
        MyClass myClass = new MyClass("test", 1);
        MyClass myClass2 = new MyClass("test2", 2);
        MyClass myClass3 = new MyClass("a", 0);

        list.add(myClass);
        list.add(myClass2);
        list.add(myClass3);

        System.out.println(list.set(1, myClass));
    }
}


