package interfaceExercise;

public interface Drawable {

    //signature method
    void draw();


    //default method
    default void erase(){
        System.out.println("Erasing drawing");
    }

    default void printInfo(){

    }
}
