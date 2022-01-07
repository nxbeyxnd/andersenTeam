package ru.andersen.app.my_linked_list_impl;
/*
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

import java.util.Comparator;


public interface MyLinkedList<E> {
    void add(E e);
    void add(int index, E e);
    void addFirst(E e);
    void addLast(E e);
    E get(int index);
    boolean contains(E e);
    void set(int index, E e);
    void remove(int index);
    void remove(E e);
    int size();
    void sort(Comparator<E> c);
}
