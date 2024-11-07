package lambdaexpressions;

import java.util.function.*;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.time.temporal.TemporalQueries.localDate;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
Calculator c1 = (x, y) -> x + y;
       int result = c1.calculate(3,5);
        System.out.println(result);

        Calculator c2 = (x, y)-> x - 2*y;

        Calculator c3 = (x, y)-> {
            System.out.println("Hello " + localDateTime);
            return ((4*x+ 7*y)/(x *3));
        };


        result = execute(5,6, c1);
        System.out.println(result);

        result= execute(3,4, c2);
        System.out.println(result);
        double result2 =  execute(7,5,c3);
        System.out.println(result2);


        Printer p1 = s-> System.out.println("Printer says "+ s);
        p1.print("Hello");


        NumberProvider np1=()->53;
        System.out.println(np1.provide());



        NumericOperator add= (a, b) -> a + b;
        NumericOperator max= (a, b) -> a > b ? a : b;
        System.out.println(add.operate(32,8));
        System.out.println(max.operate(40, add.operate(32,8)));


        StringFormater text = (s)->s.toUpperCase();
        System.out.println(text.format("Hello Gina"));


//with lambda
        Supplier<String> s1 =()-> "Hello World";

        Consumer<String> c12 = s3 -> System.out.println("Consumer lambda " +s3);
        c12.accept("Hello from consumer");

        Predicate<String> p12 = s -> s.length() <5;
        System.out.println(p12.test("Hello World To Consumer"));


        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Hello World"));


    }

    public static int execute(int nr1, int nr2,Calculator calculator) {
        return calculator.calculate(nr1, nr2);

    }
}
