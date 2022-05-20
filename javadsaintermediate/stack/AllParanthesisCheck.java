package javadsaintermediate.stack;

import java.util.Stack;

/**
 * Q1. Balanced Paranthesis
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
 *
 * Refer to the examples for more clarity.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100
 *
 *
 *
 * Input Format
 * The first and the only argument of input contains the string A having the parenthesis sequence.
 *
 *
 *
 * Output Format
 * Return 0 if the parenthesis sequence is not balanced.
 *
 * Return 1 if the parenthesis sequence is balanced.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = {([])}
 * Input 2:
 *
 *  A = (){
 * Input 3:
 *
 *  A = ()[]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 * Output 3:
 *
 *  1
 *
 *
 * Example Explanation
 * You can clearly see that the first and third case contain valid paranthesis.
 *
 * In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.
 */

public class AllParanthesisCheck {
    Stack s1 = new Stack<>();

    public static void main(String[] args) {
        AllParanthesisCheck paranthesisCheck = new AllParanthesisCheck();
        String A = "(){";
        System.out.println(paranthesisCheck.isAllBalancedParanthesis(A));
    }

    public int isAllBalancedParanthesis(String A){
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='{' || A.charAt(i)=='[' || A.charAt(i)=='('){
                s1.push(A.charAt(i));
            }
            if(s1.isEmpty())
                return 0;
            if(!s1.isEmpty()) {
                if (A.charAt(i) == ')' && (char) s1.peek() == '(')
                    s1.pop();
                if (A.charAt(i) == '}' && (char) s1.peek() == '{')
                    s1.pop();
                if (A.charAt(i) == ']' && (char) s1.peek() == '[')
                    s1.pop();
            }
        }
        return s1.isEmpty() ? 1 : 0;
    }
}
