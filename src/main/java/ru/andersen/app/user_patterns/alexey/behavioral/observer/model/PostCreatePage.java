package ru.andersen.app.user_patterns.alexey.behavioral.observer.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.observer.model 
*/

import java.util.ArrayList;
import java.util.List;

public class PostCreatePage implements Observed {
    List<String> posts = new ArrayList<>();

    List<Observer> subs = new ArrayList<>();

    public void addPost(String post) {
        this.posts.add(post);
        updatePosts();
    }

    @Override
    public void addObserver(Observer observer) {
        subs.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subs.remove(observer);
    }

    @Override
    public void updatePosts() {
        for (Observer o : subs) o.handleEvent(this.posts);
    }
}
