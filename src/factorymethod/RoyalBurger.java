package factorymethod;
public class RoyalBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Royal Burger ready");
    }
}
