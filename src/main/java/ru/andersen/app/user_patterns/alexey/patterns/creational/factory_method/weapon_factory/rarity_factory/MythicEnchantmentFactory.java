package ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_factory.rarity_factory;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_factory
*/

import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Mythic;
import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Rarity;

public class MythicEnchantmentFactory implements EnchantmentRarityFactory{
    @Override
    public Rarity setRarity() {
        return new Mythic();
    }
}
