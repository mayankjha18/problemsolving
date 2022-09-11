package multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> bq;

    public Producer(BlockingQueue<Integer> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bq) {
                if (bq.size() < 4) {
                    int a = (int) Math.random() * 100;
                    bq.add(a);
                    System.out.println("Producer added -  " + a);
//                    try {
//                        Thread.sleep(0);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }

                try {
                    bq.notify();
                    bq.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
