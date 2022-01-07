package ru.andersen.app.my_array_list_impl;
/* 
02.01.2022: Alexey created this file inside the package: ru.andersen.listImpl 
*/

import java.util.Objects;

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
        int comp = name.compareTo(user.name);
        if (comp == 0){
            comp = Integer.compare(age, user.age);
        }
        return comp;
    }

    public int compareByName(MyClass user){
        return name.compareTo(user.name);
    }

    public int compareByAge(MyClass user){
        return Integer.compare(this.age, user.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return age == myClass.age && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
