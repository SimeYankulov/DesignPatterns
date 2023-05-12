package command;

public class Cashier {
    private Command command;

    public void setCommand(Command cmd) {
        this.command = cmd;
        System.out.println("Cashier received your order");
    }
    public void placeOrder(){
        this.command.execute();
    }
}
