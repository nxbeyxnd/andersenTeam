package ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.factory_method 
*/

import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.rarity.Rarity;

public class Axe implements Weapon {
    private final double axeDamage = 1337d;
    private final Rarity rarity;

    public Axe(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public double showDamage() {
        return axeDamage;
    }

    @Override
    public String toString() {
        return "Axe{" +
                "axeDamage=" + axeDamage +
                ", rarity=" + rarity +
                '}';
    }
}
