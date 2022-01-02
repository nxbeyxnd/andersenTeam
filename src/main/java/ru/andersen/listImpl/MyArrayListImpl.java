package ru.andersen.listImpl;
/*
01.01.2022: Alexey created this file inside the package: ru.andersen.listImpl
*/

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayListImpl<E extends MyClass> implements MyArrayList, Comparator<MyClass> {
    private final Object[] DEFAULT_LOCAL_ARRAY = {};
    private Object[] localArray;
    private int size = 0;

    /**
     * Пустой конструктор
     */
    public MyArrayListImpl() {
        this.localArray = DEFAULT_LOCAL_ARRAY;
    }

    /**
     * Конструктор с длинной массива заданной пользователем
     *
     * @param capacity заданная длинна массива пользователем
     */
    public MyArrayListImpl(int capacity) {
        if (capacity > 0) this.localArray = new Object[capacity];
        else if (capacity == 0) this.localArray = DEFAULT_LOCAL_ARRAY;
        else throw new IllegalArgumentException("Некорректный аргумент: " + capacity);
    }

    /**
     * Добавление объекта с динамическим увеличением длинны массива
     * @param o объект пользователя
     */
    @Override
    public void add(Object o) {
        if (this.size == this.localArray.length) {
            this.changeSize(++size);
            add(o, this.localArray, size - 1);
        }
    }

    /**
     * Добавление объекта по индексу с динамическим увеличением длинны массива
     * @param index индекс в массиве
     * @param o объект пользователя
     */
    @Override
    public void add(int index, Object o) {
        Object[] temp = this.localArray;
        changeSize(++size);
        System.arraycopy(temp, index - 1, this.localArray, index, size - index);
        localArray[index] = o;
    }

    /**
     * Добавление объекта в уже увеличенный по длине массив
     *
     * @param o          Объект пользователя
     * @param localArray Текущий массив
     * @param index      индекс в массиве
     */
    private void add(Object o, Object[] localArray, int index) {
        localArray[index] = o;
    }

    /**
     * Получение объекта по индексу
     * @param index индекс элемента
     * @return объект в массиве
     */
    @Override
    public Object get(int index) {
        return this.localArray[index];
    }

    /**
     * Проверка на существование объекта в массиве
     * @param o Искомый объект
     * @return True - в случае совпадения, False - в случае отсутствия
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < localArray.length; i++) {
            if (o.equals(localArray[i])) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * Замена объекта по индексу
     * @param index индекс объекта
     * @param o объект пользователя
     */
    @Override
    public void set(int index, Object o) {
        this.localArray[index] = o;
    }

    /**
     * Удаление из массива по индексу
     *
     * @param index индекс элемента
     */
    @Override
    public void remove(int index) {
        Object[] temp = this.localArray;
        changeSize(--size);
        System.arraycopy(temp, 0, localArray, 0, size);
        System.arraycopy(temp, index + 1, localArray, index, size - index);
    }

    /**
     * Удаление объекта в массиве, если он там находится
     * @param o объект
     */
    @Override
    public void remove(Object o) {
        for (int i = 0; i < localArray.length; i++) {
            if (o.equals(localArray[i])) {
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
     * Сортировка массива по Имени и Возрасту объектов
     */
    @Override
    public void sort() {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (compare((MyClass) localArray[i], (MyClass) localArray[j]) > 0) {
                    swap(i, j);
                }
            }
        }
    }

    /**
     * Сортировка массива по Имени объектов
     */
    public void sortByName() {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (compareByName((MyClass) localArray[i], (MyClass) localArray[j]) > 0) {
                    swap(i, j);
                }
            }
        }
    }

    /**
     * Сортировка массива по Возрасту объектов
     */
    public void sortByAge() {
        for (int k = size; k != 0; k--) {
            for (int i = 0, j = 1; j < size; i++, j++) {
                if (compareByAge((MyClass) localArray[i], (MyClass) localArray[j]) > 0) {
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
        Object temp = localArray[i];
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

    /**
     * Сравнение двух объектов по Name и Age
     * @param o1 1й объект
     * @param o2 2й объект
     * @return положительное в случае если o1 > o2, 0 - объекты равны, отрицательное если o1 < 02
     */
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.compareTo(o2);
    }

    /**
     * Сравнение двух объектов по Name
     * @param o1 1й объект
     * @param o2 2й объект
     * @return положительное в случае если o1 > o2, 0 - объекты равны, отрицательное если o1 < 02
     */
    public int compareByName(MyClass o1, MyClass o2) {
        return o1.getName().compareTo(o2.getName());
    }

    /**
     * Сравнение двух объектов по Age
     * @param o1 1й объект
     * @param o2 2й объект
     * @return положительное в случае если o1 > o2, 0 - объекты равны, отрицательное если o1 < 02
     */
    public int compareByAge(MyClass o1, MyClass o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    @Override
    public String toString() {
        return Arrays.toString(this.localArray);
    }
}
