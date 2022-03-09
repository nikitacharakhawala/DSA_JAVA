package javadsa.arrayproblems;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arry=new Integer[n];
        for(int i=0;i<n;i++){
            arry[i]=sc.nextInt();
        }
        int position=sc.nextInt();
        int newElement=sc.nextInt();
        Integer[] newArray=new Integer[n+1];
        for(int i=0;i<n+1;i++){
            if(i<position-1){
                newArray[i]=arry[i];
            }else if(i==position-1){
                newArray[i]=newElement;
            }else{
                newArray[i]=arry[i-1];
            }
            System.out.print(newArray[i]+" ");
        }
    }
}
