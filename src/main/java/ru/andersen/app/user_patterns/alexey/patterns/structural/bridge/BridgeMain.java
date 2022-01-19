package ru.andersen.app.user_patterns.alexey.patterns.structural.bridge;
/* 
16.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.bridge
*/

import ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model.BlackColor;
import ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model.BlueColor;
import ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model.Circle;
import ru.andersen.app.user_patterns.alexey.patterns.structural.bridge.model.Square;

public class BridgeMain {
    public static void main(String... args){
        Square square = new Square(new BlackColor());
        Square square1 = new Square(new BlueColor());
        Circle circle = new Circle(new BlackColor());
        Circle circle1 = new Circle(new BlueColor());

        square.imagine();
        square1.imagine();
        circle.imagine();
        circle1.imagine();
    }
}
