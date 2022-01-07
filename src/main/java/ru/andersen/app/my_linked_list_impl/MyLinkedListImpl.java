package ru.andersen.app.my_linked_list_impl;
/* 
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

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
        Node<E> newNode = new Node<>(current, e, before);
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
            last = first;
        } else {
            Node<E> temp = first;
            first = new Node<E>(temp, e, null);
            temp.prev = first;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        if (size == 0) {
            first = new Node<E>(null, e, null);
            last = first;
        } else {
            Node<E> temp = last;
            last = new Node<E>(null, e, temp);
            temp.next = last;
        }
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
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

    }

    @Override
    public void remove(E e) {
        LinkedListNode tmp = first;
        while(tmp != null)
            if(tmp.value.equals(o)){
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
                size--;
                break;
            }
            else tmp = tmp.next;
    }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort() {

    }

    private static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> next, E value, Node<E> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> getNodeByIndex(int index) {
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
        for (int i = 0; i < size; i++) {
            res += current.value;
            if (current.next != null) res += ", ";
            current = current.next;
        }
        return "[" + res + "]";
    }
}
