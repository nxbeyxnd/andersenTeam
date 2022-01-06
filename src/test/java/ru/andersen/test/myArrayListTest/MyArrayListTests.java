package ru.andersen.test.myArrayListTest;/*
04.01.2022: Alexey created this file inside the package: PACKAGE_NAME 
*/
import org.junit.Before;
import org.junit.Test;
import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

public class MyArrayListTests {


    MyLinkedListImpl list = new MyLinkedListImpl();
    MyClass one = new MyClass("Suzuki", 54);

    @Test
    public void addNextElement(){
       list.add(one);
    }

}
