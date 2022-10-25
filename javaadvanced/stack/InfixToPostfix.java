package javaadvanced.stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String A="o^(q*s*b)^f-(q^u+f)+s-(t+v^b)";
        InfixToPostfix ip=new InfixToPostfix();
        System.out.println(ip.solve(A));
    }

    public static String solve(String A) {
        StringBuilder output=new StringBuilder();
        Stack<Character> opStack=new Stack<>();
        HashMap<Character, Integer> precendenceMap=getPrecedence();

        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                output.append(A.charAt(i));
            }else if(A.charAt(i)=='('){
                opStack.push(A.charAt(i));
            }else if(A.charAt(i)==')'){
                while(!opStack.isEmpty() && opStack.peek()!='('){
                    output.append(opStack.pop());
                }
                opStack.pop();
             //   System.out.println("op:::"+opStack);
            }else{
              //  System.out.println("op1:::"+opStack+":::"+precendenceMap);
                while(!opStack.isEmpty() && opStack.peek()!='(' && precendenceMap.get(opStack.peek())<=precendenceMap.get(A.charAt(i))){
                    output.append(opStack.pop());
                }
                opStack.push(A.charAt(i));
               // System.out.println("op2:::"+opStack);
            }
           // System.out.println("op3:::"+opStack);
        }
        while(!opStack.isEmpty()){
            output.append(opStack.pop());
        }
        return output.toString();
    }

    public static HashMap<Character, Integer> getPrecedence(){
        HashMap<Character, Integer> precendenceMap=new HashMap<>();
        precendenceMap.put('^', 1);
        precendenceMap.put('/', 2);
        precendenceMap.put('*', 2);
        precendenceMap.put('+', 3);
        precendenceMap.put('-', 3);
        return precendenceMap;

    }
}
