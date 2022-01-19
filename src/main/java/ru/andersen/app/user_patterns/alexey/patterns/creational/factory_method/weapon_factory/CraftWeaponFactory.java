package ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_factory;/*
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method
*/

import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.Weapon;
import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Rarity;

public interface CraftWeaponFactory {
    Weapon createWeapon(Rarity rarity);
}
