package command;

public class CookRoyalBurger implements Command {

    private Cook cook;

    public CookRoyalBurger(Cook cook){ this.cook = cook;}
    @Override
    public void execute() {
        System.out.println("The chef is cooking your burger");
        this.cook.CookBurger("Royal");
    }
}
