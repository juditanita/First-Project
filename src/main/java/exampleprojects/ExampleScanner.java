package exampleprojects;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(name != null) {
            System.out.println("Hello " + name + ". Your age is " + age);
        }
        scanner.close();
    }

}
