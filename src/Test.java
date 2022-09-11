import java.util.Arrays;

public class Test {


    public static void main(String args[]) throws InterruptedException
    {
        String str = "mayank";

//        int arr[]= new int[99];
//        int num=1;
//        for(int i=0; i<99; i++)
//        {
//            if(i==65)
//            {
//              num++;
//            }
//            arr[i]= num;
//            num++;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
        int  arr[] ={15, 18, 22, 23, 26, 312,13 ,14};
        pointofRotation(arr);

//        Runnable r1 = new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                Test test = new Test();
//                test.printsomething(str);
//            }
//        };
//
//        Runnable r2 = new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                Test test = new Test();
//                test.printsomething("amayank");
//            }
//        };
//
//        Thread t1 = new Thread(r1);
//        Thread t2  = new Thread(r2);
//        t1.start();
//        t2.start();
//
//        t1.join();;
//        t2.join();

    }

    public synchronized void test (String str)
    {
        System.out.println("waiting thread"+Thread.currentThread().getName());
        synchronized (str)
        {
            try
            {
                System.out.println("Inside synchronnized"+Thread.currentThread().getName());
                Thread.sleep(5000);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }


    public static synchronized void pointofRotation(int[] arr)
    {
        int low = 0;
        int high = arr.length;

        while(low<high)
        {
            int mid = (low+high)/2;
            System.out.println(low+" low-mid "+mid);
            if(mid+1<arr.length && arr[mid]>arr[mid+1])
            {
                System.out.println(arr[mid]);
                return;
            }
            else if(mid>0 && arr[mid]<arr[mid-1])
            {
                System.out.println(arr[mid-1]);
                return;
            }
            if(arr[mid]<arr[low])
            {
                high = mid;
            }
            else
            {
                low=mid;
            }

        }
        System.out.println(0);

    }
}
