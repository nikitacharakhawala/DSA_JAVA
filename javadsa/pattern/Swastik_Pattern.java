package javadsa.pattern;

import java.util.Scanner;

public class Swastik_Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n*2;i++){
            for(int j=0;j<=n*2;j++){
               if((i<n && j==0) || (i==n) || (j==n) || (i==0 && j>n) || (i==n*2 && j<n) || (j==n*2 && i>n)){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
