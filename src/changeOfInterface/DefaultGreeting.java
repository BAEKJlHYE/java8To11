package changeOfInterface;

public class DefaultGreeting implements GreetingInterface {
    @Override
    public void printName() {
        System.out.println("DefaultGreeting");
    }
}
