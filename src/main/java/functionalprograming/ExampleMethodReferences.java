package functionalprograming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {
        //reference method static method it can only used for the existing methods

        Function<Integer, String> nrToHexStringMethodRefernece = Integer::toHexString;

        nrToHexStringMethodRefernece.apply(4);
        System.out.println(nrToHexStringMethodRefernece.apply(256));

        // reference to an instance method of a particular object
        String prefix = "Hello";
        Function<String,String> greet =prefix::concat;

        System.out.println(greet.apply(" World"));

        //refernce to an instance method of an arbitarty object ofa a partical type
// the program know that you have 2 words, if they are equal the result is 0
        BiFunction<String, String, Integer> stringComparedMethodRef = String::compareToIgnoreCase;
        System.out.println(stringComparedMethodRef.apply("Hello", "hello"));
        //-3
        System.out.println(stringComparedMethodRef.apply("ello", "hello"));
        //16
        System.out.println(stringComparedMethodRef.apply("Huello", "hello"));

        //reference to a constructior create a supplier

        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        // 2nd element print
        System.out.println(names.get(2));
    }


}
