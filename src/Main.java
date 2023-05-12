import singleton.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = Restaurant.getInstance();
        restaurant.openRestaurant();
    }
}