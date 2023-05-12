package factorymethod;
public class VegetarianBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Vegetarian burger ready");
    }
}
