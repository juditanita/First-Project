package generics;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("paper");
        shoppingList.add("pear");


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(199);
        numberList.add(1992);
        numberList.add(12);
        numberList.add(92);
        System.out.println(shoppingList);

        System.out.println(numberList);
        String firstItem = shoppingList.getFirst();
        System.out.println(firstItem);

        numberList.remove(2);
        shoppingList.remove(2);
       boolean containsApple= shoppingList.contains("apple");
        System.out.println(containsApple);
        System.out.println(shoppingList);
        System.out.println(numberList);





    }
}
