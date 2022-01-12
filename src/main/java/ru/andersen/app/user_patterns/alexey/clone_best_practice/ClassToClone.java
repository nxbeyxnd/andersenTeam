package ru.andersen.app.user_patterns.alexey.clone_best_practice;
/* 
11.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.clone 
*/


public class ClassToClone implements Cloneable {
    private int id;
    private final Object[] test;

    public ClassToClone(int id, Object[] test) {
        this.id = id;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Alternative method how to clone Object is Copy Constructor;
     *
     * @param clone class to copy
     */
    public ClassToClone(ClassToClone clone) {
        this.id = clone.id;
        this.test = clone.test;
    }

    /**
     * Minuses of clone() method:
     * 1. Constructor not initialized, for example - Date() which must init in constructor when created.
     * 2. Doesn't work with final variables;
     * 3. Throw new exception CloneNotSupportedException (need to implements Cloneable) - u can catch it or method will throw CloneNoSupportedException;
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public ClassToClone clone() throws CloneNotSupportedException {
//        ClassToClone result = (ClassToClone) super.clone();
//        result.test = test; // <- Cannot assign a value to final variable 'test' because var already initialized;
//        return (ClassToClone) super.clone();
        try {
            ClassToClone result = (ClassToClone) super.clone();
//            result.test = test; // <- Cannot assign a value to final variable 'test' because var already initialized;
            return result;
        } catch (CloneNotSupportedException e){
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "ClassToClone{" +
                "id=" + id +
                ", test=" + test +
                '}';
    }
}
