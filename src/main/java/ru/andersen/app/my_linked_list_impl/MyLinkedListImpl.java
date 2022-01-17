package ru.andersen.app.my_linked_list_impl;
/* 
04.01.2022: Alexey created this file inside the package: ru.andersen.listImpl.myLinkerListImpl 
*/

import java.util.Comparator;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    /**
     * Метод дабавляет значение в конец
     *
     * @param e значение для добавления
     */
    @Override
    public void add(E e) {
        addLast(e);
    }

    /**
     * Метод добавляет по индексу значение
     *
     * @param index индекс куда добавить
     * @param e     значение для добалвения
     */
    @Override
    public void add(int index, E e) {
        checkIndex(index);
        if (index == size) addLast(e);
        else addBefore(e, getNodeByIndex(index));
    }

    /**
     * Локальный метод добавления значений
     *
     * @param e       Значение для добавления
     * @param current нода, с которой будет вестись работа
     */
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

    /**
     * Добавление в начало списка
     *
     * @param e Значение для добавления
     */
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

    /**
     * Добавить в конец списка
     *
     * @param e Значение для добавления
     */
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

    /**
     * Получение значения по индексу
     *
     * @param index позиция элемента
     * @return Значение value в ноде
     */
    @Override
    public E get(int index) {
        return getNodeByIndex(index).value;
    }

    /**
     * Проверка на существование элемента в списке
     *
     * @param e Значение дял поиска
     * @return true - в случае совпадения, false - в случае отсутствия элемента в списке
     */
    @Override
    public boolean contains(E e) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    /**
     * Замена значения по индексу
     *
     * @param index позиция для замены
     * @param e     Значение для добавления
     */
    @Override
    public void set(int index, E e) {
        getNodeByIndex(index).value = e;
    }

    /**
     * Удаление по индексу
     *
     * @param index позиция для удаления
     */
    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<E> temp = getNodeByIndex(index);
        if (size == 1) {
            first = null;
        } else if (index == 0) {
            temp.next.prev = null;
            first = temp.next;
        } else if (index == size - 1) {
            temp.prev.next = null;
            last = temp.prev;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }

    /**
     * Удаление по совпадению
     *
     * @param e значения для удаления
     */
    @Override
    public void remove(E e) {
        Node<E> tmp = first;
        while (tmp != null && tmp.value != e) {
            tmp = tmp.next;
        }
        if (tmp.prev == null) {
            first = tmp.next;
        } else {
            tmp.prev.next = tmp.next;
            tmp.prev = null;
        }
        size--;
    }

    /**
     * Вывод размера листа
     *
     * @return int значение размера листа
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Сортировка пузырьком
     *
     * @param c Comprator<E> объекта
     */
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

    /**
     * Локальный метод замены данных
     *
     * @param n1 1 нода
     * @param n2 2 нода
     */
    private void swap(Node<E> n1, Node<E> n2) {
        E temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }

    /**
     * Класс ноды
     *
     * @param <E> тип данных
     */
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

    /**
     * Локальный метод для получения ноды по индексу
     *
     * @param index индекс ноды
     * @return нода по индексу
     */
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

    /**
     * Проверка на валидность индекса
     *
     * @param index исключение если индекс больше размера или меньше 0
     */
    private void checkIndex(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(String.format("Index %d out of range of list size %d", index, size));
    }

    /**
     * Выдача листа в String формате
     *
     * @return String значение
     */
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
