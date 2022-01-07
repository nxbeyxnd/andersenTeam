
package ru.andersen.test.myLinkedListTest;
/*
04.01.2022: Alexey created this file inside the package: ru.andersen.test.myLinkedListTest
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

import java.util.Comparator;
import java.util.LinkedList;

@DisplayName("MyLinkedListTests")

public class MyLinkedListTests {
    private static final MyLinkedListImpl myLinkedListWithThreeValues = new MyLinkedListImpl();
    private static final MyLinkedListImpl myLinkedListWithOneValue = new MyLinkedListImpl();
    private static final MyClass myClass = new MyClass("test", 1);
    private static final LinkedList listTest = new LinkedList();

    @BeforeAll
    static void initAll(){
        MyClass myClass2 = new MyClass("test2", 2);
        MyClass myClass3 = new MyClass("a", 0);

        myLinkedListWithOneValue.add(myClass);
        myLinkedListWithThreeValues.add(myClass3);
        myLinkedListWithThreeValues.add(myClass);
        myLinkedListWithThreeValues.add(myClass2);
        listTest.add(myClass);
        listTest.add(myClass2);
        listTest.add(myClass3);
    }

    @Test
    @DisplayName(".contains()")
    void shouldReturnTrueTest(){
        Assertions.assertTrue( myLinkedListWithThreeValues.contains(new MyClass("a", 0)));
    }

    @Test
    @DisplayName(".add()")
    void shouldReturnTrueWhenListWithNewValueEqualsSameListTest(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(myClass);
        Assertions.assertEquals(myLinkedList.toString(), myLinkedListWithOneValue.toString());
    }

    @Test
    @DisplayName(".addFirst")
    void shouldReturnTrueWhenListWithNewFirstValueEqualsSameList(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(myClass);
        myLinkedList.add(new MyClass("test2", 2));
        myLinkedList.addFirst(new MyClass("a", 0));
        Assertions.assertEquals(myLinkedList.toString(), myLinkedListWithThreeValues.toString());
    }

    @Test
    @DisplayName(".addLast")
    void shouldReturnTrueWhenListWithNewLastValueEqualsSameList(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(new MyClass("a", 0));
        myLinkedList.add(myClass);
        myLinkedList.addLast(new MyClass("test2", 2));
        Assertions.assertEquals(myLinkedList.toString(), myLinkedListWithThreeValues.toString());
    }

    @Test
    @DisplayName(".add() by Index")
    void shouldReturnTrueWhenListWithNewValueByIndexEqualsSameList(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(new MyClass("a", 0));
        myLinkedList.add(new MyClass("test2", 2));
        myLinkedList.add(1, myClass);
        Assertions.assertEquals(myLinkedList.toString(), myLinkedListWithThreeValues.toString());
    }

    @Test
    @DisplayName(".get()")
    void shouldReturnTrueWhenGetValueEqualsSameValuesInAnotherListTest(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(myClass);
        Assertions.assertEquals(myLinkedList.get(0), myLinkedListWithOneValue.get(0));
    }

    @Test
    @DisplayName(".set()")
    void shouldReturnTrueWhenSetValueEqualsAtSameIndexInAnotherListTest(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(new MyClass("MissValue", 1000));
        myLinkedList.set(0, myClass);
        Assertions.assertEquals(myLinkedList.get(0), myLinkedListWithOneValue.get(0));
    }

    @Test
    @DisplayName(".remove()")
    void shouldReturnTrueWhenValueDeletedByIndexTest(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(myClass);
        myLinkedList.remove(0);
        Assertions.assertEquals(0, myLinkedList.size());
    }

    @Test
    @DisplayName(".remove(E e)")
    void shouldReturnTrueWhenValueDeletedTest(){
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.add(myClass);
        myLinkedList.remove(myClass);
        Assertions.assertEquals(0, myLinkedList.size());
    }

    @Test
    @DisplayName(".size()")
    void shouldReturnTrueWhenSizeEqualsOneTest(){
        Assertions.assertEquals(myLinkedListWithOneValue.size(), 1);
    }

    @Test
    @DisplayName(".sort()")
    void shouldReturnTrueAfterSortTest(){
        MyLinkedListImpl myLinkedList = myLinkedListWithThreeValues;
        listTest.sort(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.compareTo(o2);
            }
        });
        myLinkedList.sort(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.compareTo(o2);
            }
        });
        Assertions.assertEquals(listTest.toString(), myLinkedList.toString());
    }

}
