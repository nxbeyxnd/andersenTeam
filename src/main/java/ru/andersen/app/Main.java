package ru.andersen.app;
/* 
28.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/


import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyLinkedListImpl list = new MyLinkedListImpl();
        list.addLast("test");
        list.addLast("test1");
        list.addLast("test2");
        list.addLast("test6");
        System.out.println(list);
    }
}
