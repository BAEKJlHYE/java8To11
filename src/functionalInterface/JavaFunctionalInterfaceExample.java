package functionalInterface;

import java.util.function.*;

public class JavaFunctionalInterfaceExample {
    public static void main(String[] args) {
//        function();
//        consumer();
//        supplier();
//        predicate();
        unaryOperator();
    }

    static void unaryOperator() {
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }

    static void predicate() {
        Predicate<String> startsWithKeesun = (s) -> s.startsWith("keesun");
        System.out.println(startsWithKeesun.test("keesun"));
        System.out.println(startsWithKeesun.test("keesum"));
    }

    static void supplier() {
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());
    }

    static void consumer() {
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
    }

    static void function() {
//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(multiply2.apply(1));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));

        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
