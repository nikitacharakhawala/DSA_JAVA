package javadsaintermediate.stack;


import java.util.Stack;

public class ParanthesisCheck {
    Stack s1=new Stack<>();
    public static void main(String[] args) {
        ParanthesisCheck paranthesisCheck=new ParanthesisCheck();
        String A= "))(())";
        System.out.println(paranthesisCheck.isBalancedParanthesis(A));
    }

    public int isBalancedParanthesis(String A){


        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                s1.push(A.charAt(i));
            }else if(s1.isEmpty()){
                return 0;
            }else if(A.charAt(i)==')'){
                s1.pop();
            }

        }
        return s1.isEmpty() ? 1 : 0;
    }
}
