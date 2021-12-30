package ru.andersen.listImpl;
/* 
29.12.2021: Alexey created this file inside the package: ru.andersen.listImpl 
*/

import java.util.Arrays;

public class MyArrayList<E> {
    private final int INITIAL_CAPACITY = 5;
    private final Object[] DEFAULT_LOCAL_ARRAY = {};
    private Object[] localArray = {};
    private int size = 0;

    /**
     * constructor with no args
     */
    public MyArrayList() {
        this.localArray = this.DEFAULT_LOCAL_ARRAY;
    }

    /**
     * constructor with capacity of array from User
     * @param capacity capacity of array
     */
    public MyArrayList(int capacity) {
        this.localArray = capacity > 0 ? new Object[capacity] : (capacity == 0 ? new Object[0] : new Object[0]);
    }

    /**
     * Method which calls add(E e, Object[] localArray, int index)
     * @param e Generic value
     */
    public void add(E e) {
        if (this.size == this.localArray.length) {
            this.incSize(++this.size);
            this.add(e, this.localArray, this.size - 1);
        }

    }

    /**
     * Method which add new value to array
     * @param e User's value
     * @param localArray current localArray
     * @param index index of values position
     */
    private void add(E e, Object[] localArray, int index) {
        localArray[index] = e;
    }

    /**
     * Method get show values by index
     * @param index position of value
     * @return value by index
     */
    public Object get(int index) {
        return this.localArray[index];
    }

    /**
     * Method which change value by index
     * @param index index of value
     * @param e new value
     */
    public void set(int index, E e) {
        this.localArray[index] = e;
    }

    /**
     * Method increase size of arrayList
     * @param newSize new size of array
     * @return localArray with new length and previous values
     */
    private Object[] incSize(int newSize) {
        return this.localArray = Arrays.copyOf(this.localArray, newSize);
    }

    /**
     * Method return current size of List
     * @return
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.localArray);
    }

}
