package ru.andersen.app.my_linked_list_impl;
/*
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

import java.util.Comparator;


public interface MyLinkedList<E> {
    boolean add(E e);
    void add(int index, E e);
    void addFirst(E e);
    void addLast(E e);
    E get(int index);
    boolean contains(Object o);
    E set(int index, E e);
    E remove(int index);
    boolean remove(Object o);
    int size();
    void sort(Comparator<? super E> c);
}
