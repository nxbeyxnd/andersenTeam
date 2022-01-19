package ru.andersen.app.user_patterns.alexey.stream.hw;
/* 
19.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.stream.hw 
*/

public class Human {
    private String name;
    private Integer age;
    private String id;
    private String surname;

    public Human(String name, Integer age, String id, String surname) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.surname = surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(Human human) {
        this.name = human.getName();
        this.surname = human.getSurname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
