package ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.rarity;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models 
*/

public class Rare implements Rarity{
    private String rarity = "rare";

    @Override
    public String showRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return "Rare{" +
                "rarity='" + rarity + '\'' +
                '}';
    }
}
