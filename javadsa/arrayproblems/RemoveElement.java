package javadsa.arrayproblems;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int position=sc.nextInt();
        for(int i=position-1;i<n-1;i++){
            array[i]=array[i+1];
        }
        array[n-1]=0;
        for(int i=0;i<n-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}
