package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Find subsets with given sum, when a number can be picked unlimited times
 */

public class Problem2 {


    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum)
    {
        // This arraylist is created to store the answers, we will just pass it's reference in recursive  call to add subsets to it
        ArrayList<ArrayList<Integer> > ans
                = new ArrayList<>();
        //This arraylist will we used to store subsets which might qualify as possible subset
        ArrayList<Integer> temp = new ArrayList<>();

        // below code is just to remove duplicate and sort the array

        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    static void findNumbers(ArrayList<ArrayList<Integer> > ans, ArrayList<Integer> arr, int sum, int index, ArrayList<Integer> temp)
    {

        if (sum == 0) {
            // once condition is met just add the deep copy of temp list to our answer list
            ans.add(new ArrayList<>(temp));
            return;
        }

        // take every element one by one
        //check if the sum-element > 0 , if yes - make recursive call to find sum-element in the same array
        for (int i = index; i < arr.size(); i++)
        {

            // checking that sum does not become negative

            if ((sum - arr.get(i)) >= 0)
            {

                // adding element which can contribute to
                // sum

                temp.add(arr.get(i));

                /* the above for loop will call below findNumbers functions in iteration (from i=0 to 3) -
                so this will be like target-arr.get(i) =>
                    8-2 => findNumbers(6) (1st iteration of for loop)
                    8-4 => findNumbers(4) (2nd iteration of for loop)
                    8-6 => findNumbers(2) (3rd iteration of for loop)
                    8-8 => findNumbers(0) (4th iteration of for loop)
                    and each iteration then will recursively look for the new sum i.e 6,4,2,0
                    recursion will break for sum==0 or sum>0.
                 */
                findNumbers(ans, arr, sum - arr.get(i), i, temp);

                //this is important to note
                // removing element from list (backtracking) - since we are adding elements only within this if-block, so needs
                //to be removed once findNumbers() call is completed for that execution
                temp.remove(arr.get(i));
            }
        }
    }

    // Driver Code

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        int sum = 8;

        ArrayList<ArrayList<Integer> > ans
                = combinationSum(arr, sum);

        // If result is empty, then
        if (ans.size() == 0)
        {
            System.out.println("Empty");
            return;
        }

        // print all combinations stored in ans

        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i));
        }
    }
}
