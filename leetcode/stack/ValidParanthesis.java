package leetcode.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="([{}])";
        System.out.println(isValidParenthesis(s));
    }

    public static boolean isValidParenthesis(String s){
        Stack<Character> parenthesisStack=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                parenthesisStack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')' && parenthesisStack.peek()=='('){
                    parenthesisStack.pop();
                }else if(s.charAt(i)==']' && parenthesisStack.peek()=='['){
                    parenthesisStack.pop();
                }else if(s.charAt(i)=='}' && parenthesisStack.peek()=='{'){
                    parenthesisStack.pop();
                }
                if(parenthesisStack.isEmpty()){
                    return true;
                }
            }
        }

        return false;
    }
}
