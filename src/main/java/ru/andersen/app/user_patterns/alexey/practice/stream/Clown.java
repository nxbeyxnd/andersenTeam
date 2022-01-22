package ru.andersen.app.user_patterns.alexey.practice.stream;
/* 
22.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.practice.stream 
*/

public class Clown {
    private Integer id;
    private String name;
    private Boolean isFunny;

    public Clown(Integer id, String name, Boolean isFunny) {
        this.id = id;
        this.name = name;
        this.isFunny = isFunny;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFunny() {
        return isFunny;
    }

    public void setFunny(Boolean funny) {
        isFunny = funny;
    }

    @Override
    public String toString() {
        return "Clown{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isFunny=" + isFunny +
                '}';
    }
}
