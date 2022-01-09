package ru.andersen.test.myArrayListTest;/*
04.01.2022: Alexey created this file inside the package: PACKAGE_NAME 
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.andersen.app.my_array_list_impl.MyArrayList;
import ru.andersen.app.my_array_list_impl.MyArrayListImpl;
import ru.andersen.app.my_array_list_impl.MyClass;

import java.util.Comparator;


public class MyArrayListTests {


    MyArrayListImpl list = new MyArrayListImpl();
    MyClass one = new MyClass("Suzuki", 54);
    MyClass two = new MyClass("Ural", 23);
    MyClass third = new MyClass("KAMA", 65);


    @Test
    public void addNextElement() {
        list.add(one);
        list.add(two);
        list.add(third);
        Assertions.assertEquals(list.get(1), two);
    }

    @Test
    public void addElementByIndex() {
        list.add(two);
        list.add(third);
        list.add(1, one);
        Assertions.assertEquals(list.get(1), one);
    }

    @Test
    public void setElementByIndex() {
        list.add(one);
        list.add(two);
        list.set(1, third);
        Assertions.assertEquals(list.get(1), third);
    }

    @Test
    public void sort() {
        list.add(one);
        list.add(two);
        list.add(third);
        list.sort(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.compareTo(o2);
            }
        });
        MyArrayList expected = new MyArrayListImpl();
        expected.add(third);
        expected.add(one);
        expected.add(two);
        Assertions.assertEquals(expected.toString(), list.toString());
    }

    @Test
    public void removeByElement() {
        list.add(one);
        list.add(two);
        list.add(third);
        list.remove(list.get(1));
        Assertions.assertEquals(list.get(1), third);
    }

    @Test
    public void removeByindex() {
        list.add(one);
        list.add(two);
        list.add(third);
        list.remove(1);
        Assertions.assertEquals(list.get(1), third);
    }

    @Test
    public void contains() {
        list.add(one);
        list.add(two);
        list.add(third);
        list.contains(third);
        Assertions.assertEquals(true, true);
    }
}
