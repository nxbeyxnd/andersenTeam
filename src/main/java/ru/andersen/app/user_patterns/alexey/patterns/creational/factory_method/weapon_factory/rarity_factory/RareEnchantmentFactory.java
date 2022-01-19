package ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_factory.rarity_factory;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_factory
*/

import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Rare;
import ru.andersen.app.user_patterns.alexey.patterns.creational.factory_method.weapon_models.rarity.Rarity;

public class RareEnchantmentFactory implements EnchantmentRarityFactory{
    @Override
    public Rarity setRarity() {
        return new Rare();
    }
}
