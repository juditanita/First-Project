package treatandconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            service.submit(()->{
                System.out.println("Executin task in "+ Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}
