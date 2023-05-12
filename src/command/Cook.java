package command;

import factorymethod.Burger;
import factorymethod.Kitchen;

public class Cook {
    private Kitchen kitchen;
    private String burgerType;
    private Burger burger;

    public Cook(Kitchen kitchen){
        this.kitchen = kitchen;
    }

    public void CookBurger(String burgerType){
        this.burgerType = burgerType;
        this.burger = this.Cook();
    }

    public Burger Cook(){
        return this.kitchen.produceBurger(burgerType);
    }

    public Burger getBurger(){
        return this.burger;
    }
}
