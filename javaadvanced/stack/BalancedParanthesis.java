package javaadvanced.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String A="{([])}";
        System.out.println(isBalancedParanthesis(A));
    }

    public static int isBalancedParanthesis(String A){
        if(A==null || A.length()==1){
            return 0;
        }
        Stack<Character> paranthesisStack=new Stack<>();
        HashMap<Character, Character> paranthesisMap=new HashMap<>();
        paranthesisMap.put(')','(');
        paranthesisMap.put(']','[');
        paranthesisMap.put('}','{');
        for(int i=0;i<A.length();i++){
            if(!paranthesisStack.isEmpty() && paranthesisMap.get(A.charAt(i))==paranthesisStack.peek()){
                paranthesisStack.pop();
            }else{
                paranthesisStack.push(A.charAt(i));
            }
          //  System.out.println(paranthesisStack);
        }
        if(paranthesisStack.isEmpty()){
            return 1;
        }
        return 0;
    }
}
