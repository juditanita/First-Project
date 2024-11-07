package generics;

import java.util.ArrayDeque;

import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {
        Queue<String> strings= new ArrayDeque<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        System.out.println(strings);


        Deque<String> strings2 = new ArrayDeque<String>();

        strings2.add("java");
        strings2.add("javascript");
        strings2.add("c#");
        strings2.add("python");
        strings2.addFirst("rust");
        strings2.addLast("remix");
        System.out.println(strings2.pollLast());


        System.out.println(strings2);
    }

}
