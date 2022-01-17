package ru.andersen.app.user_patterns.alexey.structural.proxy.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.proxy.model 
*/

import java.util.HashMap;

public class GoogleSearchCachedDriver implements GoogleSearch{
    private final GoogleSearchDriver googleSearchDriver;
    HashMap<String, Response> cachedSearch = new HashMap<>();

    public GoogleSearchCachedDriver() {
        this.googleSearchDriver = new GoogleSearchDriver();
    }

    @Override
    public HashMap<String, Response> getResponse() {
        if (cachedSearch.isEmpty()){
            return googleSearchDriver.getResponse();
        }
        else return cachedSearch;
    }

    @Override
    public Response searchSomething(String request) {
        return findInCache(request);
    }

    private Response findInCache(String request){
        if(cachedSearch.isEmpty()){
            return googleSearchDriver.searchSomething(request);
        }
        return cachedSearch.get(request);
    }
}
