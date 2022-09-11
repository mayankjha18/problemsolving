package string;

import java.util.*;

/*
Group anagrams
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Problem3 {
    public static void main(String[] args) {
        String[] strs =  {"eat","tea","tan","ate","nat","bat"};
        Map<String, ArrayList<String>> hm = groupAnagrams(strs);
        for(String key: hm.keySet())
        {
            System.out.println(hm.get(key));
        }
    }

    private static Map<String, ArrayList<String>> groupAnagrams(String[] input)
    {
        Map<String, ArrayList<String>> hm = new HashMap<>();
        for(String str: input)
        {
            boolean isAnagram = false;
            for( String key: hm.keySet())
            {
                if(isAnagram(str, key))
                {
                    isAnagram = true;
                    ArrayList<String> angramList = hm.get(key);
                    angramList.add(str);
                    hm.put(key, angramList);
                }
            }
            if(!isAnagram)
            {
                ArrayList<String>  strList = new ArrayList<>();
                strList.add(str);
                hm.put(str, strList);
            }
        }
        return hm;
    }

    private static boolean isAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;

        char[] chArr1  = str1.toCharArray();
        for(char ch : chArr1)
        {
            if(str2.contains(String.valueOf(ch)))
            {
                str2 = str2.replaceFirst(String.valueOf(ch),"");
            }
        }
        if (str2.length()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
