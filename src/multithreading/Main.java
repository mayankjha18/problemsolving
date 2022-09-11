package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(4);
        Thread p = new Thread(new Producer(bq));
        Thread c = new Thread(new Consumer(bq));
        System.out.println("starting thread");
        p.start();
        c.start();
        p.join();
        c.join();
        System.out.println("started thread");
    }
}
