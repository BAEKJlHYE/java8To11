package functionalInterface;

@FunctionalInterface
public interface RunSomething {
    // 추상 메서드가 1개이면 함수형 인터페이스
    void doIt();

    // 추상 메서드 외 다른 메서드가 존재해도 됨
    static void printName() {
        System.out.println("name");
    }

    default void printAge() {
        System.out.println("age");
    }
}