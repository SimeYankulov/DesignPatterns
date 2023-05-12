package singleton;

import command.*;
import decorator.GarlicSauce;
import decorator.Ketchup;
import factorymethod.Burger;
import factorymethod.Kitchen;

import java.util.Scanner;

public class Restaurant {

    private static Restaurant instance;
    private Kitchen kitchen;
    private Cashier cashier;
    private Cook cook;


    private Restaurant() {
        this.kitchen = new Kitchen();
        this.cashier = new Cashier();
        this.cook = new Cook(this.kitchen);

    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void openRestaurant() {
        Scanner scanner = new Scanner(System.in);
        String order;
        while (true) {
            System.out.println("Place your order here:");
            order = scanner.nextLine();
            if (order.equals("")) {
                System.out.println("Restaurant closed");
                break;
            }
            if(order.equals("Classic")){
                Command cmd = new CookClassicBurger(this.cook);
                this.cashier.setCommand(cmd);
                this.cashier.placeOrder();
            }
            else  if(order.equals("Veggie")){
                Command cmd = new CookVeggieBurger(this.cook);
                this.cashier.setCommand(cmd);
                this.cashier.placeOrder();
            }
            else  if(order.equals("Royal")){
                Command cmd = new CookRoyalBurger(this.cook);
                this.cashier.setCommand(cmd);
                this.cashier.placeOrder();
            }
            else System.out.println("The restaurant doesn't serve :"+order);

            if(this.cook.getBurger() != null){
            System.out.println("Sauce :");
            order = scanner.nextLine();
            if(order.equals("Ketchup")){
                Burger burger =new Ketchup(this.cook.getBurger());
                burger.prepare();
            }else if(order.equals("Garlic")){
                Burger burger =new GarlicSauce(this.cook.getBurger());
                burger.prepare();
            }
            else System.out.println("The restaurant doesn't have this sauce : "+order);

            System.out.println("Burger served");
            }

        }
    }
}
