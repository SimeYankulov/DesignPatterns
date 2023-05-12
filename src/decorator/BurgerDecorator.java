package decorator;

import factorymethod.Burger;

public abstract class BurgerDecorator implements Burger{

   protected Burger burger;
    public BurgerDecorator(Burger burger) {
        super();
        this.burger = burger;
    }

    public void AddSauce(){}
}
