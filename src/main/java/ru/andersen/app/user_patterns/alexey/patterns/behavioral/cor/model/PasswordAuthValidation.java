package ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model
*/

public class PasswordAuthValidation extends Authentication {

    public PasswordAuthValidation(DbRequest request) {
        super(request);
    }

    @Override
    public boolean checkCredentials(DbRequest request) {
        if (request.getPassword().equals("123")){
            System.out.println("Password is not valid");
            return false;
        }
        return checkNext(request);
    }
}