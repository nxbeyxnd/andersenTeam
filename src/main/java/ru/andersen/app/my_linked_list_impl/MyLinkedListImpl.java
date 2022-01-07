package ru.andersen.app.my_linked_list_impl;
/* 
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

import java.util.Comparator;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    @Override
    public void add(E e) {
        addLast(e);
    }

    @Override
    public void add(int index, E e) {
        checkIndex(index);
        if (index == size) addLast(e);
        else addBefore(e, getNodeByIndex(index));
    }

    private void addBefore(E e, Node<E> current) {
        Node<E> before = current.prev;
        Node<E> newNode = new Node<>(before, e, current);
        if (before == null) {
            first = newNode;
        } else {
            before.next = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(E e) {
        if (size == 0) {
            first = new Node<E>(null, e, null);
        } else {
            Node<E> temp = first;
            first = new Node<E>(null, e, temp);
            temp.prev = first;
        }
        this.size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> last = this.last;
        Node<E> newNode = new Node<E>(last, e, null);
        this.last = newNode;
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        this.size++;
    }
   
    @Override
    public E get(int index) {
        return getNodeByIndex(index).value;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public void set(int index, E e) {
        getNodeByIndex(index).value = e;
    }

    @Override
    public void remove(int index) {
        Node<E> tmp = first;

        getNodeByIndex(index).next.prev = tmp.next;


    }

    @Override
    public void remove(Object o) {
        Node tmp = first;
        while (tmp != null && tmp.value != o) {
            tmp=tmp.next;
        }
            if (tmp.prev == null) {
                first = tmp.next;
            } else {
                tmp.prev.next = tmp.next;
                tmp.prev = null;
            }
    }



    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void sort(Comparator<E> c) {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (c.compare(getNodeByIndex(i).value, getNodeByIndex(j).value) > 0) {
                    swap(getNodeByIndex(i), getNodeByIndex(j));
                }
            }
        }
    }

    private void swap(Node<E> n1, Node<E> n2) {
        E temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }

    private static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
    public Node<E> getNodeByIndex(int index) {
        Node<E> current;
        if (index < (size / 2)) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(String.format("Index %d out of range of list size %d", index, size));
    }

    @Override
    public String toString() {
        String res = "";
        Node<E> current = first;
        while (current != null) {
            res += current.value;
            if (current.next != null) res += ", ";
            current = current.next;
        }
        return "[" + res + "]";
    }
}
