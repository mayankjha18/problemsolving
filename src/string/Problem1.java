package string;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("pwwkew"));
    }

    private static String longestSubstring(String word)
    {
        int start=0;
        String longestsubstring = "";
        String temp="";
        Set<Character> charset = new HashSet<>();
        char[] wordArray = word.toCharArray();
        for(int i=start; i<word.length(); i++)
        {
            if(charset.contains(wordArray[i]))
            {
                i = start+1;
                start++;
                temp = "";
                charset.clear();
            }
            else
            {
                charset.add(wordArray[i]);
                temp += wordArray[i];
            }

            if(temp.length() > longestsubstring.length())
            {
                longestsubstring = temp;
            }
        }

        return longestsubstring;

    }

}
