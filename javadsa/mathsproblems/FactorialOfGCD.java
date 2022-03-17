package javadsa.mathsproblems;

import java.util.Scanner;

public class FactorialOfGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(factorial(findGCD(a, b)));

    }

    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
