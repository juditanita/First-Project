package treatandconcurrency;

public class BasicThreadCreation {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Hello from my thread");
        });
        t1.start();
    }
}
