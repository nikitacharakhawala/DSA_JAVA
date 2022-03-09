package javadsa.arrayproblems;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
