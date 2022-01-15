package ru.andersen.app.user_patterns.alexey.creational.abstract_factory.factory;
/* 
14.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.abstract_factory.factory 
*/

import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.Dagger;
import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.Knife;
import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.Spear;
import ru.andersen.app.user_patterns.alexey.creational.abstract_factory.model.WeaponFactory;

public class KingForgeFactory implements WeaponFactory {
    @Override
    public Dagger getDagger() {
        return new KingDagger();
    }

    @Override
    public Knife getKnife() {
        return new KingKnife();
    }

    @Override
    public Spear getSpear() {
        return new KingSpear();
    }
}
