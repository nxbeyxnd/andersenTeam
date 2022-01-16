package ru.andersen.app.user_patterns.alexey.clone_best_practice;
/* 
11.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.clone 
*/

/**
 * Minuses of clone() method:
 * 1. Constructor not initialized, for example - Date() which must init in constructor when created.
 * 2. Doesn't work with final variables;
 * 3. Throw new exception CloneNotSupportedException (need to implement Cloneable) - u can catch it or method will throw CloneNoSupportedException;
 */
public class ClassToClone {
    private int id;
    private final Object[] test;

    public ClassToClone(int id, Object[] test) {
        this.id = id;
        this.test = test;
    }

    /**
     * Alternative method how to clone Object is Copy Constructor;
     *
     * @param clone class to copy
     */
    public ClassToClone(ClassToClone clone) {
        this.id = clone.id;
        this.test = clone.test.clone();
    }

    /**
     * Second method it's use static fabric method
     * @param clone class to clone
     * @return new class equals origin class
     */
    public static ClassToClone newInstance(ClassToClone clone) {
        ClassToClone classToClone = new ClassToClone(clone);
        return classToClone;
    }


}
