package ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.factory_method 
*/

import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.Sword;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.Weapon;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.rarity.Rarity;

public class SwordWeaponFactory implements CraftWeaponFactory{
    @Override
    public Weapon createWeapon(Rarity rarity) {
        return new Sword(rarity);
    }
}
