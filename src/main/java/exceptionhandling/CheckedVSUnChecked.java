package exceptionhandling;

public class CheckedVSUnChecked {

    public static void validateString(String input) throws EmptyStringException {
        if (input.isEmpty()){
            throw new EmptyStringException("The provided string is empty");

        }
    }


}
