package treatandconcurrency;

public class SharedCounterDemo {
    static int counter = 0;

    static synchronized void increment() {
        int current = counter;
        System.out.println("The current counter is " + current);
        counter++;
        System.out.println("The counter increased to " + counter);
    }

    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            new Thread(SharedCounterDemo::increment).start();
        }
    }
}
