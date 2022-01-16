
package ru.andersen.test.myLinkedListTest;
/*
04.01.2022: Alexey created this file inside the package: ru.andersen.test.myLinkedListTest
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.andersen.app.my_array_list_impl.MyClass;
import ru.andersen.app.my_linked_list_impl.MyLinkedListImpl;

import java.util.Comparator;

@DisplayName("MyLinkedListTests")
class MyLinkedListTests {
    private static MyLinkedListImpl<MyClass> myLinkedListWithThreeValues;
    private static MyLinkedListImpl<MyClass> myLinkedListWithOneValue;
    private static final MyClass myClass = new MyClass("test", 1);
    private static final MyClass myClass2 = new MyClass("test2", 2);
    private static final MyClass myClass3 = new MyClass("a", 0);

    @BeforeEach
    void init() {
        myLinkedListWithThreeValues = new MyLinkedListImpl<>();
        myLinkedListWithOneValue = new MyLinkedListImpl<>();
        myLinkedListWithOneValue.add(myClass);
        myLinkedListWithThreeValues.add(myClass);
        myLinkedListWithThreeValues.add(myClass2);
        myLinkedListWithThreeValues.add(myClass3);
    }

    @Test
    @DisplayName(".contains()")
    void shouldReturnTrueTest() {
        Assertions.assertTrue(myLinkedListWithThreeValues.contains(new MyClass("a", 0)));
    }

    @Test
    @DisplayName(".add()")
    void shouldReturnTrueWhenListWithNewValueEqualsSameListTest() {
        myLinkedListWithOneValue.addFirst(myClass);
        Assertions.assertEquals(myClass, myLinkedListWithOneValue.get(1));
    }

    @Test
    @DisplayName(".addFirst")
    void shouldReturnTrueWhenListWithNewFirstValueEqualsSameList() {
        myLinkedListWithThreeValues.addFirst(myClass);
        Assertions.assertEquals(myClass, myLinkedListWithThreeValues.get(0));
    }

    @Test
    @DisplayName(".addLast")
    void shouldReturnTrueWhenListWithNewLastValueEqualsSameList() {
        myLinkedListWithOneValue.addLast(myClass);
        Assertions.assertEquals(myClass, myLinkedListWithOneValue.get(1));
    }

    @Test
    @DisplayName(".add() by Index")
    void shouldReturnTrueWhenListWithNewValueByIndexEqualsSameList() {
        myLinkedListWithThreeValues.add(1, myClass);
        Assertions.assertEquals(myClass, myLinkedListWithThreeValues.get(1));
    }

    @Test
    @DisplayName(".get()")
    void shouldReturnTrueWhenGetValueEqualsSameValuesInAnotherListTest() {
        myLinkedListWithThreeValues.add(1, myClass3);
        Assertions.assertEquals(myClass3, myLinkedListWithThreeValues.get(1));
    }

    @Test
    @DisplayName(".set()")
    void shouldReturnTrueWhenSetValueEqualsAtSameIndexInAnotherListTest() {
        myLinkedListWithThreeValues.set(1, myClass3);
        Assertions.assertEquals(myClass3, myLinkedListWithThreeValues.set(1, myClass));
        myLinkedListWithThreeValues.set(1, myClass);
        Assertions.assertEquals(myClass, myLinkedListWithThreeValues.get(1));
    }

    @Test
    @DisplayName(".remove()")
    void shouldReturnTrueWhenValueDeletedByIndexTest() {
        myLinkedListWithOneValue.remove(0);
        Assertions.assertEquals(0, myLinkedListWithOneValue.size());
    }

    @Test
    @DisplayName(".remove(E e)")
    void shouldReturnTrueWhenValueDeletedTest() {
        Assertions.assertTrue(myLinkedListWithThreeValues.contains(myClass));
        myLinkedListWithThreeValues.remove(myClass);
        Assertions.assertFalse(myLinkedListWithThreeValues.contains(myClass));
    }

    @Test
    @DisplayName(".size()")
    void shouldReturnTrueWhenSizeEqualsOneTest() {
        Assertions.assertEquals(1, myLinkedListWithOneValue.size());
    }

    @Test
    @DisplayName(".sort()")
    void shouldReturnTrueAfterSortTest() {
        System.out.println(myLinkedListWithThreeValues);
        System.out.println(myClass3);
        myLinkedListWithThreeValues.sort(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(myLinkedListWithThreeValues);
        Assertions.assertEquals(myClass3, myLinkedListWithThreeValues.get(0));
    }
}
