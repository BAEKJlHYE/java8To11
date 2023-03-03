package functionalInterface;

public class RunSomethingImpl {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class -> 줄여서 사용 가능
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

        // 람다로 축약
//        RunSomething runSomething = () -> System.out.println("Hello");

        // 두 줄 이상일 경우
        RunSomething runSomething = () -> {
            System.out.println("Hello");
            System.out.println("Lambda");
        };

        runSomething.doIt();
    }
}
