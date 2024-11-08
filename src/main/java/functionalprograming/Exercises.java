package functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("ABdd", "Toudo","Haop","nond", "apacuka", "fundaluka", "fundakave");

        // uppercase all names
        List<String> toUpperCase = names.stream().map(String::toUpperCase).toList();
        System.out.println(toUpperCase);

        //get a the square only the even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,14,9,88,39);
        List<Integer> numbers2 = numbers.stream().filter(x -> x % 2 != 0).map(x->x*x).toList();
        System.out.println(numbers2.get(2));

        long evenNumbsSum=numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println("There are "+ evenNumbsSum + " even numbers in the list");

        // get only a 6 character long names in uppercase
       List <String>newNames= names.stream().filter(x->x.length() >6).map(String::toUpperCase).toList();
       System.out.println(newNames);

       //names print out with lambda and steam api
       newNames.forEach(System.out::println);
       newNames.forEach(s->System.out.println("With lambda method "+ s));

       // sum of the squared numbers
       List<Integer> numberSmall = Arrays.asList(1,2,3,4);
       Optional<Integer> totalSum = numberSmall.stream().map(x->x*x).reduce(Integer::sum);
       System.out.println(totalSum.get());

       //max value os the numbers
        Optional<Integer> sum = numbers.stream().max(Integer::compare);

        System.out.println(sum.get());

    }
}
