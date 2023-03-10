package changeOfInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
//        basicAndStaticMethod1();

        List<String> names = new ArrayList<>();
        names.add("jihye");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

//        forEach(names);
//        spliterator(names);


    }

    public static void spliterator(List<String> names) {
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("----------------------------------------------");
        while (spliterator1.tryAdvance(System.out::println));
    }

    public static void forEach(List<String> names) {
        names.forEach(System.out::println);
    }

    public static void basicAndStaticMethod1() {
        DefaultGreeting defaultGreeting = new DefaultGreeting("jihye");
        defaultGreeting.printName();
        defaultGreeting.printNameUpperCase();
    }
}
