package stackqueue;

import java.util.Locale;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
public class Problem1 {

    public static void main(String[] args) {
        String input = "((()[]{}))";
        System.out.println(isValidParentheses(input));
    }

    private static boolean isValidParentheses(String input)
    {
        Stack<Character> st  = new Stack<>();
        char[] inputArr= input.toCharArray();
        for (char c: inputArr)
        {
            if(st.size()>0 && (st.peek()=='{' && c=='}' || st.peek()=='(' && c==')' || st.peek()=='[' && c==']' ))
            {
                st.pop();
                System.out.println("poped - "+c+"; size="+st.size());
            }
            else
            {
                st.push(c);
                System.out.println("pushed - "+c+"; size="+st.size());
            }
        }
        return st.size() == 0 ? true: false;
    }
}
