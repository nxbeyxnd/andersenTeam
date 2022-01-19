package ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model
*/

import java.util.HashMap;

public interface GoogleSearch {
    HashMap<String, Response> getResponse();

    Response searchSomething(String request);
}
