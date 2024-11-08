package functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreatSource {
    public static void main(String[] args) {
        //creating a stream from a collection

        List<String> names = Arrays.asList("Walnut", "Peanut", "Cashew");
        Stream<String> namesStream = names.stream();

        //creating a stream from the array

        String [] namesArray = {"Walnut", "Peanut", "Cashew"};
        Stream<String> namesArrayStream =Arrays.stream(namesArray);

        //Creating a stream using the Stream.iterate() method
        Stream<Integer> infinteStream = Stream.iterate(0, i -> i + 1);

        //Creating a stream using the Stream.generate() method
        Stream <Double> randomStream = Stream.generate(Math::random);
    }
}
