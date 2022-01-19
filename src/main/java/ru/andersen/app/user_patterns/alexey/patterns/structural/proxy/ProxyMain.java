package ru.andersen.app.user_patterns.alexey.patterns.structural.proxy;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.proxy
*/

import ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model.GoogleSearchCachedDriver;

public class ProxyMain {
    public static void main(String[] args) {
        GoogleSearchCachedDriver googleSearchCachedDriver =new GoogleSearchCachedDriver();

        System.out.println(googleSearchCachedDriver.getResponse());
        System.out.println(googleSearchCachedDriver.searchSomething("vk"));
    }
}
