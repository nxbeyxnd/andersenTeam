package ru.andersen.app.my_array_list_impl;/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl 
*/

import java.util.Comparator;

public interface MyArrayList<E> {
    void add(E e);
    void add(int index, E e);
    E get(int index);
    boolean contains(E e);
    void set(int index, E e);
    void remove(int index);
    void remove(E e);
    int size();
    void sort(Comparator<E> e);
}
