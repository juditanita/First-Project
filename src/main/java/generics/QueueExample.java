package generics;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> characters= new ArrayDeque<Character>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        System.out.println(characters);

    }
}
