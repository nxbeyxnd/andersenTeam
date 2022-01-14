package ru.andersen.app.user_patterns.alexey.creational.abstract_factory.factory;
/* 
14.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.abstract_factory.factory 
*/

import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.Knife;

public class KingKnife implements Knife {
    private Double damage = 200d;

    @Override
    public Double showDamage() {
        return damage;
    }
}