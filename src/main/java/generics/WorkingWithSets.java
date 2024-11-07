package generics;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(200);
        integerSet.add(24);
        integerSet.add(28);
        integerSet.add(2);
        integerSet.add(30);


        for (Integer i: integerSet){


            if(i == 24){
                System.out.println("Two is found");
                break;
            }else{
                System.out.println(i);
            }

        }
    }
}
