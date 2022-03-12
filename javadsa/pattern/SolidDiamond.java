package javadsa.pattern;

import java.util.Scanner;

public class SolidDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDiamond(n);
    }
    public static void printDiamond(int n){
        for(int i=0;i<n;i++){
            for(int space=n-i-1; space>0;space--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int space=0;
        for(int i=n;i>0;i--){
            for(int x=1; x<=space;x++){
                System.out.print(" ");
            }
            space++;
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
