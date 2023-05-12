package command;

public class CookVeggieBurger implements Command {

    private Cook cook;

    public CookVeggieBurger(Cook cook){ this.cook = cook;}
    @Override
    public void execute() {
        System.out.println("The chef is cooking your burger");
        this.cook.CookBurger("Veggie");
    }
}
