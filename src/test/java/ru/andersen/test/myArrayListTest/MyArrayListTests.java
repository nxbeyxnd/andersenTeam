package ru.andersen.test.myArrayListTest;/*
04.01.2022: Alexey created this file inside the package: PACKAGE_NAME 
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.andersen.app.my_array_list_impl.MyArrayListImpl;
import ru.andersen.app.my_array_list_impl.MyClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListTests {

    @Test
    void testAdd(){
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("0");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        Assertions.assertEquals(list1.toString(),list.toString());
    }
    @Test
    void testAddByObject(){
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        MyClass myClass = new MyClass("abc",45);
        list.add(myClass);

        MyArrayListImpl<MyClass> list1 = new MyArrayListImpl<>();
        list1.add("0");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add(new MyClass("abc",45));

        Assertions.assertEquals(list1.toString(),list.toString());
    }

    @Test
    void testGet() {
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int o = (int) list.get(2);

        Assertions.assertEquals(2, o);
    }

    @Test
    void testSet() {
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(1, 10);

        MyArrayListImpl list1 = new MyArrayListImpl<>();
        list1.add(0);
        list1.add(10);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Assertions.assertEquals(list1.toString(), list.toString());
    }

    @Test
    void testContains(){
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean contains = list.contains(4);

        Assertions.assertEquals(true, contains);
    }

    @Test
    void testRemoveByIndex(){
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(0);
        MyArrayListImpl<MyClass> list1 = new MyArrayListImpl<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Assertions.assertEquals(list1.toString(),list.toString());
    }
    @Test
    void testRemoveByObject(){
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove("4");
        MyArrayListImpl<MyClass> list1 = new MyArrayListImpl<>();
        list1.add("0");
        list1.add("1");
        list1.add("2");
        list1.add("3");

        Assertions.assertEquals(list1.toString(),list.toString());
    }
    @Test
    void testSize() {
        MyArrayListImpl<MyClass> list = new MyArrayListImpl<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int i = list.size();

        Assertions.assertEquals(5, i);
    }

}
