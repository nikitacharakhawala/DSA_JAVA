package javaadvanced.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        String A="ab";
        System.out.println(doubleCharacterTrouble(A));
    }

    public static String doubleCharacterTrouble(String A) {
        Stack<Character> stringStack=new Stack<>();
        for(int i=0;i<A.length();i++){
            if(stringStack.isEmpty()){
                stringStack.push(A.charAt(i));
            }else if(stringStack.peek()==A.charAt(i)){
                stringStack.pop();
            }else{
                stringStack.push(A.charAt(i));
            }
        }
        StringBuilder finalString=new StringBuilder();
        while(!stringStack.isEmpty()){
            finalString.append(stringStack.peek());
            stringStack.pop();
        }
        return finalString.reverse().toString();
    }
}
