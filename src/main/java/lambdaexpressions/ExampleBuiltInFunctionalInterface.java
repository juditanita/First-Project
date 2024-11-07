package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFunctionalInterface {
    public static void main(String[] args) {



//with lambda
        Supplier <String> s1 =()-> "Hello World";

        Consumer<String> c1 = s3 -> System.out.println("Consumer lambda " +s3);
        c1.accept("Hello from consumer");

        Predicate<String> p1 = s -> s.length() <5;
        System.out.println(p1.test("Hello World To Consumer"));

    }
}
