package ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model
*/

import java.util.HashMap;

public class GoogleSearchDriver implements GoogleSearch{
    @Override
    public HashMap<String, Response> getResponse() {
        return getRequest();
    }

    @Override
    public Response searchSomething(String request) {
        return getRequest().get(request);
    }

    private HashMap<String, Response> getRequest(){
        HashMap<String, Response> search = new HashMap<>();
        search.put("vk", new Response("vk.com","HTML vk page example", 200));
        search.put("youtube", new Response("youtube.com","HTML  youtube page example", 200));
        search.put("fb", new Response("fb.com","HTML fb page example", 200));
        search.put("instagram", new Response("inst.com","HTML instagram page example", 200));
        return search;
    }
}
