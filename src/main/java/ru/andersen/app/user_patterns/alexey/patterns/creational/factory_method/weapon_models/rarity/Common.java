package ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models
*/

public class Common implements Rarity {
    private final String rarity = "common";

    @Override
    public String showRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return "Common{" +
                "rarity='" + rarity + '\'' +
                '}';
    }
}
