package functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut", "Peanut", "Cashew");
        Stream<String> namesStream = names.stream();


        //the stream can only be used once!!
        // foreach
        namesStream.forEach(System.out::println);

        //count need to creat the stream again
        long nrOfItem = names.size();
        System.out.println(nrOfItem);

        //min and max
        Optional<String> min = names.stream().min((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println(min.get());

        Optional<String> max = names.stream().max((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println(max.get());

        //all match nonemath

        boolean allBiggerThan5 = names.stream().allMatch((s1)->s1.length()>5);
        System.out.println(allBiggerThan5);

        //anymatch
        boolean anyBiggerThan5 = names.stream().anyMatch((s1)->s1.length()>5);
        System.out.println(" Any of them bigger than 5: "+anyBiggerThan5);


        //nonematch if it finds one element which is not bigger then 5 it will come back as none of them
        boolean noneBiggerThan5 = names.stream().noneMatch((s1)->s1.length()>5);
        System.out.println(" None of them bigger than 5: "+noneBiggerThan5);

        //collect transform the steam and turns them into a list, Set or a Map
        List<String> namesList =names.stream().toList();
        Set<String> namesSet=names.stream().collect(Collectors.toSet());
        System.out.println(namesList);

        //reduce, reducing tha single value

        Optional<String> totalString =names.stream().reduce(String::concat);
        System.out.println(totalString.get());


    }
}
