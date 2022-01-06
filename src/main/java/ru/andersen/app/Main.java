package ru.andersen.app;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/


import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        MyClass one = new MyClass("Suzuki", 54);
        MyClass second = new MyClass("Akai",87);
        MyClass third = new MyClass("Don",23);
        MyClass four = new MyClass("Вставка",43);

        MyLinkedListImpl list = new MyLinkedListImpl();

        list.add(one);
        list.add(second);
        list.add(third);
        list.size();
        list.print();
        list.remove(second);
        list.size();
        list.print();




    }
}
