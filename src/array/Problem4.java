package array;

import java.util.ArrayList;
import java.util.List;

/*
Ref - https://www.geeksforgeeks.org/combinational-sum/
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of
candidates where the chosen numbers sum to target. You may return the combinations in any order.

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.


 */
public class Problem4 {
    public static void main(String[] args) {
        List<List<Integer>> lst  = new ArrayList<>();
        List<Integer> temp  = new ArrayList<>();
        int arr[] = {2,3,6,7};
        int target  = 7;
        findCombinations(lst,arr, target, temp, 0);
        System.out.println(lst.toString());
    }


    private static  void findCombinations(List<List<Integer>> lst, int arr[], int target, List<Integer> temp, int index)
    {
        //break condition for recursion
        if(target == 0)
        {
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index; i<arr.length; i++)
        {

            if (target - arr[i] >=0) //since  the array is sorted, otherwise would need to sort
            {
                temp.add(Integer.valueOf(arr[i]));

                findCombinations(lst, arr, target - arr[i], temp, i);
                //Note  index is also passed, because we  are taking all the possible combination

                temp.remove(Integer.valueOf(arr[i]));
                //Note: lst.remove() has two method list.remove(index i) list.remove(object o) - so Integer.valueOf(arr[i]) removes  object
                //otherwise it will remove from that index. Also instead of temp.clear() we are removing object for some reason
            }

        }
    }
}
