package ru.andersen.app.my_array_list_impl;/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl 
*/

import java.util.Comparator;

public interface MyArrayList<E> {
    boolean add(E e);
    void add(int index, E e);
    E get(int index);
    boolean contains(Object e);
    E set(int index, E e);
    E remove(int index);
    boolean remove(E e);
    int size();
    void sort(Comparator<? super E> e);
}
