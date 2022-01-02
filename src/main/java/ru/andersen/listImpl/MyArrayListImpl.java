package ru.andersen.listImpl;
/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl
*/

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayListImpl<E extends Comparable<?>> implements MyArrayList, Comparator<E>{
    private final int INITIAL_CAPACITY = 5;
    private final Object[] DEFAULT_LOCAL_ARRAY = {};
    private Object[] localArray = {};
    private int size = 0;

    /**
     * Constructor with no args
     */
    public MyArrayListImpl() {
        this.localArray = this.DEFAULT_LOCAL_ARRAY;
    }

    /**
     * Constructor with capacity from User
     *
     * @param capacity capacity of array
     */
    public MyArrayListImpl(int capacity) {
        this.localArray = capacity > 0 ? new Object[capacity] : (capacity == 0 ? new Object[0] : new Object[0]);
    }

    @Override
    public void add(Object o) {
        if (this.size == this.localArray.length) {
            this.changeSize(++size);
            add(o, this.localArray, size - 1);
        }
    }

    @Override
    public void add(int index, Object o) {
        try {
            Object[] temp = this.localArray;
            changeSize(++size);
            System.arraycopy(temp, index - 1, this.localArray, index, size - index);
            localArray[index] = o;
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    /**
     * Method add new value to array
     *
     * @param o          User's value
     * @param localArray current localArray
     * @param index      index of values position
     */
    private void add(Object o, Object[] localArray, int index) {
        localArray[index] = o;
    }

    @Override
    public Object get(int index) {
        return this.localArray[index];
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < localArray.length; i++) {
            if (o.equals(localArray[i])) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override
    public void set(int index, Object o) {
        this.localArray[index] = o;
    }

    /**
     * Method will remove value from array with shift
     *
     * @param index index of value
     */
    @Override
    public void remove(int index) {
        Object[] temp = this.localArray;
        changeSize(--size);
        System.arraycopy(temp, 0, localArray, 0, size);
        System.arraycopy(temp, index + 1, localArray, index, size - index);
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort() {

    }

    @Override
    public String toString() {
        return Arrays.toString(this.localArray);
    }

    /**
     * Method change size of arrayList
     *
     * @param newSize new size of array
     * @return localArray with new length and previous values
     */
    private void changeSize(int newSize) {
        this.localArray = Arrays.copyOf(this.localArray, newSize);
    }

    @Override
    public int compare(E o1, E o2) {
        return 0;
    }
}
