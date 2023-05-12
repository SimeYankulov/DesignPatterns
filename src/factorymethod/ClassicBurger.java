package factorymethod;
public class ClassicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Classic Burger ready");
    }
}
