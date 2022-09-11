package string;

import java.util.Locale;

/*
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("cbbd"));
    }

    private static String longestPalindromicSubstring(String word)
    {
        String largestPalindrome = word.substring(0,1);
        for(int i=0; i<word.length(); i++)
        {
            //This is taking every point one by one and checks if that is  center of a palindrome
           String temp = returnIfPalindromic(word, i);
           if (temp.length() > largestPalindrome.length())
           {
               largestPalindrome = temp;
           }
        }
        return largestPalindrome;
    }

    private static String returnIfPalindromic(String word, int i)
    {
        char[] wordArr = word.toCharArray();
        String maxOddLengthPalindrome  = ""; // when you are looking for palindrome of odd length
        int leftEnd = 0;
        int rightEnd = (2*i > word.length()-1)? word.length()-1 : 2*i;
        int left = i-1;
        int right  = i+1;
        //checking for palindrome of odd length
        while(left >= leftEnd && right <= rightEnd)
        {
            if(wordArr[left] == wordArr[right])
            {
                maxOddLengthPalindrome = word.substring(left, right+1);
                left--;
                right++;
            }
            else
            {
                break;
            }

        }

        String maxEvenLengthPalindrome="";
        //checking for palindrome of even length
        left=i;
        right=i+1;
        while(left >= leftEnd && right <= rightEnd)
        {
            if(wordArr[left] == wordArr[right])
            {
                maxEvenLengthPalindrome = word.substring(left, right+1);
                left--;
                right++;
            }
            else
            {
                break;
            }

        }
        String maxlength = maxEvenLengthPalindrome.length() > maxOddLengthPalindrome.length()? maxEvenLengthPalindrome: maxOddLengthPalindrome;
        return maxlength;
    }

}
