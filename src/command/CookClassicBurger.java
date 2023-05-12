package command;

public class CookClassicBurger implements Command {

    private Cook cook;

    public CookClassicBurger(Cook cook){ this.cook = cook;}
    @Override
    public void execute() {
        System.out.println("The chef is cooking your burger");
        this.cook.CookBurger("Classic");
    }
}
