package treatandconcurrency;

public class RunnableInterfaceDemo {
    static class NumberPrinter implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread= new Thread(new NumberPrinter());
        thread.start();
    }

}


