package ru.andersen.listImpl;

import java.lang.reflect.Type;
import java.util.Comparator;

public class MyLinkedListImpl <E extends MyClass> implements MyArrayList, Comparator<MyClass> {
    private int size = 0;
    private LinkedListNode first;
    private LinkedListNode last;

    public static class LinkedListNode<E> {
        public E value;
        LinkedListNode<E> next;
        LinkedListNode<E> last;

        public LinkedListNode(E element){
            this.value = element;
        }
    }
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return 0;
    }

    @Override
    public void add(Object e) {

    }

    @Override
    public void add(int index, Object e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public void set(int index, Object e) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Object e) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort() {

    }


}

