package ru.andersen.app.user_patterns.anton.facade;

public class KitchenBoy {
    public void cookingDish(Chef chef){
        if(chef.Cooking()){
            System.out.println("I have to cook something");
        } else {
            System.out.println("I have not to cook something");
        }
    }
}
