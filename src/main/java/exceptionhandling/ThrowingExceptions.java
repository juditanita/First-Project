package exceptionhandling;

public class ThrowingExceptions extends IllegalArgumentException  {

    public static void validateNumber(int a){
        if(a <0){
            throw new IllegalArgumentException("Number is negative");
        }

    }
}
