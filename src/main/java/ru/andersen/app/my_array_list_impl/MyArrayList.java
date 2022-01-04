package ru.andersen.app.my_array_list_impl;/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl 
*/

public interface MyArrayList<T> {
    void add(T t);
    void add(int index, T e);
    T get(int index);
    boolean contains(T e);
    void set(int index, T e);
    void remove(int index);
    void remove(T e);
    int size();
    void sort();
}
