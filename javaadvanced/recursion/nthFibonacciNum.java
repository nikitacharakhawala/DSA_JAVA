package javaadvanced.recursion;

public class nthFibonacciNum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(getNthFibNum(n));
    }

    public static int getNthFibNum(int n){
        if(n<=1){
            return n;
        }

        return getNthFibNum(n-1)+getNthFibNum(n-2);
    }
}
