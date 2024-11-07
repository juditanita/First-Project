package lambdaexpressions;

import java.time.LocalDateTime;

import static java.time.temporal.TemporalQueries.localDate;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();


        Calculator c1 = (x, y)-> x + y;
       int result = c1.calculate(3,5);
        System.out.println(result);

        Calculator c2 = (x, y)-> x - 2*y;

        Calculator c3 = (x, y)-> {
            System.out.println("Hello " + localDateTime);
            return ((4*x+ 7*y)/(x *3));
        };


        result = c2.calculate(result,5);
        System.out.println(result);
        double result2 = c3.calculate(4,8);
        System.out.println(result2);


        Printer p1 = s-> System.out.println("Printer says "+ s);
        p1.print("Hello");


        NumberProvider np1=()->53;
        System.out.println(np1.provide());
    }
}
