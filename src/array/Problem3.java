package array;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class Problem3 {

    public static void main(String[] args) {
        int[] input  = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestSum(input));
    }

    private static int largestSum(int[] input)
    {
        int highestSum =0;
        int  sumSofar = 0;
        int i=0;
        for(; i<input.length; i++)
        {
           sumSofar += input[i];
           if(sumSofar < 0)
           {
              sumSofar = 0;
           }
           else
           {
               if(sumSofar > highestSum)
               {
                   highestSum = sumSofar;
               }
           }
        }

        return highestSum;
    }
}
