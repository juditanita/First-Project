package exceptionhandling;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {

            ThrowingExceptions.validateNumber(-6);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
