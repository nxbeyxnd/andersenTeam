package ru.andersen.app.user_patterns.alexey.practice.classes;
/* 
21.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.classes
*/

public class TestClass extends AbstractClassTest2 {
    private int i = 10;

    @Override
    public int createNewValue() {
        return super.createNewValue();
    }

    public void run() {
        Object is = new AbstractClassTest2() {
        }.createNewValue();
        InnerClass innerClass = new InnerClass();
        innerClass.testMethod(innerClass.createNewValue(), i);

    }

    class InnerClass extends AbstractClassTest {
        @Override
        public int createNewValue() {
            return super.createNewValue();
        }

        public void testMethod(int x, int y) {
            System.out.println(x + y);
        }
    }
}
