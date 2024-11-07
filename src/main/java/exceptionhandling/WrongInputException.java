package exceptionhandling;

public class WrongInputException extends Exception{
    // constructors  no arguments

    public WrongInputException(){
        super();
    }

    public WrongInputException(String message){
        super(message);
    }

    public WrongInputException(Exception e){
        super(e);
    }


}
