package ru.andersen.app.user_patterns.alexey.behavioral.observer;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.observer 
*/

import ru.andersen.app.user_patterns.alexey.behavioral.observer.model.Observer;
import ru.andersen.app.user_patterns.alexey.behavioral.observer.model.PostCreatePage;
import ru.andersen.app.user_patterns.alexey.behavioral.observer.model.Reader;

public class ObserverCli {
    public static void main(String[] args) {
        PostCreatePage postCreatePage = new PostCreatePage();

        postCreatePage.addPost("test");
        postCreatePage.addPost("test1");
        postCreatePage.addPost("test2");
        postCreatePage.addPost("test3");
        postCreatePage.addPost("test4");

        Observer user = new Reader("Feed");
        Observer user2 = new Reader("Stories");

        postCreatePage.addObserver(user);
        postCreatePage.addObserver(user2);

        postCreatePage.addPost("test4");

        postCreatePage.removeObserver(user);
        postCreatePage.addPost("test4");
    }
}
