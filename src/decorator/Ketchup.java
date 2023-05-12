package decorator;
import factorymethod.Burger;

public  class Ketchup extends BurgerDecorator {

private String sauce;

    public Ketchup(Burger burger){
        super(burger);
        this.sauce = "Ketchup";
    }

    @Override
    public void prepare() {
        this.addSauce();
    }

    private void addSauce() {
            System.out.println("Adding  : "+ this.sauce);
    }

}
