package ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method
*/

import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Rarity;

public class Sword implements Weapon{
    private final double swordDamage = 228d;
    private final Rarity rarity;

    public Sword(Rarity rarity) {
        this.rarity = rarity;
    }


    @Override
    public double showDamage() {
        return swordDamage;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "swordDamage=" + swordDamage +
                ", rarity=" + rarity +
                '}';
    }
}
