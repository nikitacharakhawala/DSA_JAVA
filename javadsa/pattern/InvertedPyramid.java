package javadsa.pattern;

import java.lang.*;
import java.util.*;

public class InvertedPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
                if(j!=(i-1)){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}