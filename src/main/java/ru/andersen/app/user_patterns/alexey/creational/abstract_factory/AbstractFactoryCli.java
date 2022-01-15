package ru.andersen.app.user_patterns.alexey.creational.abstract_factory;
/* 
14.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.abstract_factory 
*/

import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.factory.KingForgeFactory;
import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.Dagger;

public class AbstractFactoryCli {
    public static void main(String[] args) {
        KingForgeFactory kingForgeFactory = new KingForgeFactory();

        Dagger dagger = kingForgeFactory.getDagger();

        System.out.println(dagger.showDamage());
    }
}
