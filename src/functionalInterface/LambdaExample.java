package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaExample {
    public static void main(String[] args) {
        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println("local class : " + baseNumber);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printBaseNumber();

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println("anonymous class : " + baseNumber);
            }
        };

        integerConsumer.accept(12);

        // 람다
        // 로컬 클래스, 익명 클래스는 shadowing이 됨 (두 개는 별도의 scope라서)
        // 람다는 shadowing이 안 됨
        IntConsumer printInt = (i) -> System.out.println("lambda : " + (i + baseNumber));
        printInt.accept(10);
    }
}
