package factorymethod;

public abstract class Factory {
    public abstract Burger createBurger(String productName);
    public Burger produceBurger(String productName) {
        Burger burger = createBurger(productName);
        burger.prepare();
        return burger;
    }
}