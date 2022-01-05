package ru.andersen.listImpl;

public interface MyLinkedList {
    void add(Object t);
    void add(int index, Object e);
    Object get(int index);
    boolean contains(Object e);
    void set(int index, Object e);
    void remove(int index);
    void remove(Object e);
    int size();
    void sort();
}
