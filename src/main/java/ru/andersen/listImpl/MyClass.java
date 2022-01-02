package ru.andersen.listImpl;
/* 
02.01.2022: Alexey created this file inside the package: ru.andersen.listImpl 
*/

public class MyClass implements Comparable<MyClass>{
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(MyClass user) {
        int comparation = name.compareTo(user.name);
        if (comparation == 0){
            comparation = Integer.compare(age, user.age);
        }
        return comparation;
    }

    public int compareByName(MyClass user){
        return name.compareTo(user.name);
    }

    public int compareByAge(MyClass user){
        return Integer.compare(this.age, user.age);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
