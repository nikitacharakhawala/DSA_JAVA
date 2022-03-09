package javadsa.arrayproblems;

import java.util.Scanner;

public class MinMaxOfArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]>max)
                max=array[i];
            if(i==0){
                min=array[i];
            }
            if(array[i]<min && i!=0){
                min=array[i];
            }
        }
        System.out.print(max+" "+min);
    }
}
