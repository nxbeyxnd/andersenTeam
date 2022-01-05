package ru.andersen.app.my_linked_list_impl;
/*
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

public interface MyLinkedList<T> {
    void add(T t);
    void add(int index, T t);
    T get(int index);
    boolean contains(T t);
    void set(int index, T t);
    void remove(int index);
    void remove(T t);
    int size();
    void sort();
}
