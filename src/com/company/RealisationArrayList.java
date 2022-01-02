package com.company;

import java.util.Arrays;

public class RealisationArrayList implements MyArrayList, Comparable<Object> {
    private int initSize = 1;
    private Object[] array = new Object[initSize];
    private int size = 0;

    @Override
    public void add(Object object) {
        if (size == array.length - 1)
            resize(array.length + 1);
        array[size++] = object;
    }

    @Override
    public void add(int index, Object object) {
        Object[] temp = array;
        resize(++size);
        System.arraycopy(temp, index - 1, array, index, size - index);
        array[index] = object;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public boolean contains(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i]))
                return true;
        }
        return false;
    }

    @Override
    public void set(int index, Object object) {
        array[index] = object;
    }

    @Override
    public void remove(int index) {
        Object[] temp = array;
        resize(--size);
        System.arraycopy(temp, 0, array, 0, size);
        System.arraycopy(temp, index + 1, array, index, size - index);
    }

    @Override
    public void remove(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i]))
                remove(i);
        }
    }

    private void resize(int newLength) {
        this.array = Arrays.copyOf(this.array, newLength);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
