package array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        findTriplets(nums);
    }

    private static void findTriplets(int[] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            int sum = nums[i];
            Set<Integer> numSet = new HashSet<>();
            for(int j=i+1; j<nums.length ; j++)
            {
                if(numSet.contains(sum - nums[j]))
                {
                    System.out.println("Found triplets :"+ nums[i]+","+nums[j]+","+(sum - nums[j]));
                }
                else {
                    numSet.add(nums[j]);
                }
            }

        }
    }
}
