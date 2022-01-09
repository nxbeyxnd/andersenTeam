package ru.andersen.app.my_array_list_impl;
/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl
*/

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayListImpl<E> implements MyArrayList<E> {
    private final Object[] DEFAULT_LOCAL_ARRAY = {};
    private E[] localArray;
    private int size = 0;

    /**
     * Пустой конструктор
     */
    public MyArrayListImpl() {
        this.localArray = (E[]) DEFAULT_LOCAL_ARRAY;
    }

    /**
     * Конструктор с длинной массива заданной пользователем
     *
     * @param capacity заданная длинна массива пользователем
     */
    public MyArrayListImpl(int capacity) {
        if (capacity > 0) this.localArray = (E[]) new Object[capacity];
        else if (capacity == 0) this.localArray = (E[]) DEFAULT_LOCAL_ARRAY;
        else throw new IllegalArgumentException("Некорректный аргумент: " + capacity);
    }

    /**
     * Добавление объекта с динамическим увеличением длинны массива
     * @param e объект пользователя
     */
    @Override
    public void add(E e) {
        if (this.size == this.localArray.length) {
            this.changeSize(++size);
            add(e, this.localArray, size - 1);
        }
    }

    /**
     * Добавление объекта по индексу с динамическим увеличением длинны массива
     * @param index индекс в массиве
     * @param e объект пользователя
     */
    @Override
    public void add(int index, E e) {
        Object[] temp = this.localArray;
        changeSize(++size);
        System.arraycopy(temp, index - 1, this.localArray, index, size - index);
        localArray[index] = e;
    }

    /**
     * Добавление объекта в уже увеличенный по длине массив
     *
     * @param e          Объект пользователя
     * @param localArray Текущий массив
     * @param index      индекс в массиве
     */
    private void add(E e, E[] localArray, int index) {
        localArray[index] = e;
    }

    /**
     * Получение объекта по индексу
     * @param index индекс элемента
     * @return объект в массиве
     */
    @Override
    public E get(int index) {
        return this.localArray[index];
    }

    /**
     * Проверка на существование объекта в массиве
     * @param e Искомый объект
     * @return True - в случае совпадения, False - в случае отсутствия
     */
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < localArray.length; i++) {
            if (e.equals(localArray[i])) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * Замена объекта по индексу
     * @param index индекс объекта
     * @param e объект пользователя
     */
    @Override
    public void set(int index, E e) {
        this.localArray[index] = e;
    }

    /**
     * Удаление из массива по индексу
     *
     * @param index индекс элемента
     */
    @Override
    public void remove(int index) {
        E[] temp = this.localArray;
        changeSize(--size);
        System.arraycopy(temp, 0, localArray, 0, size);
        System.arraycopy(temp, index + 1, localArray, index, size - index);
    }

    /**
     * Удаление объекта в массиве, если он там находится
     * @param e объект
     */
    @Override
    public void remove(E e) {
        for (int i = 0; i < localArray.length; i++) {
            if (e.equals(localArray[i])) {
                remove(i);
            }
        }
    }

    /**
     * Длинна массива
     * @return длинна массива
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Сортировка массива по компаратору
     * @param c Comparator<E> объекта сравнения
     */
    @Override
    public void sort(Comparator<E> c) {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (c.compare(localArray[i], localArray[j]) > 0) {
                    swap(i, j);
                }
            }
        }
    }

    /**
     * Замена двух значений по индексу
     * @param i индекс 1 элемента
     * @param j индекс 2 элемента
     */
    private void swap(int i, int j) {
        E temp = localArray[i];
        localArray[i] = localArray[j];
        localArray[j] = temp;
    }

    /**
     * Динамическое изменение длинны массива
     *
     * @param newSize новая длинна массива
     */
    private void changeSize(int newSize) {
        this.localArray = Arrays.copyOf(this.localArray, newSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.localArray);
    }
}
