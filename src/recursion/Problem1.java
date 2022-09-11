package recursion;

import java.util.ArrayList;
import java.util.List;
/*
passing reference in arrays type2() - how you could alter order of input in array
 */

public class Problem1 {

    public static void main(String[] args) {
        type1(10);

        //store values of recursion passing reference in the method call
        List<Integer> list = new ArrayList<>();
        type2(10, list);
        System.out.print("Elements in array - ");
        for(int i : list) {
            System.out.print(i + ",");
        }
    }

    static void type1(int n)
    {
        if(n==0)
            return;

        type1(n/2);
        System.out.println(n);
    }

    // switch b/w commented and non-commented lst.add() - to decide the order of storing element from recursion stack
    static void type2(int n, List<Integer> lst)
    {
        if(n==0)
            return;

        lst.add(n);

        type2(n/2, lst);

//        lst.add(n);

    }


}
