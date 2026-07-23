package com.example.DSA.Day2;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 */
public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(isBracketOpen(i)){
                st.push(i);
            }
            else {
                if(st.size()==0){
                    return false;
                }else {
                    if(isBracketClosed(st.peek(),i)){
                        st.pop();
                    }else  {
                        return false;
                    }
                }
            }
        }
        return st.size()==0;
    }

    private boolean isBracketClosed(char c, char d) {
        if(c=='(' && d==')'){
            return true;
        }else if(c=='[' && d==']'){
            return true;
        }else if(c=='{' && d=='}'){
            return true;
        }else {
            return false;
        }
    }

    private boolean isBracketOpen(char c) {
        switch (c){
            case '(':
                case '[':
                    case '{':
                        return true;
                        default: return false;
        }
    }

    public static void main(String[] args) {
        ValidParentheses p=new ValidParentheses();
        System.out.println(p.isValid("()"));
    }
}
