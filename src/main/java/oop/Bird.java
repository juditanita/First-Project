package oop;

public class Bird extends Animal{


    public  Bird(){
        super("Chirps");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound" + getSound());
    }

}
