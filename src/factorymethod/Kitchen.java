package factorymethod;

public class Kitchen extends Factory{

    @Override
    public Burger createBurger(String productName) {
        if(productName.equals("Classic")){
            System.out.println("Classic burger made");
            return new ClassicBurger();
        }
        if(productName.equals("Veggie")){
            System.out.println("Veggie burger made");
            return new VegetarianBurger();
        }
        if(productName.equals("Royal")){
            System.out.println("Royal burger made");
            return new RoyalBurger();
        }
        System.out.println("The restaurant doesn't serve this : " + productName);
        return null;
    }
}
