package decorator;

import factorymethod.Burger;

public class GarlicSauce extends BurgerDecorator {

    private String sauce;

    public GarlicSauce(Burger burger) {
        super(burger);
        this.sauce = "Garlic Sauce";
    }

    @Override
    public void prepare() {
        this.addSauce();
    }

    private void addSauce() {
        System.out.println("Adding  : " + this.sauce);
    }
}
