package ru.andersen.app.user_patterns.alexey.behavioral.visitor;
/* 
18.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.behavioral.visitor 
*/

import ru.andersen.app.user_patterns.alexey.behavioral.visitor.model.ApparatVisitor;
import ru.andersen.app.user_patterns.alexey.behavioral.visitor.model.Phone;

public class VisitorCli {
    public static void main(String[] args) {
        ApparatVisitor apparatVisitor = new ApparatVisitor();
        Phone phone = new Phone("/src/newFolder/logo.img", "Hello visitor");
        System.out.println(apparatVisitor.getPhone(phone));
    }
}
