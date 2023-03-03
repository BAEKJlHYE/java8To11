package functionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
//        methodReference1();
        methodReference2();
    }

    private static void methodReference2() {
        String[] names = {"jihye", "toby", "moomin"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

    public static void methodReference1() {
        // 생성자 참조 1
        Function<String, Greeting> jihyeGreeting = Greeting::new;
        Greeting greeting1 = jihyeGreeting.apply("jihye");
        System.out.println(greeting1.getName());

        // 생성자 참조 2
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting2 = newGreeting.get();

        // 특정 객체의 인스턴스 메서드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("jihye"));

        // 스태틱 메서드 참조
        UnaryOperator<String> hi = Greeting::hi;
        System.out.println(hi.apply("jihye"));
    }
}
