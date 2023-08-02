package graph;


import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws SocketTimeoutException {
        Map<String, String> map
                = Map.of("1", "GFG",
                "2", "Geek",
                "3", "GeeksForGeeks");
        System.out.println(String.valueOf(map));


            String test =  "names.csv.pgp";
            String test2 = "names.csv.zip.pgp";
            String temp = test.replaceFirst(".pgp","");
            String temp2 =  test2.replaceFirst(".pgp","");
            System.out.println(temp);
            System.out.println(temp2);

            Random rand = new Random();
            int random = rand.nextInt(50);
            System.out.println("radom = "+ random);


//        System.out.println(meth2());
    }

    private static void meth1() throws SocketTimeoutException {
        if(true)
        {
            throw new SocketTimeoutException();
        }
    }

    private static String meth2() throws SocketTimeoutException {
        String test = null;
        try {
            meth1();
            System.out.println("Hello1");
        }
        catch(SocketTimeoutException ex)
        {
            System.out.println("Hello2");
            throw new NullPointerException();
        }
        catch(Exception e)
        {
            System.out.println("Hello5");

        }
        finally {
            System.out.println("Hello from finally");
            test = "mayank";
        }

        return test;

    }
}
