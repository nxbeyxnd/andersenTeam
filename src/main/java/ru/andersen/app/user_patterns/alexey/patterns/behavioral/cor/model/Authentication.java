package ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model
*/

public abstract class Authentication {
    private Authentication authenticationNext;
    private boolean checkStatus = true;
    private DbRequest request;

    public Authentication(DbRequest request) {
        this.request = request;
    }

    public Authentication chainHelper(Authentication authentication) {
        authenticationNext = authentication;
        return authenticationNext;
    }

    public abstract boolean checkCredentials(DbRequest request);

    protected boolean checkNext(DbRequest request) {
        if (authenticationNext == null) {
           return true;
        }
        return authenticationNext.checkNext(request);
    }
}
