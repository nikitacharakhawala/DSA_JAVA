package javadsa.pattern;

import java.util.Scanner;

public class DifferentPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDifferentPattern(n);
    }

    public static void printDifferentPattern(int n){

        for(int i=1;i<=n;i++){
            int num=n-i+1;
            for(int space=0; space<n-i;space++){
                System.out.print("0 ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(num+" ");
                num+=n-i+1;
            }
            for(int space=0; space<n-i;space++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
