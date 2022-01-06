package ru.andersen.app.my_linked_list_impl;
/* 
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

import org.w3c.dom.Node;

import java.security.PublicKey;

public class MyLinkedListImpl<T> implements MyLinkedList{
    /*
     *Вложенная нода с помощью которой создаются новые элементы
     */
    private static class LinkedListNode<T> {
        public T value;
        LinkedListNode<T> next;
        LinkedListNode<T> prev;

        public LinkedListNode(LinkedListNode prev,T element, LinkedListNode next) {
            this.value = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size = 0;
    private LinkedListNode first;
    private LinkedListNode last;

    /*
     * Реализация методов интерфейса MyLinkedList.
     *
     */
    @Override
    public void add(Object o) {
        LinkedListNode last = this.last;
        LinkedListNode newNode = new LinkedListNode(last,o,null);
        this.last = newNode;
        if (last == null) {
            first = newNode;
        } else {
            first.next = last;
            last.next = newNode;
        }
        this.size++;
    }
/*
    public<E> LinkedListNode node(int index){

        if (index < (size >> 1)) {
            LinkedListNode<T> returnedNode = first;
            for (int i = 0; i < index; i++)
                returnedNode = returnedNode.next;
            return returnedNode;
        } else {
            LinkedListNode<E> returnedNode = last;
            for (int i = size - 1; i > index; i--)
                returnedNode = returnedNode.prev;
            return returnedNode;
        }
    }
    public void linkLast(T t){
        final LinkedListNode<T> l = this.last;
        final LinkedListNode<T> newNode = new LinkedListNode<T>(l, t,null);
        last = newNode;
        if (last == null) {
            first = newNode;
            System.out.println("if last==null" + first.toString());
        }
        else {
            last.next = newNode;
            System.out.println("if last !null" + last.toString());
        }
        this.size++;
    }
    public void linkBefore(T t, LinkedListNode listNode) {
        final LinkedListNode<T> pred = listNode.prev;
        final LinkedListNode<T> newNode = new LinkedListNode<T>(pred, t, listNode);
        listNode.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    public void add(int index, T t) {
        if (index == size)
            linkLast(t);
        else
            linkBefore(t, node(index));
        System.out.println("Элемента " + t + " добавлен");
    }
*/

    @Override
    public void remove(Object o) {
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

    @Override
    public int size() {
        System.out.println(this.size);
        return this.size;
    }

    public void print() {
        LinkedListNode tmp = first;
        if(tmp != null) {
            while (tmp != null) {
                System.out.println(tmp.value.toString());
                tmp = tmp.next;
            }
        }
        System.out.println("________________");
    }
    //Сделать компоратор

    @Override
    public void sort(){

    }
       /* if (size > 1) {
            for (int i = 0; i < size; i++ ) {
                LinkedListNode currentNode = first;
                LinkedListNode next = first.next;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.value > next.value) {
                        LinkedListNode temp = currentNode;
                        currentNode = next;
                        next = temp;
                    }
                    currentNode = next;
                    next = next.next;
                }
            }
        }
    }*/
}
