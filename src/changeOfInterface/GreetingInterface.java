package changeOfInterface;

public interface GreetingInterface {
    void printName();

    default void printNameUpperCase() {
        System.out.println("GreetingInterface");
    };
}
