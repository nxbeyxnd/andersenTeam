package ru.andersen.app.user_patterns.alexey.behavioral.cor;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.cor 
*/

import ru.andersen.app.user_patterns.alexey.behavioral.cor.model.*;

public class CORMain {
    public static void main(String[] args) {
        DbRequest dbRequest = new DbRequest("test@mail", "123");
        Authentication authentication = new EmailAuthValidation(dbRequest)
                .chainHelper(new PasswordAuthValidation(dbRequest))
                .chainHelper(new RegisterUserCredentials(dbRequest));

        if (authentication.checkCredentials(dbRequest)) System.out.println("OK: 200");
        System.out.println(DatabaseSingleton.userDatabase.entrySet());
    }
}
