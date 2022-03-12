package javadsa.pattern;

import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFibPyramid(n);
    }

    public static void printFibPyramid(int n){
        Integer[] fib=getFibonacciNumbers(n*(n+1)/2);
        int fibNum=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fib[fibNum]+" ");
                fibNum++;
            }
            System.out.println();
        }

    }

    public static Integer[] getFibonacciNumbers(int n){
        int totalNums=n*(n+1)/2;
        Integer[] fib=new Integer[totalNums];
        fib[1]=0;
        fib[2]=1;
        if(n<=2)
            return fib;
        for(int i=3;i<totalNums;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;
    }
}
