package javaadvanced.stack;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String[] A={"4", "13", "5", "/", "+"};
        System.out.println(getExpressionResult(A));
    }

    public static int getExpressionResult(String[] A){
        Stack<Integer> valueStack=new Stack<>();
        for(String ele: A){
            if(ele!=null && (ele.equals("+") ||  ele.equals("*") ||  ele.equals("/") || ele.equals("-"))){
                int num2=valueStack.pop();
                int num1=valueStack.pop();
                valueStack.push(calculateResult(ele,num1,num2));
            }else{
                valueStack.push(Integer.parseInt(ele));
            }
        }
        return valueStack.pop();

    }

    public static int calculateResult(String op, int num1, int num2){
        switch (op){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
        }
        return 0;
    }
}
