package ru.andersen.app.my_array_list_impl;
/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl
*/

import java.util.*;

public class MyArrayListImpl<E> extends AbstractList<E> implements List<E>, MyArrayList<E> {
    private final Object[] DEFAULT_LOCALARRAY = {};
    private Object[] localArray;
    private int size = 0;

    /**
     * Переопределение Equals //
     * @param o сравниваемое значение
     * @return true в случае если они равны, false в ином случае
     */
    @Override
    public boolean equals(Object o) {
        return o == this && o instanceof List;
    }

    @Override
    public int hashCode() {
        if (checkSize()) {
            int result = 1;
            final int prime = 31;
            for (Object o : localArray) {
                result = prime * result + (o == null ? 0 : o.hashCode());
            }
            return hashCode();
        }
        throw new ConcurrentModificationException();
    }

    /**
     * Проверка на валидное состояние листа, если size > length это ошибка, так как size не может быть больше
     * длинны массива.
     *
     * @return true в случае если size < length, false в случае если size > length
     */
    private boolean checkSize() {
        return localArray.length <= size;
    }

    /**
     * Пустой конструктор
     */
    public MyArrayListImpl() {
        this.localArray = DEFAULT_LOCALARRAY;
    }

    /**
     * Конструктор с длинной массива, заданной пользователем
     *
     * @param capacity заданная длинна массива пользователем
     */
    public MyArrayListImpl(int capacity) {
        if (capacity > 0) this.localArray = new Object[capacity];
        else if (capacity == 0) this.localArray = DEFAULT_LOCALARRAY;
        else throw new IllegalArgumentException("Некорректный аргумент: " + capacity);
    }

    /**
     * Добавление объекта с динамическим увеличением длинны массива
     *
     * @param e объект пользователя
     * @return всегда вернет true
     */
    @Override
    public boolean add(E e) {
        if (this.size == this.localArray.length) {
            this.changeSize(++size);
            add(e, this.localArray, size - 1);
        }
        return true;
    }

    /**
     * Добавление объекта по индексу с динамическим увеличением длинны массива
     *
     * @param index индекс в массиве
     * @param e     объект пользователя
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
    private void add(E e, Object[] localArray, int index) {
        localArray[index] = e;
    }

    /**
     * Получение объекта по индексу
     *
     * @param index индекс элемента
     * @return объект в массиве
     */
    @Override
    public E get(int index) {
        return getLocalArrayGeneric(index);
    }

    /**
     * Проверка на существование объекта в массиве
     *
     * @param o Искомый объект
     * @return True - в случае совпадения, False - в случае отсутствия
     */
    @Override
    public boolean contains(Object o) {
        for (Object find : localArray) {
            if (o.equals(find)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Замена объекта по индексу
     *
     * @param index индекс объекта
     * @param e     объект пользователя
     */
    @Override
    public E set(int index, E e) {
        E oldObject = getLocalArrayGeneric(index);
        this.localArray[index] = e;
        return oldObject;
    }

    /**
     * Получение значения по индексу с кастом в E
     *
     * @param index индекс значения
     * @return E значение
     */
    private E getLocalArrayGeneric(int index) {
        return (E) localArray[index];
    }

    /**
     * Удаление из массива по индексу
     *
     * @param index индекс элемента
     */
    @Override
    public E remove(int index) {
        E oldObject = getLocalArrayGeneric(index);
        Object[] temp = localArray;
        changeSize(--size);
        System.arraycopy(temp, 0, localArray, 0, size);
        System.arraycopy(temp, index + 1, localArray, index, size - index);
        return oldObject;
    }

    /**
     * Удаление объекта в массиве, если он там находится
     *
     * @param e объект
     * @return true если удален, false если нет
     */
    @Override
    public boolean remove(Object e) {
        for (int i = 0; i < localArray.length; i++) {
            if (e.equals(localArray[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Длинна массива
     *
     * @return длинна массива
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Сортировка массива по компаратору
     *
     * @param c Comparator<E> объекта сравнения
     */
    @Override
    public void sort(Comparator<? super E> c) {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (c.compare(getLocalArrayGeneric(i), getLocalArrayGeneric(j)) > 0) {
                    swap(i, j);
                }
            }
        }
    }

    /**
     * Замена двух значений по индексу
     *
     * @param i индекс 1 элемента
     * @param j индекс 2 элемента
     */
    private void swap(int i, int j) {
        E temp = getLocalArrayGeneric(i);
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
