package ru.andersen.app.user_patterns.anton.facade;

public class Kitchen {
    Chef chef = new Chef();
    KitchenBoy kitchenBoy = new KitchenBoy();
    public void cook(){
       chef.needCooking();
       kitchenBoy.cookingDish(chef);
    };
}
