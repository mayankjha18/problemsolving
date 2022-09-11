package multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> bq;
    public  Consumer(BlockingQueue<Integer> bq)
    {
        this.bq =bq;
    }

    @Override
    public void run() {

        while(true)
        {
            synchronized (bq)
            {
                if(bq.size()>0)
                {
                    Integer a = bq.poll();
                    System.out.println("Consumer consumed -  " + a);
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
