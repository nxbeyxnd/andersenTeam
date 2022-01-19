package ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model
*/

public class RegisterUserCredentials extends Authentication {

    public RegisterUserCredentials(DbRequest request) {
        super(request);
    }

    @Override
    public boolean checkCredentials(DbRequest request) {
        if (!DatabaseSingleton.save(request.getEmail(), request.getPassword())) return false;
        System.out.println("user register successfully!");
        return checkNext(request);
    }
}
