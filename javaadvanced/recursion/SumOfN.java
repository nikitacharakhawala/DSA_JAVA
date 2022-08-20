package javaadvanced.recursion;

import java.awt.*;

public class SumOfN {
    public static void main(String[] args) {
        int n=10;
        System.out.println(getSum(n));

    }

    public static int getSum(int n){
        if(n==0)
            return 0;
        return getSum(n-1)+n;
    }
}
