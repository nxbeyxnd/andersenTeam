package ru.andersen.app.user_patterns.alexey.patterns.creational.abstract_factory.model;/*
14.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.abstract_factory.model
*/

public interface WeaponFactory {
    Dagger getDagger();
    Knife getKnife();
    Spear getSpear();
}
