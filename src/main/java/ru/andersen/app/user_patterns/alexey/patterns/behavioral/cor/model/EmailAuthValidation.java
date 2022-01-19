package ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.behavioral.cor.model
*/

public class EmailAuthValidation extends Authentication{

    public EmailAuthValidation(DbRequest request) {
        super(request);
    }

    @Override
    public boolean checkCredentials(DbRequest request) {
        if(DatabaseSingleton.findByEmail(request.getEmail())){
            System.out.println("Current Email already exists " + request.getEmail());
            return false;
        }
        return checkNext(request);
    }
}
