package ru.andersen.app.user_patterns.alexey.creational.factory_method;
/* 
13.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.factory_method.models 
*/

import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.rarity_factory.CommonEnchantmentFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.rarity_factory.EnchantmentRarityFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.rarity_factory.MythicEnchantmentFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.rarity_factory.RareEnchantmentFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.Weapon;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.AxeWeaponFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.BowWeaponFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.CraftWeaponFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_factory.SwordWeaponFactory;
import ru.andersen.app.user_patterns.alexey.creational.factory_method.weapon_models.rarity.Rarity;

/**
 * Realization of Pattern (Factory method)
 * Creating interface which create object. Every class has implements this interface chose which class it's can create;
 * Pluses:
 * 1. Simple creating new class instanceOf Weapon interface
 * 2. OCP (open closed principle) realization
 * 3. Creation of new Weapons in another method, it's more easily to write new code
 *
 * Minuses:
 * 1. If u have large hierarchy of classes u must create for each class another Class Creator,
 * it takes a lot of resources...;
 */
public class WeaponCli {
    public static void main(String[] args) {
        CraftWeaponFactory craftWeapon = createWeaponByName("sword");
        EnchantmentRarityFactory enchantmentRarity = enchantRarityByName("mythic");
        Rarity newRarity = enchantmentRarity.setRarity();
        Weapon newWeapon = craftWeapon.createWeapon(newRarity);

        System.out.println(newWeapon);
    }

    static CraftWeaponFactory createWeaponByName(String name){
        if (name.equalsIgnoreCase("sword")) return new SwordWeaponFactory();
        else if (name.equalsIgnoreCase("bow")) return new BowWeaponFactory();
        else if (name.equalsIgnoreCase("axe")) return new AxeWeaponFactory();
        else throw new RuntimeException(String.format("Weapon (%s) not exists.", name));
    }

    static EnchantmentRarityFactory enchantRarityByName(String rarityName){
        if (rarityName.equalsIgnoreCase("common")) return new CommonEnchantmentFactory();
        else if (rarityName.equalsIgnoreCase("rare")) return new RareEnchantmentFactory();
        else if (rarityName.equalsIgnoreCase("mythic")) return new MythicEnchantmentFactory();
        else throw new RuntimeException(String.format("Rarity (%s) not exists.", rarityName));
    }
}
