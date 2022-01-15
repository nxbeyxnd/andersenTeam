package ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.factory_method 
*/

import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.rarity.Rarity;

public class Bow implements Weapon {
    private double bowDamage = 322d;
    private Rarity rarity;

    public Bow(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public double showDamage() {
        return bowDamage;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "bowDamage=" + bowDamage +
                ", rarity=" + rarity +
                '}';
    }
}
